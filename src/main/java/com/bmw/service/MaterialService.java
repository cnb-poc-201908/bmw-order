package com.bmw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmw.entity.Materials;
import com.bmw.entity.MaterialsExample;
import com.bmw.mapper.MaterialsMapper;

@Service
public class MaterialService {

	@Autowired
	private MaterialsMapper materialsMapper;

	public List<Materials> getMaterialsList(){
		MaterialsExample example = new MaterialsExample();
		return materialsMapper.selectByExample(example);
	}
}
