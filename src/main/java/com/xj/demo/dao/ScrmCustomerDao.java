package com.xj.demo.dao;

import com.xj.demo.domain.ScrmCustomer;
import com.xj.demo.vo.CustomerBasicInfoVo;
import com.xj.demo.vo.CustomerVO;
import com.xj.demo.vo.SearchCustomerManageBean;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ScrmCustomerDao {
	int deleteByPrimaryKey(@Param("merchantId") Long merchantId, @Param("customerId") Long customerId);

	int insert(ScrmCustomer record);
	
	int batchInsert(@Param("merchantId") Long merchantId, @Param("list") List<ScrmCustomer> list);
	
	int insertSelective(ScrmCustomer record);

	List<ScrmCustomer> queryCustomerListByOpenIds(@Param("merchantId") Long merchantId, @Param("openIds") List<String> openIds);

	ScrmCustomer selectByPrimaryKey(@Param("merchantId") Long merchantId,
                                    @Param("customerId") Long customerId);

	int updateByPrimaryKeySelective(ScrmCustomer record);

	int updateByPrimaryKey(ScrmCustomer record);

	List<ScrmCustomer> getCustomerManageList(SearchCustomerManageBean queryBean);

	ScrmCustomer getCustomerByOpenId(@Param("merchantId") Long merchantId, @Param("openId") String userOpenId);

	ScrmCustomer getCustomerByWid(@Param("merchantId") Long merchantId, @Param("wid") String wid);

	ScrmCustomer getCustomerByMobile(@Param("merchantId") Long merchantId, @Param("mobile") String userOpenId);

	ScrmCustomer getCustomerByMerchantIdAndOpenId(Map parameter);

	List<ScrmCustomer> getAllCustomerByMerchantId(long merchantId);

	List<ScrmCustomer> getAllCustomers(long merchantId);

	List<ScrmCustomer> getCustomerList(SearchCustomerManageBean queryBean);

	Long getCustomerCount(Long merchantId);
    
	Long getCustomerCountByGender(@Param("merchantId") Long merchantId, @Param("gender") String gender);
	
	List<ScrmCustomer> getCustomersByNickName(@Param("merchantId") Long merchantId, @Param("nickname") String nickname);

	int updateByMerchantIdandOpenId(ScrmCustomer scrmCustomer);

	List<ScrmCustomer> getOldScrmCustomerData();

	List<CustomerVO> getAllCustomerOpenIdandMemberTypeByMerchantId(
            Long merchantId);

	ScrmCustomer getCustomerByMerchantIdAndMeberid(@Param("merchantId") Long merchantId,
                                                   @Param("meberid") String meberid);

	List<ScrmCustomer> findByBirthday(@Param("merchantId") Long merchantId, @Param("birthday") Date birthday);

	int countByMemberLevel(@Param("merchantId") Long merchantId, @Param("memberLevel") String memberLevel);

	int batchUpdate(@Param("merchantId") Long merchantId, @Param("list") List<ScrmCustomer> updateList,
                    @Param("tableName") String tableName);

	List<Long> getAllCustomerIds(@Param("merchantId") Long merchantId);

	List<ScrmCustomer> queryDetailsByCustomerIds(@Param("merchantId") Long merchantId, @Param("customerIds") List<Long> customerIds);

	List<ScrmCustomer> getCustomersByOpenIds(@Param("merchantId") Long merchantId,
                                             @Param("openIds") List<String> openIds);

	ScrmCustomer getCustomerByMemberCard(@Param("merchantId") Long merchantId, @Param("memberCard") String memberCard);

	int checkMobileExist(@Param("merchantId") Long merchantId, @Param("mobile") String mobile);

	List<ScrmCustomer> getAllCustomersByMobile(@Param("merchantId") Long merchantId, @Param("mobile") String mobile);

	ScrmCustomer getByMobileAndOpenIdIsNull(@Param("merchantId") Long merchantId, @Param("mobile") String mobile);

	CustomerBasicInfoVo getCustomerBasicInfoVoByOpenId(@Param("merchantId") Long merchantId,
                                                       @Param("openId") String openId);

	List<CustomerBasicInfoVo> getCustomerBasicInfoVoByOpenIds(@Param("merchantId") Long merchantId,
                                                              @Param("openIds") List<String> openIds);

	int updateForDeleteMemberCard(@Param("merchantId") Long merchantId);

	List<ScrmCustomer> getCustomerForPage(@Param("merchantId") Long merchantId,
                                          @Param("lastCustomerId") Long lastCustomerId, @Param("pageSize") int pageSize);

	List<ScrmCustomer> getCustomerForPageWidEmpty(@Param("merchantId") Long merchantId,
                                                  @Param("lastCustomerId") Long lastCustomerId, @Param("pageSize") int pageSize);
}
