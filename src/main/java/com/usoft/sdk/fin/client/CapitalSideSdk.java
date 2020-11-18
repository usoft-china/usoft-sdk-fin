package com.usoft.sdk.fin.client;

import com.usoft.fin.external.open.api.protobuf.*;
import com.usoft.sdk.fin.utils.HttpUtil;
import com.usoft.sdk.fin.utils.ProtoBufUtil;

import java.util.Map;
public class CapitalSideSdk extends BaseSdk {
    public CapitalSideSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    /**
     * [查看融资记录列表]
     * @author: linjh
     * @date: 2019/12/23
     **/
    public GetFinanceDemandResp getFinanceSideDemands(GetFinanceDemandsReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/demands";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetFinanceDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceDemandResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [查看报价记录列表]
     * @author: linjh
     * @date: 2019/12/23
     **/
    public GetFinanceOfferListResp getFinanceOfferList(GetFinanceOfferListReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/getFinanceOfferList";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetFinanceOfferListResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceOfferListResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [查看报价详情]
     * @author: linjh
     * @date: 2019/12/23
     **/
    public GetFinanceOfferDetailsResp getFinanceOfferDetails(GetFinanceOfferDetailsReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/getFinanceOfferDetails";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetFinanceOfferDetailsResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceOfferDetailsResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取企业申请额度信息列表]
     * @author: linjh
     * @date: 2019/12/23
     **/
    public GetOfferQuotaInfoListResp getOfferQuotaInfoList(GetOfferQuotaInfoListReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/getOfferQuotaInfoList";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetOfferQuotaInfoListResp.Builder resp = ProtoBufUtil.toProtoBuf(GetOfferQuotaInfoListResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取企业申请额度信息详情]
     * @author: linjh
     * @date: 2019/12/23
     **/
    public GetOfferQuotaInfoByCodeResp getOfferQuotaInfoByCode(GetOfferQuotaInfoByCodeReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/getOfferQuotaInfoByCode";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetOfferQuotaInfoByCodeResp.Builder resp = ProtoBufUtil.toProtoBuf(GetOfferQuotaInfoByCodeResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [批量报价]
     * @author: linjh
     * @date: 2019/12/24
     **/
    public BatchOfferOrderResp batchOfferOrder(BatchOfferOrderReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/batchOfferOrder";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BatchOfferOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchOfferOrderResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [提交企业申请额度信息]
     * @author: linjh
     * @date: 2019/12/24
     */
    public SaveOfferQuotaInfoResp saveOfferQuotaInfo(SaveOfferQuotaInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/saveOfferQuotaInfo";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        SaveOfferQuotaInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(SaveOfferQuotaInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [企业申请额度信息审核]
     * @author: linjh
     * @date: 2019/12/24
     */
    public UpdateOfferQuotaInfoResp updateOfferQuotaInfo(UpdateOfferQuotaInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/updateOfferQuotaInfo";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateOfferQuotaInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateOfferQuotaInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [提交放款信息]
     * @author: linjh
     * @date: 2020/1/7
     */
    public AddCapitalSideLoanResp addCapitalSideLoan(AddCapitalSideLoanReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/addCapitalSideLoan";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddCapitalSideLoanResp.Builder resp = ProtoBufUtil.toProtoBuf(AddCapitalSideLoanResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取放款记录列表]
     * @author: linjh
     * @date: 2020/1/7
     **/
    public GetCapitalSideLoanResp getCapitalSideLoan(GetCapitalSideLoanReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/getCapitalSideLoan";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetCapitalSideLoanResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCapitalSideLoanResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [更新执行还款记录状态]
     * @author: linjh
     * @date: 2020/1/7
     **/
    public UpdateRepaymentPlanStatusResp updateRepaymentPlanStatus(UpdateRepaymentPlanStatusReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/cs/updateRepaymentPlanStatus";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateRepaymentPlanStatusResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateRepaymentPlanStatusResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取收藏企业列表]
     * @author: linjh
     * @date: 2020/1/13
     **/
    public GetCollectionListResp getCollectionList(GetCollectionListReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/cs/getCollectionList";
        Map<String, String> paramJson = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, paramJson, timeout);
        GetCollectionListResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCollectionListResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取还款记录列表]
     * @author: linjh
     * @date: 2020/3/19
     **/
    public GetRepaymentResp getRepaymentList(GetRepaymentReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/cs/getRepaymentList";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetRepaymentResp.Builder resp = ProtoBufUtil.toProtoBuf(GetRepaymentResp.newBuilder(), respJson);
        return resp.build();
    }



    /**
     * [用一句话描述此类]
     * @author: liuzx
     * @date: 2020/9/3
     **/
    public UpdateRepaymentPlanResp updateRepaymentPlan(UpdateRepaymentPlanReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/cs/updateRepaymentPlan";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateRepaymentPlanResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateRepaymentPlanResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [新增买方额度]
     * @author: liuzx
     * @date: 2020/11/18
     **/
    public AddBuyerQouteResp addBuyerQoute(AddBuyerQouteReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/addBuyerQoute";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddBuyerQouteResp.Builder resp = ProtoBufUtil.toProtoBuf(AddBuyerQouteResp.newBuilder(), respJson);
        return resp.build();
    }

}
