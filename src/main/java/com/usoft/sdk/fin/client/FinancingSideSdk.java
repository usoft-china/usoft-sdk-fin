package com.usoft.sdk.fin.client;


import com.usoft.fin.external.open.factoring.api.protobuf.GetFinanceSideDemandsReq;
import com.usoft.fin.external.open.factoring.api.protobuf.GetFinanceSideDemandsResp;
import com.usoft.sdk.fin.utils.HttpUtil;
import com.usoft.sdk.fin.utils.ProtoBufUtil;

import java.util.Map;

/**
 * @author: wangcanyi
 * @date: 2019-12-19 14:28
 **/
public class FinancingSideSdk extends BaseSdk {
	public FinancingSideSdk(String baseUrl, String secretId, String secretKey) {
		super(baseUrl, secretId, secretKey);
	}

	public FinancingSideSdk(String baseUrl, String secretId, String secretKey, int timeout) {
		super(baseUrl, secretId, secretKey, timeout);
	}



	/**
	 * [查看发布的需求]
	 * @author: liuzx
	 * @date: 2019/12/23
	 **/
	public GetFinanceSideDemandsResp getFinanceSideDemands(GetFinanceSideDemandsReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/factoring/fsDemands";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetFinanceSideDemandsResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceSideDemandsResp.newBuilder(), respJson);
		return resp.build();
	}

//	/**
//	 * Json Post 例子
//	 *
//	 * @param req
//	 * @return
//	 */
//	public BatchUpdateOrderResp batchUpdateOrder(BatchUpdateOrderReq.Builder req) throws Exception {
//		String url = baseUrl + "/openapi/trade/order/batch/update";
//		String paramJson = genSignToJson(req);
//		String respJson = HttpUtil.doPost(url, paramJson, timeout);
//		BatchUpdateOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchUpdateOrderResp.newBuilder(), respJson);
//		return resp.build();
//	}
}
