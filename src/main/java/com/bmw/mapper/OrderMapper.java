package com.bmw.mapper;

import java.util.List;
import java.util.Map;

import com.bmw.dto.OrderDTO;

public interface OrderMapper {

    List<OrderDTO> getUnconfirmedOrderList(Map paramMap);
}