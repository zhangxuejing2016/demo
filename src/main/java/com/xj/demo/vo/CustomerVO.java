/**
 * 
 */
package com.xj.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 秦彦卿
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerVO implements Serializable{

	private static final long serialVersionUID = 662529239808059579L;
	private String  open_id;
	private String meber_type;
	private Long customer_id;
	private String nickname;
	private String mobile;
	private Integer is_focus;

}
