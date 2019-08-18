package com.bmw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.dto.OrderFlow;
import com.bmw.dto.OrderGroup;
import com.bmw.entity.response.RestResponse;
import com.bmw.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController("Order template endpoints")
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/unconfirmed", produces = "application/json")
	@ApiOperation(value = "待确定订单列表接口")
	public RestResponse<List<OrderGroup>> getUnconfirmedOrderList(
			@RequestParam(value = "dealerId", required = true) String dealerId){
		RestResponse<List<OrderGroup>> response = new RestResponse<>();
		response.setData(orderService.getUnconfirmedOrderList(dealerId));
		return response;
	}

	@GetMapping(value = "/unpaid", produces = "application/json")
	@ApiOperation(value = "未支付订单列表接口")
	public RestResponse<List<OrderGroup>> getUnpaidOrderList(
			@RequestParam(value = "dealerId", required = true) String dealerId){
		RestResponse<List<OrderGroup>> response = new RestResponse<>();
		response.setData(orderService.getUnpaidOrderGroups(dealerId));
		return response;
	}

	@GetMapping(value = "/remains", produces = "application/json")
	@ApiOperation(value = "库存数目列表接口")
	public RestResponse<List<OrderGroup>> getRemains(
			@RequestParam(value = "dealerId", required = true) String dealerId){
		RestResponse<List<OrderGroup>> response = new RestResponse<>();
		response.setData(orderService.getRemains(dealerId));
		return response;
	}

	@PutMapping(value = "/status/change/{status}", produces = "application/json")
	@ApiOperation(value = "更改订单状态接口")
	public RestResponse<Object> updateOrderStatus(
			@PathVariable(value = "status", required = true) String status,
			@RequestBody List<String> orderIdsList){
		orderService.updateOrderStatus(status, orderIdsList);
		return new RestResponse<>();
	}

	@GetMapping(value = "/paid", produces = "application/json")
	@ApiOperation(value = "已支付订单列表接口")
	public RestResponse<List<OrderGroup>> getPaidOrderList(
			@RequestParam(value = "dealerId", required = true) String dealerId){
		RestResponse<List<OrderGroup>> response = new RestResponse<>();
		response.setData(orderService.getPaidOrderList(dealerId));
		return response;
	}

	@GetMapping(value = "/orderflows", produces = "application/json")
	@ApiOperation(value = "订单流向列表接口")
	public RestResponse<Map<String, List<OrderFlow>>> getOrderFlows(
			@RequestParam(value = "matchStatus", required = true) String matchStatus){
		RestResponse<Map<String, List<OrderFlow>>> response = new RestResponse<>();
		response.setData(orderService.getOrderFlows(matchStatus));
		return response;
	}
}
