package com.bmw.dto;

import java.util.List;

public class OrderGroup {
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

}
