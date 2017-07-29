package com.xj.o2o;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishCardNumBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7460254446084099131L;

	private Long cardTemplateId;
	private Integer num;
}
