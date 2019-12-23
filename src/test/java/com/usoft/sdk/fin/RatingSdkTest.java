/*
package com.usoft.sdk.fin;

import com.usoft.RespHeader.external.open.api.protobuf.GetRatingEntReq;
import com.usoft.erm.external.open.api.protobuf.GetRatingEntResp;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

*/
/**
 * @author: wangcanyi
 * @date: 2019-12-13 14:20
 **//*

public class RatingSdkTest {
	*/
/**
	 * 测试地址
	 *//*

	private RatingSdk ratingSdk = new RatingSdk("https://ermrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

	*/
/**
	 * 正式地址
	 *//*

//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");
	@Test
	public void getRatingEnt() throws Exception {
		GetRatingEntReq.Builder req = GetRatingEntReq.newBuilder();
		//req.setEnuu(10000666);
		req.setEnuu(10042875);
		GetRatingEntResp resp = ratingSdk.getRatingEnt(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}
}
*/
