package com.bmw.mapper;

import java.util.List;
import java.util.Map;

import com.bmw.dto.OrderDTO;
import com.bmw.dto.OrderGroup;

public interface OrderMapper {

    List<OrderDTO> getUnconfirmedOrderList(Map<String, String> paramMap);

    List<OrderGroup> getUnpaidOrderGroups(Map<String, String> paramMap);

    List<OrderGroup> getRemains(Map<String, String> paramMap);

    List<OrderDTO> getUnpaidOrdersByGroup(Map<String, String> paramMap);

    void updateOrderStatus(Map<String, Object> paramMap);
}