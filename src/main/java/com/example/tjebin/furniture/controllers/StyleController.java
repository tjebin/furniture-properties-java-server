package com.example.tjebin.furniture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tjebin.furniture.models.Furniture;
import com.example.tjebin.furniture.models.Style;
import com.example.tjebin.furniture.services.StyleService;

@RestController
@CrossOrigin(origins = "*")
public class StyleController {
    @Autowired
    StyleService service;
    
    @GetMapping("/api/tjebin/furnitures/{fid}/styles")
    public List<Style> findAllStylesForFurniture(@PathVariable("fid") Long id) {
        return service.findAllStylesForFurniture(id);
    }
    
    @PostMapping("/api/tjebin/furnitures/{fid}/styles")
    public Style createStyleForFurniture(@PathVariable("fid") Long id, @RequestBody Style style) {
    	return service.createStyleForFurniture(id, style);
    }
    
    @DeleteMapping("/api/tjebin/styles/{sid}")
    public Integer deleteStyle(
            @PathVariable("sid") Long id) {
        return service.deleteStyle(id);
    }

    @PutMapping("/api/tjebin/styles/{sid}")
    public Style updateStyle(
            @PathVariable("sid") Long id,
            @RequestBody Style style) {
        return service.updateStyle(id, style);
    }
    
    //const data = { 'id': req.body.id, 'imageName': name };
    //image upload from 'http://localhost:5000/upload/image'
    @PostMapping("/api/tjebin/styles/imagename")
    public Style uploadImage(@RequestBody Style style) {
        return service.saveImage(style);
    } 
}