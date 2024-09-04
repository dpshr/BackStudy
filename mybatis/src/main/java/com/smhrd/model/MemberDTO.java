package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class MemberDTO {
//	클래스: 설계도 (필드, 메소드)
//	필드
	@NonNull private String id;
	@NonNull private String pw;
	private String name;
	private int age;
}
