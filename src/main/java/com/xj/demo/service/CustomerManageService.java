package com.xj.demo.service;

import com.xj.demo.domain.ScrmCustomer;
import com.xj.demo.vo.CustomerBasicInfoVo;
import com.xj.demo.vo.CustomerVO;
import com.xj.demo.vo.SearchCustomerManageBean;

import java.util.Date;
import java.util.List;

public interface CustomerManageService {


	List<ScrmCustomer> getCustomersByNickName(long merchantId, String nickName);

	List<ScrmCustomer> queryCustomerListByOpenIds(Long merchantId, List<String> openIds);

	ScrmCustomer getCustomerByConditions(Long merchantId, ScrmCustomer scrmCustomer);

	ScrmCustomer getCustomerDetail(Long merchantId, Long customerId);

	ScrmCustomer getCustomerByOpenId(Long merchantId, String userOpenId);

	ScrmCustomer getCustomerByWid(Long merchantId, String wid);

	ScrmCustomer getCustomerByMerchantIdAndOpenId(Long merchantId, String userOpenId);

	ScrmCustomer getCustomerByMobile(Long merchantId, String mobile);

	int updateByPrimaryKeySelective(ScrmCustomer scrmCustomer);

	List<ScrmCustomer> getAllCustomerByMerchantId(long merchantId);

//	PageInfo<ScrmCustomer> selectAllCustomerByMerchantId(int pagenum,
//                                                         int pagesize, long merchantId);

	int addCustomer(ScrmCustomer scrmCustomer);

	/*int addCustomerFromMiniApp(ScrmCustomer scrmCustomer);*/

	int importScrmCustomer(ScrmCustomer scrmCustomer);

	List<ScrmCustomer> getCustomerList(SearchCustomerManageBean queryBean);

	Long getCustomerCountByGender(Long merchantId, String gender);
	int updateByMerchantIdandOpenId(ScrmCustomer scrmCustomer);

	int insertSelective(ScrmCustomer scrmCustomer);

	int batchInsert(Long merchantId, List<ScrmCustomer> list);

	List<ScrmCustomer> getOldScrmCustomerData();

	List<ScrmCustomer> getAllCustomers();

	/**
	 * 获取该商户下所有客户的opendId 会员类型
	 *
	 * @param merchantId
	 * @return  map:key:openId
	 * 	   			value:membertype
	 */
	List<CustomerVO> getAllCustomerOpenIdandMemberTypeByMerchantId(
            Long merchantId);

	ScrmCustomer getCustomerByMerchantIdAndMeberid(Long merchantId,
                                                   String meberid);

	List<ScrmCustomer> findForBirthday(Long merchantId, Date birthday);

	int countByMemberLevel(Long merchantId, String memberLevel);

	int batchUpdate(Long merchantId, List<ScrmCustomer> updateList);

//	ResponsePageInfo getAllCustomerIdByMerchantId(MemberOpenQueryInfoDto memberOpenQueryInfoDto);

	List<ScrmCustomer> queryDetailsByCustomerIds(Long merchantId, List<Long> customerIds);

//	void createCustomerIndex(CustomeIndex index);
//
//	void createCustomerIndexs(List<CustomeIndex> customerIndexs);

	List<ScrmCustomer> getCustomersByOpenIds(Long merchantId, List<String> openIds);

//	QueryResult<CustomeIndexVo> getCustomerPageList(QueryBean queryBean);
//
//	QueryResult<ScrmCustomer> getCustomerListEs(QueryBean queryBean);

	ScrmCustomer getCustomerByMemberCard(Long merchantId, String memberCard);

	boolean checkMobileExist(Long merchantId, String mobile);

	List<ScrmCustomer> getAllCustomersByMobile(Long merchantId, String mobile);

	int deleteCustomerByCustomerId(Long merchantId, Long customerId);

	ScrmCustomer getByMobileAndOpenIdIsNull(Long merchantId, String mobile);

	CustomerBasicInfoVo getCustomerBasicInfoVoByOpenId(Long merchantId, String openId);

	List<CustomerBasicInfoVo> getCustomerBasicInfoVoByOpenIds(Long merchantId, List<String> openIds);

	int updateForDeleteMemberCard(Long merchantId);

	List<ScrmCustomer> getCustomerForPage(Long merchantId, Long lastCustomerId, int pageSize);

	List<ScrmCustomer> getCustomerForPageWidEmpty(Long merchantId, Long lastCustomerId, int pageSize);

}
