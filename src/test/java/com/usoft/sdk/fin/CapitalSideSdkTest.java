package com.usoft.sdk.fin;

import com.usoft.fin.external.open.api.entity.OpenCapitalSideLoanOther;
import com.usoft.fin.external.open.api.entity.OpenCapitalSideRepaymentPlanOther;
import com.usoft.fin.external.open.api.protobuf.*;
import com.usoft.fin.rest.api.entity.SignatureInfo;
import com.usoft.sdk.fin.client.CapitalSideSdk;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * @author: linjh
 * @date: 2019-12-23 16:37
 **/

public class CapitalSideSdkTest {
	/**
	 * 测试地址
	 */
	//private CapitalSideSdk capitalSideSdk = new CapitalSideSdk("https://finrest.uuzcc.cn", "10050877", "b78d577449b64f56a8a6cf1feeb3fbf5");
    private CapitalSideSdk capitalSideSdk = new CapitalSideSdk("https://finrest.usoftchina.com", "10046945", "600d3f07955ba67fe050007f01002db2");

    @Test
	public void getFinanceSideDemands() throws Exception {
		GetFinanceDemandsReq.Builder req = GetFinanceDemandsReq.newBuilder();
		req.setEnuu(10042875);
		//req.setCsEnuu(10042875);
		req.setPageNumber(1);
		req.setPageSize(10);
        req.setIsoffer(1101);
        //req.setStatus(1001);
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
		req.setUpdateTime(1577232000000L);
		GetFinanceOfferListResp resp = capitalSideSdk.getFinanceOfferList(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getFinanceOfferDetails() throws Exception {
		GetFinanceOfferDetailsReq.Builder req = GetFinanceOfferDetailsReq.newBuilder();
		req.setOfferCode("71191218666434955543");
		GetFinanceOfferDetailsResp resp = capitalSideSdk.getFinanceOfferDetails(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	@Test
	public void getOfferQuotaInfoList() throws Exception {
		GetOfferQuotaInfoListReq.Builder req = GetOfferQuotaInfoListReq.newBuilder();
		req.setCsEnuu(10042875);
		req.setPageNumber(1);
		req.setPageSize(10);
//		req.setUpdateTime(1578879998000L);
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

    @Test
    public void addCapitalSideLoan() throws Exception  {
        AddCapitalSideLoanReq.Builder req = AddCapitalSideLoanReq.newBuilder();
        OpenCapitalSideLoanOther.Builder capitalSideLoanOther = OpenCapitalSideLoanOther.newBuilder();
        capitalSideLoanOther.setFinanceDemandCode("73191217657460232300");
        capitalSideLoanOther.setLoanCode("");
        capitalSideLoanOther.setReceivablesArrivalDate("2020-1-25");
        capitalSideLoanOther.setFinanceRate(8);
        capitalSideLoanOther.setLoanAmount(19891.2);
        capitalSideLoanOther.setLoanDate("2020-1-25");
        capitalSideLoanOther.setRepaymentData("2020-3-25");
        capitalSideLoanOther.setLoanRate(8);
        capitalSideLoanOther.setRepaymentFrequency("按月付息，到期还本");
        capitalSideLoanOther.setFsCollectionBank("招商银行");
        capitalSideLoanOther.setFsCollectionAccount("1234567890");
        capitalSideLoanOther.setFsCollectionName("英唐优软云");
        capitalSideLoanOther.setReceiptForLoan(19891.2);
        capitalSideLoanOther.setInterestPayable(5000);
        capitalSideLoanOther.setBeOverdue(0);
        capitalSideLoanOther.setSettle(0);
        capitalSideLoanOther.setApplyDate("2020-1-2");
        capitalSideLoanOther.setPersonInCharge("lzx");
        capitalSideLoanOther.setStatus(1);
        capitalSideLoanOther.setApprovalDate("2020-1-2");
        capitalSideLoanOther.setApprovalMan("lzx");
        req.setCapitalSideLoan(capitalSideLoanOther);

        OpenCapitalSideRepaymentPlanOther.Builder capitalSideRepaymentPlanOther = OpenCapitalSideRepaymentPlanOther.newBuilder();
        capitalSideRepaymentPlanOther.setRepaymentData("2020-2-25");
        capitalSideRepaymentPlanOther.setCurrency("RMB");
        capitalSideRepaymentPlanOther.setCapitalAmount(10000);
        capitalSideRepaymentPlanOther.setInterest(1000);
        capitalSideRepaymentPlanOther.setAmount(101000);
        capitalSideRepaymentPlanOther.setPersonInCharge("lzx");
        req.addCapitalSideRepaymentPlan(capitalSideRepaymentPlanOther);

        OpenCapitalSideRepaymentPlanOther.Builder capitalSideRepaymentPlanOther1 = OpenCapitalSideRepaymentPlanOther.newBuilder();
        capitalSideRepaymentPlanOther1.setRepaymentData("2020-3-25");
        capitalSideRepaymentPlanOther1.setCurrency("RMB");
        capitalSideRepaymentPlanOther1.setCapitalAmount(9891.2);
        capitalSideRepaymentPlanOther1.setInterest(4000);
        capitalSideRepaymentPlanOther1.setAmount(13891.2);
        capitalSideRepaymentPlanOther1.setPersonInCharge("lzx");
        req.addCapitalSideRepaymentPlan(capitalSideRepaymentPlanOther1);
        req.setEnuu(10042875);

        AddCapitalSideLoanResp resp = capitalSideSdk.addCapitalSideLoan(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getCapitalSideLoan() throws Exception {
        GetCapitalSideLoanReq.Builder req = GetCapitalSideLoanReq.newBuilder();
        req.setPageSize(10);
        req.setPageNumber(1);
        req.setCsEnuu(10042875);
        req.setUpdateTime(1578879998000L);
        GetCapitalSideLoanResp resp = capitalSideSdk.getCapitalSideLoan(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateRepaymentPlanStatus() throws Exception {
        UpdateRepaymentPlanStatusReq.Builder req = UpdateRepaymentPlanStatusReq.newBuilder();
        req.setCapitalSideRepaymentPlanCode("87200102793370509102");
        UpdateRepaymentPlanStatusResp resp = capitalSideSdk.updateRepaymentPlanStatus(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getCollectionList() throws Exception {
        GetCollectionListReq.Builder req = GetCollectionListReq.newBuilder();
        req.setPageSize(10);
        req.setPageNumber(1);
        req.setUpdateTime(1578879998000L);
        GetCollectionListResp resp = capitalSideSdk.getCollectionList(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    /**
     * 传入请求参数，返回api签名串
     * @throws Exception
     */
    @Test
    public void getSignatureValue() throws Exception {
        SignatureInfo.Builder signatureInfo = SignatureInfo.newBuilder();
        signatureInfo.setSecretId("10046945").setUu(1000014617).setRedirectUrl("https://fin.yitoa-fintech.com/");
        String signature = capitalSideSdk.getSignatureValue(signatureInfo);
        System.out.println("------返回结果--------");
        System.out.println(signature);
    }
}
