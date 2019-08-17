package com.bmw.dto;

import java.util.List;

public class OrderDTO {
	private String dealerId;
	private String apw;
	private String orderId;
	private String brand;
	private String modelCode;
	private String upholsteryCode;
	private String upholsteryDesc;
	private String addCodes;
	private List<String> addDescs;
	private Float addPrice;
	private Float price;
	private Float totalPrice;
	private String configCode;
	private String dealerStatus;
	private String materialsId;
	private Integer remain;
	private Integer totalRemain;
	private String upholsteryCodeT;
	private String upholsteryDescT;
	private String addCodesT;
	private List<String> addDescsT;
	private String colorCode;
	private String colorDesc;
	private String colorCodeT;
	private String colorDescT;
	private String configCodeT;

	private Boolean upholsteryMatched;
	private Boolean addCodeMatched;
	private Boolean configCodeMatched;
	private Boolean colorMatched;
	private Boolean matched;


	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public String getApw() {
		return apw;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
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
	public Float getAddPrice() {
		return addPrice;
	}
	public void setAddPrice(Float addPrice) {
		this.addPrice = addPrice;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDealerStatus() {
		return dealerStatus;
	}
	public void setDealerStatus(String dealerStatus) {
		this.dealerStatus = dealerStatus;
	}
	public String getMaterialsId() {
		return materialsId;
	}
	public void setMaterialsId(String materialsId) {
		this.materialsId = materialsId;
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
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
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
	public String getConfigCode() {
		return configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	public String getUpholsteryCodeT() {
		return upholsteryCodeT;
	}
	public void setUpholsteryCodeT(String upholsteryCodeT) {
		this.upholsteryCodeT = upholsteryCodeT;
	}
	public String getUpholsteryDescT() {
		return upholsteryDescT;
	}
	public void setUpholsteryDescT(String upholsteryDescT) {
		this.upholsteryDescT = upholsteryDescT;
	}
	public String getAddCodesT() {
		return addCodesT;
	}
	public void setAddCodesT(String addCodesT) {
		this.addCodesT = addCodesT;
	}
	public List<String> getAddDescsT() {
		return addDescsT;
	}
	public void setAddDescsT(List<String> addDescsT) {
		this.addDescsT = addDescsT;
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
	public String getColorCodeT() {
		return colorCodeT;
	}
	public void setColorCodeT(String colorCodeT) {
		this.colorCodeT = colorCodeT;
	}
	public String getColorDescT() {
		return colorDescT;
	}
	public void setColorDescT(String colorDescT) {
		this.colorDescT = colorDescT;
	}
	public String getConfigCodeT() {
		return configCodeT;
	}
	public void setConfigCodeT(String configCodeT) {
		this.configCodeT = configCodeT;
	}
	public Boolean getUpholsteryMatched() {
		return upholsteryMatched;
	}
	public void setUpholsteryMatched(Boolean upholsteryMatched) {
		this.upholsteryMatched = upholsteryMatched;
	}
	public Boolean getAddCodeMatched() {
		return addCodeMatched;
	}
	public void setAddCodeMatched(Boolean addCodeMatched) {
		this.addCodeMatched = addCodeMatched;
	}
	public Boolean getConfigCodeMatched() {
		return configCodeMatched;
	}
	public void setConfigCodeMatched(Boolean configCodeMatched) {
		this.configCodeMatched = configCodeMatched;
	}
	public Boolean getColorMatched() {
		return colorMatched;
	}
	public void setColorMatched(Boolean colorMatched) {
		this.colorMatched = colorMatched;
	}
	public Boolean getMatched() {
		return matched;
	}
	public void setMatched(Boolean matched) {
		this.matched = matched;
	}

}
