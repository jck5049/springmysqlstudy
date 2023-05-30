package com.gdu.app11.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface UploadService {
	
	public void getUploadList(HttpServletRequest request, Model model);
	
	// 파일업로드일땐 MultipartHttpServletRequest를 사용한다.
	public int addUpload(MultipartHttpServletRequest multipartRequest);
	
	public void getUploadByNo(int uploadNo, Model model);
	public ResponseEntity<byte[]> display(int attachNo);
	public ResponseEntity<Resource> download(int attachNo, String userAgent);
	public ResponseEntity<Resource> downloadAll(int attachNo);
	public int removeUpload(int uploadNo);
	public int modifyUpload(MultipartHttpServletRequest multipartRequest);
	public int removeAttach(int attachNo);
}
