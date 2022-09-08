package com.example.tjebin.furniture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.tjebin.furniture.models.Color;
import com.example.tjebin.furniture.models.Style;
import com.example.tjebin.furniture.repositories.ColorRepository;
import com.example.tjebin.furniture.repositories.StyleRepository;

@Service
public class ColorService {

    @Autowired
    ColorRepository repository;

    //Styles of the Furniture
	public List<Color> findAllColorsForStyle(@PathVariable("sid") Long id) {
		return repository.findAllColorsForFurniture(id);
	}

	public Color createColorForStyle(Long id, Color color) {
		color.setStyleId(id);
		return  repository.save(color);
	}

	public Integer deleteColor(Long id) {
		 repository.deleteById(id);
		 return 1;
	}

	public Color updateColor( Color color) {
		return repository.save(color);
	}

	public Color saveImage(Color color) {
		Color colorById =  repository.getOne(color.getId());
		colorById.setImageName(color.getImageName());
		return repository.save(colorById);
	}
	
}
