package com.gdu.app13.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO {
	
	private int blogNo;
	private String title;
	private String content;
	private int hit;
	private Date createdAt;
	private Date modifiedAt;
	private MemberDTO memberDTO;	// private int memberNo; 가 들어와도 상관없으나 ~ member테이블 정보를 가져오기 위해 DTO를 사용함.

}
