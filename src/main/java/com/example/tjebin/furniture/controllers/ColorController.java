package com.example.tjebin.furniture.controllers;

import java.io.File;
import java.io.Reader;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.tjebin.furniture.models.Color;
import com.example.tjebin.furniture.services.ColorService;

@RestController
@CrossOrigin(origins = "*")
public class ColorController {
    @Autowired
    ColorService service;

    @GetMapping("/api/tjebin/styles/{sid}/colors")
    public List<Color> findAllColorsForStyle(@PathVariable("sid") Long id) {
        return service.findAllColorsForStyle(id);
    }

    @PostMapping("/api/tjebin/styles/{sid}/colors")
    public Color createColorForStyle(@PathVariable("sid") Long id, @RequestBody Color color) {
        return service.createColorForStyle(id, color);
    }

    @DeleteMapping("/api/tjebin/colors/{cid}")
    public Integer deleteColor(
            @PathVariable("cid") Long id) {
        return service.deleteColor(id);
    }

    @PutMapping("/api/tjebin/colors")
    public Color updateColor(@RequestBody Color Color) {
        return service.updateColor(Color);
    }

    // const data = { 'id': req.body.id, 'image_name': name };
    // image upload from 'http://localhost:5000/upload/image'
    @PostMapping("/api/tjebin/colors/imagename")
    public Color uploadImage(@RequestBody Color color) {
        return service.saveImage(color);
    }
}