package com.bmw.common;

import java.util.HashMap;
import java.util.Map;

public class BMWPocConstants {

	private BMWPocConstants() {

	}

	public static final String ACCEPT_LANG_ZH_CH = "zh-CN";
	public static final String API_V1 = "/v1";
	public static final String API_V2 = "/v2";
	public static final String KEY_NAME_VALUE = "value";
	public static final Integer REST_ERROR_CODE = -1;
	public static final Integer REST_SUCCESS_CODE = 0;
	public static final Integer REPAIRORDER_PAGE_SIZE = 200;
	public static final String DEFAULT_JULIAN_DATE = "2458000";
	public static final String VALUE_OF_NOADD = "N";
	public static final String ADD_SEPARATOR = "-";
	public static final String ORDER_ID_SEPARATOR = "-";
	public static final String VIN_PREFIX = "WBAHN81027DT22";
	//车型附加配置项
	public static final Map<String, String> ADDS = new HashMap<>();
	public static final Map<String, String> UPHOLSTERIES = new HashMap<>();
	public static final Map<String, String> COLORS = new HashMap<>();
	public static final Map<String, String> CONFIGS = new HashMap<>();

	static {
		ADDS.put("ZWP", "Winter");
		ADDS.put("ZCC", "Convenience");
		ADDS.put("544", "Cruise control with braking function");
		ADDS.put("488", "Lumbar support for driver and front passenger");
		ADDS.put("ZNP", "Innovation");
		ADDS.put("ZMP", "Entertainment");
		ADDS.put("676", "HiFi loudspeaker system");
		ADDS.put("6WB", "Multifunctional instrument display");

		UPHOLSTERIES.put("KCMY", "Sensatec Moccha");
		UPHOLSTERIES.put("KCSW", "Sensatec black");
		UPHOLSTERIES.put("LCL5", "LC Dakota Coral Red Black Highlight");
		UPHOLSTERIES.put("LCMY", "Leather Dakota Mocha");

		COLORS.put("300", "Snowwhite");
		COLORS.put("475", "Black");
		COLORS.put("A72", "Cashmere Silver");
		COLORS.put("A75", "Melbourne Red");
		COLORS.put("A96", "Mineral White");
		COLORS.put("B45", "Estoril Blue");
		COLORS.put("C25", "Royal Burgundy Red");
		COLORS.put("C2P", "Atlas Cedar");

		CONFIGS.put("ZLU", "320Li Luxury");
		CONFIGS.put("ZLS", "320Li Lifestyle");
		CONFIGS.put("ZOM", "320Li MSP");
		CONFIGS.put("ZMC", "320Li MSP Chrome");
		CONFIGS.put("ZSM", "320Li MSP Darkedition");
	}
}
