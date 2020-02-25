package com.usoft.sdk.fin.client;


import com.usoft.fin.external.open.factoring.api.protobuf.*;
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
	 * [查看融资记录列表]
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


	/**
	 * [查看融资记录详情]
	 * @author: liuzx
	 * @date: 2019/12/23
	 **/
	public GetFinanceDemandDetailResp getFinanceDemandDetail(GetFinanceDemandDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/factoring/demandDetail";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetFinanceDemandDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceDemandDetailResp.newBuilder(), respJson);
		return resp.build();
	}


	/**
	 * [同意洽谈-报价]
	 * @author: liuzx
	 * @date: 2019/12/23
	 **/
		public AgreeDiscussResp agreeDiscuss(AgreeDiscussReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/factoring/agreeDiscuss";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
			AgreeDiscussResp.Builder resp = ProtoBufUtil.toProtoBuf(AgreeDiscussResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * [确认收款]
	 * @author: linjh
	 * @date: 2020/2/24
	 **/
	public SaveConfirmReceiptResp saveConfirmReceipt(SaveConfirmReceiptReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/factoring/saveConfirmReceipt";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		SaveConfirmReceiptResp.Builder resp = ProtoBufUtil.toProtoBuf(SaveConfirmReceiptResp.newBuilder(), respJson);
		return resp.build();
	}
}
