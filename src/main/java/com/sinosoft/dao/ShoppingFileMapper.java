package com.sinosoft.dao;

import java.util.List;

import com.sinosoft.pojo.ShoppingFile;

public interface ShoppingFileMapper {
	
	void saveFile(ShoppingFile file);

	List<ShoppingFile> lookForPicture(String name);
}
