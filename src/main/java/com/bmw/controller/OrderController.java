package com.bmw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.entity.response.RestResponse;

import io.swagger.annotations.ApiOperation;

@RestController("Order template endpoints")
@RequestMapping("/orders")
public class OrderController {
	@GetMapping(value = "/{dearlerId}", produces = "application/json")
	@ApiOperation(value = "供应商订单列表接口")
	public RestResponse<Object> getOrders(
			@PathVariable(value = "dearlerId", required = true) String dearlerId) {

		return new RestResponse<>();
	}
}
