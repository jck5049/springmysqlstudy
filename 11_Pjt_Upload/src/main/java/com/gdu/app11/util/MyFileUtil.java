package com.gdu.app11.util;

import java.io.File;
import java.time.LocalDate;
import java.util.UUID;
import java.util.regex.Matcher;

import org.springframework.stereotype.Component;

@Component
public class MyFileUtil {
	
	// 경로 구분자
	private String sep = Matcher.quoteReplacement(File.separator);  //	File.separator : 원화 또는 \를 말함(경로 구분자)
	
	// String path 만들기	자바 6장에 LocalDate에 나와있음!!
	public String getPath() {
		
		LocalDate now = LocalDate.now();
		
		// 루트/storage/2023/05/08
		return "/storage" + sep +  now.getYear() + sep + String.format("%02d", now.getMonthValue()) + sep + String.format("%02d", now.getDayOfMonth());               
		
		// %02d : 앞에 0은 정수 2자리가 아닐시 0을 써라는 뜻이다. 2는 정수 2자리를 써라는 뜻!
	}
	
	// String filesystemName 만들기
	public String getFilesystemName(String originName) {
		
		// 원래 첨부 파일의 확장자 꺼내기
		String extName = null;
		
		// 확장자에 마침표(.)가 포함된 예외 상황 처리	endsWith : 뭐뭐로 끝난다라는 코드
		if(originName.endsWith("tar.gz")) {
			extName = "tar.gz";
		} else {
			// split(정규식 전달)
			// 정규식에서 마침표(.)는 모든 문자를 의미하므로 이스케이프 처리하거나 문자 클래스로 처리한다.
			// 이스케이프 처리  : 	\.	(자바에서 역슬래시 적용법 \\ 2개처리 해야한다.)
			// 문자 클래스 처리 : 	[.]
			String[] array = originName.split("\\.");
			extName = array[array.length - 1];
		}
		
		// 결과 반환
		// UUID.extName	(자바 6장에 배운내용 기록있음)
		return UUID.randomUUID().toString().replace("-", "") + "." + extName;	// 하이픈이 제거된 UUID값의 확장자??
		
	}

	
	// String tempPath 만들기
	public String getTempPath() {
		return "/storage" + sep + "temp";
	}
	
	// String tempfileName 만들기 (zip 파일)
	public String getTempfileName() {
		return UUID.randomUUID().toString().replace("-", "") + ".zip";
	}
	
	// String yesterdayPath 만들기
	public String getYesterdayPath() {
		LocalDate date = LocalDate.now();
		date.minusDays(1);	// 1일 전
		return "/storage" + sep +  date.getYear() + sep + String.format("%02d", date.getMonthValue()) + sep + String.format("%02d", date.getDayOfMonth());
	
	}
	
	
	
	
	
	
	
	
}
