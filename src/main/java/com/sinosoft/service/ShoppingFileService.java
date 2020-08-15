package com.sinosoft.service;

import java.util.List;

import com.sinosoft.pojo.ShoppingFile;

public interface ShoppingFileService {
	//保存文件
	void saveFile(ShoppingFile file);
	//查询轮播图
	List<ShoppingFile> lookForPicture(String name);
}
