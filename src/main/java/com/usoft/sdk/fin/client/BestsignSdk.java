package com.usoft.sdk.fin.client;


import com.usoft.fin.external.open.factoring.api.protobuf.*;
import com.usoft.sdk.fin.utils.HttpUtil;
import com.usoft.sdk.fin.utils.ProtoBufUtil;

import java.util.Map;


/**
 * [上上签业务SDK接口]
 * @author: liuzx
 * @date: 2020/5/14
 **/
public class BestsignSdk extends BaseSdk {
	public BestsignSdk(String baseUrl, String secretId, String secretKey) {
		super(baseUrl, secretId, secretKey);
	}

	public BestsignSdk(String baseUrl, String secretId, String secretKey, int timeout) {
		super(baseUrl, secretId, secretKey, timeout);
	}

	/**
	 * [第三方获取需要签约的合同列表]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	public GetThreePartyContractListResp getThreePartyContractList(GetThreePartyContractListReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/bestsign/getThreePartyContractList";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetThreePartyContractListResp.Builder resp = ProtoBufUtil.toProtoBuf(GetThreePartyContractListResp.newBuilder(), respJson);
		return resp.build();
	}


	/**
	 * [第三方获取待签约合同数量]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	public GetThreePartyContractCountResp getThreePartyContractCount(GetThreePartyContractCountReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/bestsign/getThreePartyContractCount";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetThreePartyContractCountResp.Builder resp = ProtoBufUtil.toProtoBuf(GetThreePartyContractCountResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * [合同管理、签署、查看]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	public ContractTargetPageResp contractTargetPage(ContractTargetPageReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/bestsign/contractTargetPage";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		ContractTargetPageResp.Builder resp = ProtoBufUtil.toProtoBuf(ContractTargetPageResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * [下载合同]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	public ContractDownLoadFileResp contractDownLoadFile(ContractDownLoadFileReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/bestsign/contractDownLoadFile";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		ContractDownLoadFileResp.Builder resp = ProtoBufUtil.toProtoBuf(ContractDownLoadFileResp.newBuilder(), respJson);
		return resp.build();
	}

}
