package com.xj.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xj.utils.DateUtils;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

@ToString
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ScrmCustomer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2956467995931828656L;

	private Long customerId;

	private String openId;

    private String unionId;

    private String wid;

	private Integer appChannel;

	private Long merchantId;

	private Integer focusSourceType;

	private Integer memberSourceType;

	private Long focusStoreId;

	private Long memberStoreId;

	private String nickname;

	private String name;

	private String gender;

	private Date birthday;

	private Date birthDate;

	private String province;

	private String city;

	private String district;

	private String address;

	private String mobile;

	public String getValidatedMobile() {
		return validatedMobile;
	}

	public void setValidatedMobile(String validatedMobile) {
		this.validatedMobile = validatedMobile;
	}

	private String validatedMobile;

	private String mail;

	private String identityCard;

	private String education;

	private String industry;

	private String hobby;

	private String job;

	private String income;

	private String photo;

	private Date registerTime;

	private String meberLevel;

	private Long rankId;

	private String meberCard;

	private Long score;

	private Float available;

	private String meberId;

	// private Date focusTime;// 不使用

	private Date cardTime;

	private Long sumScore;

	private String meberType;
	/**
	 * @See CustomerIsFocusEnum
	 */
	private Integer isFocus;

	private String customFiled;

	private Integer status;

	private Long tradeCount;

	private Date lastTradeTime;

	private Float avgAmount;

	private Float amount;

	private Long growth;//仅供数据导入使用

	private Date cancelFocusTime;


	private Boolean hasMemberCardOrNot;

	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (null==obj) {
			return false;
		}
		
		 if (obj instanceof ScrmCustomer) {
			ScrmCustomer scrmCustomer=(ScrmCustomer)obj;
			boolean merchantResult= (merchantId.longValue()==scrmCustomer.getMerchantId().longValue());
			boolean customerIdResult=(customerId.longValue()==scrmCustomer.getCustomerId().longValue());
			boolean nicknameResult=(StringUtils.equals(nickname, scrmCustomer.getNickname()));
			boolean nameResult=StringUtils.equals(name, scrmCustomer.getName());
			boolean meberCardResult=StringUtils.equals(meberCard, scrmCustomer.getMeberCard());
			boolean mobileResult= StringUtils.equals(mobile, scrmCustomer.getMobile());
			 if (merchantResult&&meberCardResult&&customerIdResult&&nicknameResult&&nameResult&&mobileResult){
				return true;
			 }
			return false;
		}else {
			return false;
		}
		 
		
	}
	
	public Date getBirthday() {

		if (birthday != null && birthday.before(DateUtils.getDate(1900, 1, 2))) {
			return null;
		}
		return birthday;
	}

	public Date getRegisterTime() {
		if (registerTime != null
				&& registerTime.before(DateUtils.getDate(1971, 1, 2))) {
			return null;
		}
		return registerTime;
	}

	// public Date getFocusTime() {
	// if (focusTime != null
	// && focusTime.before(DateUtils.getDate(1971, 1, 2))) {
	// return null;
	// }
	// return focusTime;
	// }

	public Date getCardTime() {
		if (cardTime != null && cardTime.before(DateUtils.getDate(1971, 1, 2))) {
			return null;
		}
		return cardTime;
	}

	public Date getLastTradeTime() {
		if (lastTradeTime != null
				&& lastTradeTime.before(DateUtils.getDate(1971, 1, 2))) {
			return null;
		}
		return lastTradeTime;
	}
	public Boolean getHasMemberCardOrNot() {
		return hasMemberCardOrNot;
	}

	public void setHasMemberCardOrNot(Boolean hasMemberCardOrNot) {
		this.hasMemberCardOrNot = hasMemberCardOrNot;
	}

	public Integer getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(Integer appChannel) {
		this.appChannel = appChannel;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getNickname() {
		return StringUtils.isNotBlank(nickname) ? nickname : null;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (StringUtils.isBlank(gender) || gender.equals("0")) {
			this.gender = "N";
		} else if (gender.equals("1")) {
			this.gender = "M";
		} else if (gender.equals("2")) {
			this.gender = "F";
		} else {
			this.gender = gender;
		}

	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		if (StringUtils.isNotBlank(province) && province.length() > 50) {
			this.province = province.substring(0, 50);
		} else {
			this.province = province;
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (StringUtils.isNotBlank(city) && city.length() > 50) {
			this.city = city.substring(0, 50);
		} else {
			this.city = city;
		}
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		if (StringUtils.isNotBlank(district) && district.length() > 50) {
			this.district = district.substring(0, 50);
		} else {
			this.district = district;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (StringUtils.isNotBlank(address) && address.length() > 255) {
			this.address = address.substring(0, 255);
		} else {
			this.address = address;
		}
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMeberLevel() {
		return meberLevel;
	}

	public void setMeberLevel(String meberLevel) {
		this.meberLevel = meberLevel;
	}

	public String getMeberCard() {
		return meberCard;
	}

	public void setMeberCard(String meberCard) {
		this.meberCard = meberCard;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Float getAvailable() {
		return available;
	}

	public void setAvailable(Float available) {
		this.available = available;
	}

	public String getMeberId() {
		return meberId;
	}

	public void setMeberId(String meberId) {
		this.meberId = meberId;
	}

	public Long getSumScore() {
		return sumScore;
	}

	public void setSumScore(Long sumScore) {
		this.sumScore = sumScore;
	}

	public String getMeberType() {
		return meberType;
	}

	public String getCustomFiled() {
		return customFiled;
	}

	public void setCustomFiled(String customFiled) {
		this.customFiled = customFiled;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

	public Float getAvgAmount() {
		return avgAmount;
	}

	public void setAvgAmount(Float avgAmount) {
		this.avgAmount = avgAmount;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
		if(birthday != null && birthday.after(DateUtils.getDate(1902, 1, 2))){
			String formatDate = DateUtils.formatDate(birthday, "MM-dd");
			this.birthDate = DateUtils.getDateFromStr(formatDate, "MM-dd");
		}
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}



	public void setCardTime(Date cardTime) {
		this.cardTime = cardTime;
	}

	public void setLastTradeTime(Date lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

	public Integer getIsFocus() {
		return isFocus;
	}

	public void setIsFocus(Integer isFocus) {
		this.isFocus = isFocus;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getRankId() {
		return rankId;
	}

	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}

	public Long getGrowth() {
		return growth;
	}

	public void setGrowth(Long growth) {
		this.growth = growth;
	}
	public Integer getFocusSourceType() {
		return focusSourceType;
	}

	public void setFocusSourceType(Integer focusSourceType) {
		this.focusSourceType = focusSourceType;
	}

	public Integer getMemberSourceType() {
		return memberSourceType;
	}

	public void setMemberSourceType(Integer memberSourceType) {
		this.memberSourceType = memberSourceType;
	}

	public Long getFocusStoreId() {
		return focusStoreId;
	}

	public void setFocusStoreId(Long focusStoreId) {
		this.focusStoreId = focusStoreId;
	}

	public Long getMemberStoreId() {
		return memberStoreId;
	}

	public void setMemberStoreId(Long memberStoreId) {
		this.memberStoreId = memberStoreId;
	}

	public Date getCancelFocusTime() {
		return cancelFocusTime;
	}

	public void setCancelFocusTime(Date cancelFocusTime) {
		this.cancelFocusTime = cancelFocusTime;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}
}