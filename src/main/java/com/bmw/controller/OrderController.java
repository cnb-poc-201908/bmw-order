package com.bmw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.dto.OrderGroup;
import com.bmw.entity.Materials;
import com.bmw.entity.response.RestResponse;
import com.bmw.service.MaterialService;
import com.bmw.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController("Order template endpoints")
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private MaterialService materialService;

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/{dearlerId}", produces = "application/json")
	@ApiOperation(value = "供应商订单列表接口")
	public RestResponse<Object> getOrders(
			@PathVariable(value = "dearlerId", required = true) String dearlerId) {
		return new RestResponse<>();
	}

	@GetMapping(value = "/materials", produces = "application/json")
	@ApiOperation(value = "物料列表接口")
	public RestResponse<List<Materials>> getOrders() {
		RestResponse<List<Materials>> response = new RestResponse<>();
		response.setData(materialService.getMaterialsList());
		return response;
	}

	@GetMapping(value = "/unconfirmed", produces = "application/json")
	@ApiOperation(value = "待确定订单列表接口")
	public RestResponse<List<OrderGroup>> getUnconfirmedOrderList(
			@RequestParam(value = "dealerId", required = true) String dealerId){
		RestResponse<List<OrderGroup>> response = new RestResponse<>();
		response.setData(orderService.getUnconfirmedOrderList(dealerId));
		return response;
	}
}
