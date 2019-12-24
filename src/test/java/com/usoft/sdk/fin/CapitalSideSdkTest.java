package com.usoft.sdk.fin;

import com.usoft.fin.external.open.api.protobuf.*;
import com.usoft.sdk.fin.client.CapitalSideSdk;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * @author: linjh
 * @date: 2019-12-23 16:37
 **/

public class CapitalSideSdkTest {
	/**
	 * 测试地址
	 */
	private CapitalSideSdk capitalSideSdk = new CapitalSideSdk("https://finrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

	@Test
	public void getFinanceSideDemands() throws Exception {
		GetFinanceDemandsReq.Builder req = GetFinanceDemandsReq.newBuilder();
		req.setEnuu(10042875);
		req.setCsEnuu(10042875);
		req.setPageNumber(1);
		req.setPageSize(10);
		req.setStatus(1001);
		//req.setIsoffer(1101);
		//req.setStartAcceptDate();
		//req.setEndAcceptDate();
		//req.setOrderBy();
		//req.setSort();
		GetFinanceDemandResp resp = capitalSideSdk.getFinanceSideDemands(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getFinanceOfferList() throws Exception {
		GetFinanceOfferListReq.Builder req = GetFinanceOfferListReq.newBuilder();
		req.setEnuu(10042875);
		req.setPageNumber(1);
		req.setPageSize(10);
		GetFinanceOfferListResp resp = capitalSideSdk.getFinanceOfferList(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getFinanceOfferDetails() throws Exception {
		GetFinanceOfferDetailsReq.Builder req = GetFinanceOfferDetailsReq.newBuilder();
		req.setOfferCode("71191217655139665802");
		GetFinanceOfferDetailsResp resp = capitalSideSdk.getFinanceOfferDetails(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getOfferQuotaInfoList() throws Exception {
		GetOfferQuotaInfoListReq.Builder req = GetOfferQuotaInfoListReq.newBuilder();
		req.setCsEnuu(10042875);
		req.setPageNumber(1);
		req.setPageSize(10);
		GetOfferQuotaInfoListResp resp = capitalSideSdk.getOfferQuotaInfoList(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getOfferQuotaInfoByCode() throws Exception {
		GetOfferQuotaInfoByCodeReq.Builder req = GetOfferQuotaInfoByCodeReq.newBuilder();
		req.setCode("85190711282916126800");
		GetOfferQuotaInfoByCodeResp resp = capitalSideSdk.getOfferQuotaInfoByCode(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
    public void batchOfferOrder() throws Exception {
        BatchOfferOrderReq.Builder req = BatchOfferOrderReq.newBuilder();
        req.addFinanceDemandDetailAcceptCode("77191219674685248821")
                .addFinanceDemandDetailAcceptCode("77191219674685248819")
                .addFinanceDemandDetailAcceptCode("77191219674685248817")
                .setFinanceRate(0.5)
                .setOfferRate(0.5)
                .setFinanceDays(60)
                .setOfferAmount(20000)
                .setContactsMan("lzx")
                .setContactsPhone("15976105608")
                .setPayments("按月付息，到期还本")
                .setEnuu(10042875)
                .setUu(1000027739);
        BatchOfferOrderResp resp = capitalSideSdk.batchOfferOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void saveOfferQuotaInfo() throws Exception {
        SaveOfferQuotaInfoReq.Builder req = SaveOfferQuotaInfoReq.newBuilder();
        req.setCsEnuu(10042875).setCsEnName("深圳市优软商城科技有限公司").setFsEnuu(10041559).setFsEnName("深圳市胜芳电子有限公司").setQuotaAmount(300)
                .setCredDays(12).setFinanceRate(90).setOfferRate(15).setRepayment("到期一次性还本付息").setApplyUu(1000027739);
        SaveOfferQuotaInfoResp resp = capitalSideSdk.saveOfferQuotaInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateOfferQuotaInfo() throws Exception {
        UpdateOfferQuotaInfoReq.Builder req = UpdateOfferQuotaInfoReq.newBuilder();
        req.setCsEnuu(10042875).setFsEnuu(10041559).setStatus(1402).setEndTime("2029-09-09 09:13:20")
                .setCheckerContent("有钱任性").setCheckUu(1000027739);
        UpdateOfferQuotaInfoResp resp = capitalSideSdk.updateOfferQuotaInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
