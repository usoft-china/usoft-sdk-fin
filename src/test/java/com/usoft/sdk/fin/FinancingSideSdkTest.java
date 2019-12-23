package com.usoft.sdk.fin;

import com.usoft.fin.external.open.factoring.api.protobuf.GetFinanceSideDemandsReq;
import com.usoft.fin.external.open.factoring.api.protobuf.GetFinanceSideDemandsResp;
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
		req.setEnuu(10042875);
		GetFinanceSideDemandsResp resp = financingSideSdk.getFinanceSideDemands(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}
}
