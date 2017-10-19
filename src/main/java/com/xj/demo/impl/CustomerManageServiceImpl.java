package com.xj.demo.impl;

import com.xj.demo.dao.ScrmCustomerDao;
import com.xj.demo.domain.ScrmCustomer;
import com.xj.demo.service.CustomerManageService;
import com.xj.demo.vo.CustomerBasicInfoVo;
import com.xj.demo.vo.CustomerVO;
import com.xj.demo.vo.SearchCustomerManageBean;
import com.xj.utils.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Log4j2
@Service
public class CustomerManageServiceImpl implements CustomerManageService {

	@Autowired
    ScrmCustomerDao scrmCustomerDao;

	@Override
	public List<ScrmCustomer> queryCustomerListByOpenIds(Long merchantId, List<String> openIds) {
		if (CollectionUtils.isEmpty(openIds)) {
			return new ArrayList<ScrmCustomer>();
		}
		return scrmCustomerDao.queryCustomerListByOpenIds(merchantId, openIds);
	}

	@Override
	public ScrmCustomer getCustomerByConditions(Long merchantId, ScrmCustomer conditions) {
		ScrmCustomer scrmCustomer = null;
		Long customerId = conditions.getCustomerId();
		String cardCode = conditions.getMeberCard();
		String mobile = conditions.getMobile();
		String openId = conditions.getOpenId();
		if (customerId != null) {
			scrmCustomer = getCustomerDetail(merchantId, customerId);
		} else if (StringUtils.isNotEmpty(cardCode)) {
//			String localCode = memberManager.getMemberCardcode(merchantId, cardCode);
//			scrmCustomer = getCustomerByMemberCard(merchantId, localCode);
		} else if (StringUtils.isNotEmpty(mobile)) {
			scrmCustomer = getCustomerByMobile(merchantId, mobile);
		} else if (StringUtils.isNotEmpty(openId)) {
			scrmCustomer = getCustomerByOpenId(merchantId, openId);
		}
		return scrmCustomer;
	}


	@Override
	// 客户详情页面
	public ScrmCustomer getCustomerDetail(Long merchantId, Long customerId) {
		return scrmCustomerDao.selectByPrimaryKey(merchantId, customerId);
	}

	@Override
	public ScrmCustomer getCustomerByOpenId(Long merchantId, String userOpenId) {

		return scrmCustomerDao.getCustomerByOpenId(merchantId, userOpenId);
	}

	@Override
	public ScrmCustomer getCustomerByWid(Long merchantId, String wid) {

		return scrmCustomerDao.getCustomerByWid(merchantId, wid);
	}

	@Override
	public int updateByPrimaryKeySelective(ScrmCustomer scrmCustomer) {
		return scrmCustomerDao.updateByPrimaryKeySelective(scrmCustomer);
	}
	@Override
	public ScrmCustomer getCustomerByMerchantIdAndOpenId(Long merchantId,
			String userOpenId) {
		return scrmCustomerDao.getCustomerByOpenId(merchantId, userOpenId);
	}

	@Override
	public ScrmCustomer getCustomerByMobile(Long merchantId, String mobile) {
		return scrmCustomerDao.getCustomerByMobile(merchantId, mobile);
	}

	@Override
	public int addCustomer(ScrmCustomer scrmCustomer) {
		try {
			ScrmCustomer scrmCustomer2 = null;
			if(null!=scrmCustomer.getWid()){
				scrmCustomer2 = scrmCustomerDao.getCustomerByWid(scrmCustomer.getMerchantId(),scrmCustomer.getWid());
			}else{
				scrmCustomer2 = scrmCustomerDao.getCustomerByOpenId(scrmCustomer.getMerchantId(),scrmCustomer.getOpenId());
			}
			if (scrmCustomer2 == null) {
				return scrmCustomerDao.insertSelective(scrmCustomer);
			} else {
				scrmCustomer.setCustomerId(scrmCustomer2.getCustomerId());
				return scrmCustomerDao.updateByPrimaryKeySelective(scrmCustomer);
			}
		} catch (Exception e) {
//			log.error("add customer fail", e);
			return 0;
		}
	}

	/*@Override
	public int addCustomerFromMiniApp(ScrmCustomer scrmCustomer){
		try {
			ScrmCustomer scrmCustomer2 = scrmCustomerMapper
					.getCustomerByWid(scrmCustomer.getMerchantId(),
							scrmCustomer.getWid());
			if (scrmCustomer2 == null) {
				return scrmCustomerMapper.insertSelective(scrmCustomer);
			} else {
				scrmCustomer.setCustomerId(scrmCustomer2.getCustomerId());
				return scrmCustomerMapper.updateByPrimaryKeySelective(scrmCustomer);
			}
		} catch (Exception e) {
			log.error("add customer from miniApp fail", e);
			return 0;
		}
	}*/

	@Override
	public int importScrmCustomer(ScrmCustomer scrmCustomer) {
		return scrmCustomerDao.insertSelective(scrmCustomer);
	}

	@Override
	public List<ScrmCustomer> getAllCustomerByMerchantId(long merchantId) {

		return scrmCustomerDao.getAllCustomerByMerchantId(merchantId);
	}

//	@Override
//	public PageInfo<ScrmCustomer> selectAllCustomerByMerchantId(int pagenum,
//			int pagesize, long merchantId) {
//		PageHelper.startPage(pagenum, pagesize);
//		List<ScrmCustomer> list = scrmCustomerMapper
//				.getAllCustomerByMerchantId(merchantId);
//
//		PageInfo<ScrmCustomer> pageInfo = new PageInfo<ScrmCustomer>(list);
//
//		return pageInfo;
//	}

	@Override
	public List<ScrmCustomer> getCustomerList(SearchCustomerManageBean queryBean) {
		List<ScrmCustomer> list = null;
		try {
			list = scrmCustomerDao.getCustomerList(queryBean);
//			log.info(queryBean);
		} catch (Exception e) {
//			log.error(e);
		}
		return list;
	}

	@Override
	public List<ScrmCustomer> getCustomersByNickName(long merchantId,String nickName) {

		return scrmCustomerDao.getCustomersByNickName(merchantId, nickName);
	}

	@Override
	public int updateByMerchantIdandOpenId(ScrmCustomer scrmCustomer) {

		return scrmCustomerDao.updateByMerchantIdandOpenId( scrmCustomer);
	}

	@Override
	public int insertSelective(ScrmCustomer scrmCustomer) {
		int num = scrmCustomerDao.insertSelective(scrmCustomer);
		// Boolean flag = this.createCustomer(scrmCustomer);
		// if (!flag) {
		// throw new RuntimeException("create index fail");
		// }
		return num;
	}

	@Override
	public int batchInsert(Long merchantId, List<ScrmCustomer> list) {

		return scrmCustomerDao.batchInsert(merchantId, list);
	}

	@Override
	public List<ScrmCustomer> getOldScrmCustomerData() {
		return scrmCustomerDao.getOldScrmCustomerData();
	}

	@Override
	public List<ScrmCustomer> getAllCustomers() {
		List<ScrmCustomer> allCustomers = new ArrayList<ScrmCustomer>();
		for (Long i = 0L; i < 12; i++) {
			List<ScrmCustomer> customers = scrmCustomerDao.getAllCustomers(i);
			allCustomers.addAll(customers);
		}
		return allCustomers;
	}


	@Override
	public List<CustomerVO> getAllCustomerOpenIdandMemberTypeByMerchantId(
			Long merchantId) {

		return scrmCustomerDao.getAllCustomerOpenIdandMemberTypeByMerchantId(merchantId);
	}

	@Override
	public Long getCustomerCountByGender(Long merchantId, String gender) {

		return scrmCustomerDao.getCustomerCountByGender(merchantId, gender);
	}

	@Override
	public ScrmCustomer getCustomerByMerchantIdAndMeberid(Long merchantId,
			String meberid) {

		return scrmCustomerDao.getCustomerByMerchantIdAndMeberid(merchantId,meberid);
	}

	@Override
	public List<ScrmCustomer> findForBirthday(Long merchantId, Date birthday) {
		return scrmCustomerDao.findByBirthday(merchantId, birthday);
	}

	@Override
	public int countByMemberLevel(Long merchantId, String memberLevel) {
		return scrmCustomerDao.countByMemberLevel(merchantId, memberLevel);
	}

	@Override
	public int batchUpdate(Long merchantId, List<ScrmCustomer> updateList) {
		String tableName = "o2o_scrm_customer_" + merchantId % 12;
		return scrmCustomerDao.batchUpdate(merchantId, updateList, tableName);
	}

	@Override
	public List<ScrmCustomer> queryDetailsByCustomerIds(Long merchantId, List<Long> customerIds) {

		if (CollectionUtils.isEmpty(customerIds) || (merchantId == null)) {
			return new ArrayList<ScrmCustomer>();
		}
		return scrmCustomerDao.queryDetailsByCustomerIds(merchantId, customerIds);
	}

	@Override
	public List<ScrmCustomer> getCustomersByOpenIds(Long merchantId, List<String> openIds) {
		if (CollectionUtils.isEmpty(openIds) || (merchantId == null)) {
			return new ArrayList<ScrmCustomer>();
		}
		return scrmCustomerDao.getCustomersByOpenIds(merchantId, openIds);
	}

	@Override
	public ScrmCustomer getCustomerByMemberCard(Long merchantId, String memberCard) {
		return scrmCustomerDao.getCustomerByMemberCard(merchantId, memberCard);
	}

	@Override
	public boolean checkMobileExist(Long merchantId, String mobile) {
		int num = scrmCustomerDao.checkMobileExist(merchantId, mobile);
		return num > 0;
	}

	@Override
	public List<ScrmCustomer> getAllCustomersByMobile(Long merchantId, String mobile) {
		List<ScrmCustomer> scrmCustomers = scrmCustomerDao.getAllCustomersByMobile(merchantId, mobile);
		if(CollectionUtils.isEmpty(scrmCustomers)) {
			return new ArrayList<ScrmCustomer>();
		}
		return scrmCustomers;
	}

	@Override
	public int deleteCustomerByCustomerId(Long merchantId,Long customerId){
		if(merchantId==null||customerId==null){
			return 0;
		}
		int num=scrmCustomerDao.deleteByPrimaryKey(merchantId,customerId);
		return num;
	}

	@Override
	public ScrmCustomer getByMobileAndOpenIdIsNull(Long merchantId, String mobile) {
		ScrmCustomer scrmCustomer = scrmCustomerDao.getByMobileAndOpenIdIsNull(merchantId, mobile);
		if(scrmCustomer == null) {
			return new ScrmCustomer();
		}
		return scrmCustomer;

	}

	@Override
	public CustomerBasicInfoVo getCustomerBasicInfoVoByOpenId(Long merchantId, String openId) {

		return scrmCustomerDao.getCustomerBasicInfoVoByOpenId(merchantId, openId);
	}

	@Override
	public List<CustomerBasicInfoVo> getCustomerBasicInfoVoByOpenIds(Long merchantId, List<String> openIds) {
		return scrmCustomerDao.getCustomerBasicInfoVoByOpenIds(merchantId, openIds);
	}

	/**
	 * 删除会员卡时更新会员表数据
	 * @param merchantId
	 * @return
	 */
	@Override
	public int updateForDeleteMemberCard(Long merchantId) {
		return scrmCustomerDao.updateForDeleteMemberCard(merchantId);
	}

	@Override
	public List<ScrmCustomer> getCustomerForPage(Long merchantId, Long lastCustomerId, int pageSize) {
		return scrmCustomerDao.getCustomerForPage(merchantId, lastCustomerId, pageSize);
	}

	@Override
	public List<ScrmCustomer> getCustomerForPageWidEmpty(Long merchantId, Long lastCustomerId, int pageSize) {
		return scrmCustomerDao.getCustomerForPageWidEmpty(merchantId,lastCustomerId,pageSize);
	}
}
