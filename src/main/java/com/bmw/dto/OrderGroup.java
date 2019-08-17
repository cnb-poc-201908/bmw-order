package com.bmw.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OrderGroup {
	private String groupId;
	private Float totalPrice;
	private Integer matchRate;
	private Integer amount;
	private List<OrderDTO> orders;

	private String upholsteryCode;
	private String upholsteryDesc;
	private String addCodes;
	private List<String> addDescs;
	private String colorCode;
	private String colorDesc;
	private String configCode;
	private String configDesc;
	private Integer remain;
	private Integer totalRemain;
	private String orderIds;

	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getMatchRate() {
		return matchRate;
	}
	public void setMatchRate(Integer matchRate) {
		this.matchRate = matchRate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public List<OrderDTO> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}
	public String getUpholsteryCode() {
		return upholsteryCode;
	}
	public void setUpholsteryCode(String upholsteryCode) {
		this.upholsteryCode = upholsteryCode;
	}
	public String getUpholsteryDesc() {
		return upholsteryDesc;
	}
	public void setUpholsteryDesc(String upholsteryDesc) {
		this.upholsteryDesc = upholsteryDesc;
	}
	public String getAddCodes() {
		return addCodes;
	}
	public void setAddCodes(String addCodes) {
		this.addCodes = addCodes;
	}
	public List<String> getAddDescs() {
		return addDescs;
	}
	public void setAddDescs(List<String> addDescs) {
		this.addDescs = addDescs;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public String getColorDesc() {
		return colorDesc;
	}
	public void setColorDesc(String colorDesc) {
		this.colorDesc = colorDesc;
	}
	public String getConfigCode() {
		return configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	public String getConfigDesc() {
		return configDesc;
	}
	public void setConfigDesc(String configDesc) {
		this.configDesc = configDesc;
	}
	public Integer getRemain() {
		return remain;
	}
	public void setRemain(Integer remain) {
		this.remain = remain;
	}
	public Integer getTotalRemain() {
		return totalRemain;
	}
	public void setTotalRemain(Integer totalRemain) {
		this.totalRemain = totalRemain;
	}
	public String getOrderIds() {
		return orderIds;
	}
	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
