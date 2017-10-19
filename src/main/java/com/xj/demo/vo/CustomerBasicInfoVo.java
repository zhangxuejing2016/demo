package com.xj.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerBasicInfoVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5236151680939120151L;

	private Long customerId;
	private Long merchantId;
	private String openId;
	private String wid;
	private String unionId;
	private String nickname; // 微信昵称
	private String name; // 会员名称
	private String mobile; // 手机号
	private Long focusStoreId; // 关注门店
	private Long memberStoreId; // 领卡门店
	private String gender;
	private Date birthday;
	private String city;
	private Integer appChannel;//领卡渠道(app级别)
}
