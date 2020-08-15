package com.sinosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.dao.ShoppingFileMapper;
import com.sinosoft.pojo.ShoppingFile;
import com.sinosoft.service.ShoppingFileService;

@Service
public class ShoppingFileServiceImpl implements ShoppingFileService {
	
	@Autowired
	private ShoppingFileMapper mapper;
	
	@Override
	public void saveFile(ShoppingFile file) {
		mapper.saveFile(file);
	}

	@Override
	public List<ShoppingFile> lookForPicture(String name) {
		
		return mapper.lookForPicture(name);
	}

}
