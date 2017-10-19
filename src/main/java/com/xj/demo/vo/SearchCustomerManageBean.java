package com.xj.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 张涛
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCustomerManageBean implements Serializable {
	private static final long serialVersionUID = 7686148549266630880L;

	private Integer pageSize;
	private Integer pageNum;
	private String keyword;
	private String ids;
	private Long aid;// 商户id
	private String allMemberLevel;
	private String level;// 会员等级
	private String label;// 标签
	private String registerTime;// 注册时间
	private Date registerTime2Date;// 注册时间
	private Character gender;// 性别
	private Long age;// 年龄
	private Date age2BrithdayMin;// 年龄对应生日范围下限
	private Date age2BrithdayMax;// 年龄对应生日范围上限

	private String provinces;// 省
	private String city;// 市
	private String district;// 县

	private String lastTradeTime;// 上次交易时间
	private Date lastTradeTimeMin;// 上次交易时间范围下限
	private Date lastTradeTimeMax;// 上次交易时间范围上限
	private Integer tradeCountMin;// 交易总数下限
	private Integer tradeCountMax;// 交易总数上限
	private Double amountMin;// 交易总金额下限
	private Double amountMax;// 交易总金额上限
	private String order;// 排序规则默认DESC
	private String orderBy;// 根据排序字段

	private Integer appChannel;

}
