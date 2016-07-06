package com.yicai.medialab.writingmaster.demo.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UpController {

	@RequestMapping("/page")
	public String upPage() {
		return "upload";
	}

	@RequestMapping("/action")
	public String upload(MultipartFile file, HttpServletRequest request) {
		try {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getContentType());
			System.out.println(file.getSize());
			byte[] bytes = file.getBytes();
			FileCopyUtils.copy(bytes, new File("/data", file.getOriginalFilename()));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return "upload";
	}
}
