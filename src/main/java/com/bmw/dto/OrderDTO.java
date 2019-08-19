package com.bmw.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
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
	private String configDesc;
	private String dealerStatus;
	private String materialsId;
	private String upholsteryCodeT;
	private String upholsteryDescT;
	private String addCodesT;
	private List<String> addDescsT;
	private String colorCode;
	private String colorDesc;
	private String colorCodeT;
	private String colorDescT;
	private String configCodeT;
	private String configDescT;
	private String vin;

	private String dealerName;
	private String region;
	private String province;
	private String yearType;
	private String matchStatus;

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
	public String getConfigDesc() {
		return configDesc;
	}
	public void setConfigDesc(String configDesc) {
		this.configDesc = configDesc;
	}
	public String getConfigDescT() {
		return configDescT;
	}
	public void setConfigDescT(String configDescT) {
		this.configDescT = configDescT;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getYearType() {
		return yearType;
	}
	public void setYearType(String yearType) {
		this.yearType = yearType;
	}
	public String getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

}
