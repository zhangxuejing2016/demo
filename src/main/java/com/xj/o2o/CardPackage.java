package com.xj.o2o;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *${table.comment}对应实体类
*/
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Data
public class CardPackage implements Serializable {
	/**  */
	private Long id;
	/**  */
	private Long merchantId;
	/** 券包名称 */
	private String name;
	/** 首图链接 */
	private String img;
	/** 1免费券包，2付费券包 */
	private Integer type;
	/** 1微信券包，0本地券包 */
	private Integer isWechat;
	/** 1未投放，2已投放，3删除 */
	private Integer status;
	/**  */
	private Date createTime;
	/**  */
	private Date updateTime;
	
	private List<PublishCardNumBean> cardNums;


}