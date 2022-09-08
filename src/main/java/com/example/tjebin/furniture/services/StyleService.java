package com.example.tjebin.furniture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.tjebin.furniture.models.Furniture;
import com.example.tjebin.furniture.models.Style;
import com.example.tjebin.furniture.repositories.ColorRepository;
import com.example.tjebin.furniture.repositories.StyleRepository;

@Service
public class StyleService {

    @Autowired
    StyleRepository repository;

    //Styles of the Furniture
	public List<Style> findAllStylesForFurniture(@PathVariable("fid") Long id) {
		return repository.findAllStylesForFurniture(id);
	}

	public Style createStyleForFurniture(Long id, Style style) {
		style.setFurnitureId(id);
		return  repository.save(style);
	}

	public Integer deleteStyle(Long id) {
		 repository.deleteStyleById(id);
		 return 1;
	}

	public Style updateStyle(Long id, Style style) {
		return repository.save(style);
	}
	
	public Style saveImage(Style style) {
		Style styleById =  repository.getOne(style.getId());
		styleById.setImageName(style.getImageName());
		return repository.save(styleById);
	}
}
