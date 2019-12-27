package com.usoft.sdk.fin;

import com.usoft.fin.external.open.factoring.api.protobuf.*;
import com.usoft.sdk.fin.client.FinancingSideSdk;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;


/**
 * @author: liuzx
 * @date: 2019/12/23
 **/

public class FinancingSideSdkTest {
/**
	 * 测试地址
	 */

	private FinancingSideSdk financingSideSdk = new FinancingSideSdk("https://finrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

	/**
	 * 获取融资需求列表
	 */

	@Test
	public void getFinanceSideDemands() throws Exception {
		GetFinanceSideDemandsReq.Builder req = GetFinanceSideDemandsReq.newBuilder();
		req.setEnuu(10005285).setPageNumber(1).setPageSize(10);
		GetFinanceSideDemandsResp resp = financingSideSdk.getFinanceSideDemands(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	/**
	 * 获取融资需求详情
	 */
	@Test
	public void getFinanceDemandDetail() throws Exception {
		GetFinanceDemandDetailReq.Builder req = GetFinanceDemandDetailReq.newBuilder();
		req.setCode("73191213622315887608").setEnuu(10042875);
		GetFinanceDemandDetailResp resp = financingSideSdk.getFinanceDemandDetail(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	/**
	 * [同意洽谈-报价]
	 * @author: liuzx
	 * @date: 2019/12/23
	 **/
	@Test
	public void agreeDiscuss() throws Exception {
		AgreeDiscussReq.Builder req = AgreeDiscussReq.newBuilder();
		req.setOfferCode("71191224715477669110").setEnuu(10042875).setUu(1000027739);
		AgreeDiscussResp resp = financingSideSdk.agreeDiscuss(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}
}