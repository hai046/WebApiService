package com.longbeach.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonUtils {

	public static String JSON_FILED_STATUS = "status";
	public static String JSON_FILED_DATA = "data";
	public static String JSON_FILED_ERR_MSG = "err_msg";

	public static String getResultByJson(Object obj) {
		JSONObject result = new JSONObject();
		result.put(JSON_FILED_STATUS, 200);
		result.put(JSON_FILED_DATA, obj);
		return result.toJSONString();

	}

	public static String getErrorResultByJson(String errMsg) {
		JSONObject result = new JSONObject();
		result.put(JSON_FILED_STATUS, -1);
		result.put(JSON_FILED_ERR_MSG, errMsg);
		return result.toJSONString();
	}

}
