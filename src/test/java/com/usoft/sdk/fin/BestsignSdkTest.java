package com.usoft.sdk.fin;

import com.usoft.fin.external.open.factoring.api.protobuf.*;
import com.usoft.sdk.fin.client.BestsignSdk;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;


/**
 * @author: liuzx
 * @date: 2019/12/23
 **/

public class BestsignSdkTest {
/**
	 * 测试地址
	 */

	private BestsignSdk bestsignSdk = new BestsignSdk("https://finrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");


	/**
	 * [第三方获取需要签约的合同列表]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	@Test
	public void getThreePartyContractList() throws Exception {
		GetThreePartyContractListReq.Builder req = GetThreePartyContractListReq.newBuilder();
		//secretId=10050877&pageSize=10&pageNumber=1&thirdPartyName=深圳市金色阳光科电有限公司
		req.setPageNumber(1).setPageSize(10)
				.setThirdPartyName("深圳市金色阳光科电有限公司");
		GetThreePartyContractListResp resp = bestsignSdk.getThreePartyContractList(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}


	/**
	 * [第三方获取待签约合同数量]
	 * @author: liuzx
	 * @date: 2020/5/14
	 **/
	@Test
	public void getThreePartyContractCount() throws Exception {
		GetThreePartyContractCountReq.Builder req = GetThreePartyContractCountReq.newBuilder();
		req.setThirdPartyName("深圳市金色阳光科电有限公司");
		GetThreePartyContractCountResp resp = bestsignSdk.getThreePartyContractCount(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	/**
	 * [合同管理、签署、查看 ]
	 * @author: liuzx
	 * @date: 2019/12/23
	 **/
	@Test
	public void contractTargetPage() throws Exception {
		ContractTargetPageReq.Builder req = ContractTargetPageReq.newBuilder();
		//secretId=10050877&thirdPartyEnuu=10046945&thirdPartymobile=13760478918&targetPage=docView&returnUrl=https://fin.uuzcc.cn&contractId=2510836503077196804
		req.setThirdPartyEnuu("10046945").setThirdPartyMobile("13760478918").setTargetPage("targetPage").setReturnUrl("https://fin.uuzcc.cn").setContractId("2510836503077196804");
		ContractTargetPageResp resp = bestsignSdk.contractTargetPage(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	/**
	 * [下载合同]
	 * @author: linjh
	 * @date: 2020/2/24
	 **/
	@Test
	public void contractDownLoadFile() throws Exception {
		ContractDownLoadFileReq.Builder req = ContractDownLoadFileReq.newBuilder();
		//secretId=10050877&thirdPartyEnuu=10046945&thirdPartymobile=13760478918&contractId=2510836503077196804
		req.setThirdPartyEnuu("10046945").setThirdPartyMobile("13760478918").setContractId("2510836503077196804");
		ContractDownLoadFileResp resp = bestsignSdk.contractDownLoadFile(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}

	/**
	 * [资金方详情页获取银行账号信息]
	 * @author: linjh
	 * @date: 2020/6/2
	 **/
	@Test
	public void getBankAccountInfo() throws Exception {
		GetBankAccountInfoReq.Builder req = GetBankAccountInfoReq.newBuilder();
		//secretId=10050877&thirdPartyEnuu=10046945&thirdPartymobile=13760478918&contractId=2510836503077196804
		req.setFinanceDemandCode("73200525036937040641").setAcceptOfferCode("71200525036971882080");
		GetBankAccountInfoResp resp = bestsignSdk.getBankAccountInfo(req);
		System.out.println(ProtoBufUtil.toJSON(resp));
	}
}
