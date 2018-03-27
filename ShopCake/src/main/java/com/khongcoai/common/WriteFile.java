package com.khongcoai.common;

import java.io.File;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

public class WriteFile {
	MultipartFile file;
	public void copyFile(MultipartFile file,HttpServletRequest request){
		if (file != null) {
			byte[] fileContent = null;
			try {
				InputStream inputStream = file.getInputStream();				
				if (inputStream == null)
				fileContent = IOUtils.toByteArray(inputStream);				
				String path = request.getSession().getServletContext().getRealPath("/") + "resources/images/";
				FileUtils.forceMkdir(new File(path));
				File upload = new File (path + file.getOriginalFilename());
				file.transferTo(upload);
				IOUtils.closeQuietly(inputStream);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
