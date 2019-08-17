package com.bmw.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmw.common.BMWPocConstants;
import com.bmw.dto.OrderDTO;
import com.bmw.dto.OrderGroup;
import com.bmw.mapper.OrderMapper;

@Service
public class OrderService {

	private static Logger logger = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private OrderMapper orderMapper;

	public List<OrderGroup> getUnconfirmedOrderList(String dealerId){
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("dealerId", dealerId);
		List<OrderDTO> orders = orderMapper.getUnconfirmedOrderList(paramMap);

		processUnconfirmedOrders(orders);
		Map<String, OrderGroup> groupMap = new HashMap<>();
		return groupOrders(orders, groupMap);


	}

	private List<OrderGroup> groupOrders(List<OrderDTO> orders, Map<String, OrderGroup> groupMap) {
		for(OrderDTO order : orders) {
			StringBuilder sb = new StringBuilder();
			sb.append(order.getConfigCodeT())
			  .append(order.getColorCodeT())
			  .append(order.getUpholsteryCodeT())
			  .append(order.getAddCodesT());
			String groupId = sb.toString();
			OrderGroup group = groupMap.get(groupId);
			if(group == null) {
				group = new OrderGroup();
				groupMap.put(groupId, group);
			}
			List<OrderDTO> ordersInGroup = null;
			if(group.getOrders() == null) {
				ordersInGroup = new ArrayList<>();
				group.setOrders(ordersInGroup);
			}else {
				ordersInGroup = group.getOrders();
			}
			ordersInGroup.add(order);
			group.setAddCodes(order.getAddCodesT());
			group.setAddDescs(order.getAddDescsT());
			group.setColorCode(order.getColorCodeT());
			group.setColorDesc(order.getColorCodeT());
			group.setConfigCode(order.getConfigCodeT());
			group.setConfigDesc(order.getConfigDescT());
			group.setUpholsteryCode(order.getUpholsteryCodeT());
			group.setUpholsteryDesc(order.getUpholsteryDescT());

		}

		List<OrderGroup> list = new ArrayList<>(groupMap.values());
		for(OrderGroup group: list) {
			List<OrderDTO> ordersInGroup = group.getOrders();
			if(ordersInGroup != null) {
				int unmatchAmount = 0;
				Float totalPrice = 0f;
				for(OrderDTO order: ordersInGroup) {
					if(!order.getMatched()) {
						unmatchAmount++;
					}
					logger.debug("totalPrice: {}", totalPrice);
					logger.debug("order.totalPrice: {}", order.getTotalPrice());
					totalPrice += order.getTotalPrice();
				}
				group.setAmount(group.getOrders().size());
				logger.info("unmatchAmount {}", unmatchAmount);

				Integer rate = Math.round((1f - (float)unmatchAmount/group.getAmount())*100);
				group.setMatchRate(rate);
				group.setTotalPrice(totalPrice);
			}

		}
		return list;
	}

	private void processUnconfirmedOrders(List<OrderDTO> orders) {
		for(OrderDTO order : orders) {
			//处理实际总价以及加装配置描述
			String addCodes = order.getAddCodes();
			order.setTotalPrice(order.getPrice() + order.getAddPrice());
			if(StringUtils.isNotBlank(addCodes) && !addCodes.equals(BMWPocConstants.VALUE_OF_NOADD)) {
				String[] codes = addCodes.split(BMWPocConstants.ADD_SEPARATOR);
				List<String> addDescs = new ArrayList<>();
				for(String code : codes) {
					addDescs.add(BMWPocConstants.ADDS.get(code));
				}
				order.setAddDescs(addDescs);
			}
			//处理实际车型描述
			order.setConfigDesc(BMWPocConstants.CONFIGS.get(order.getConfigCode()));
			//处理目标加装配置描述
			String addCodesT = order.getAddCodesT();
			if(StringUtils.isNotBlank(addCodesT) && !addCodesT.equals(BMWPocConstants.VALUE_OF_NOADD)) {
				String[] codesT = addCodesT.split(BMWPocConstants.ADD_SEPARATOR);
				List<String> addDescsT = new ArrayList<>();
				for(String codeT : codesT) {
					addDescsT.add(BMWPocConstants.ADDS.get(codeT));
				}
				order.setAddDescsT(addDescsT);
			}
			//设置目标颜色描述
			order.setColorDescT(BMWPocConstants.COLORS.get(order.getColorCodeT()));

			//设置目标内饰描述
			order.setUpholsteryDescT(BMWPocConstants.UPHOLSTERIES.get(order.getUpholsteryCodeT()));

			//设置目标车型描述
			order.setConfigDescT(BMWPocConstants.CONFIGS.get(order.getConfigCodeT()));

			order.setMatched(Boolean.TRUE);
			//判断加装配置是否匹配
			if(StringUtils.isNotBlank(order.getAddCodes()) && order.getAddCodes().equals(order.getAddCodesT())) {
				order.setAddCodeMatched(Boolean.TRUE);
			}else {
				order.setAddCodeMatched(Boolean.FALSE);
				order.setMatched(Boolean.FALSE);
			}

			//判断颜色是否匹配
			if(StringUtils.isNotBlank(order.getColorCode()) && order.getColorCode().equals(order.getColorCodeT())) {
				order.setColorMatched(Boolean.TRUE);
			}else {
				order.setColorMatched(Boolean.FALSE);
				order.setMatched(Boolean.FALSE);
			}

			//判断车型是否匹配
			if(StringUtils.isNotBlank(order.getConfigCode()) && order.getConfigCode().equals(order.getConfigCodeT())) {
				order.setConfigCodeMatched(Boolean.TRUE);
			}else {
				order.setConfigCodeMatched(Boolean.FALSE);
				order.setMatched(Boolean.FALSE);
			}

			//判断内饰是否匹配
			if(StringUtils.isNotBlank(order.getUpholsteryCode()) && order.getUpholsteryCode().equals(order.getUpholsteryCodeT())) {
				order.setUpholsteryMatched(Boolean.TRUE);
			}else {
				order.setUpholsteryMatched(Boolean.FALSE);
				order.setMatched(Boolean.FALSE);
			}
		}
	}


	public List<OrderGroup> getUnpaiedOrderList(){

		return null;
	}

	/*
	public List<OrderDTO> getPaiedOrderList(){

	}*/
}
