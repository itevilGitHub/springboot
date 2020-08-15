package com.sinosoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.pojo.ShoppingFile;
import com.sinosoft.service.ShoppingFileService;

@RestController
public class FileManageController {
	
	@Autowired
	private ShoppingFileService service;
	
	@RequestMapping("/lookForPicture")
	public List<ShoppingFile> lookForPicture(HttpServletRequest request){
		String name = request.getParameter("name");
		List<ShoppingFile> list = service.lookForPicture(name);
		return list;
	}
}
