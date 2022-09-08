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

import com.example.tjebin.furniture.models.Color;
import com.example.tjebin.furniture.models.Material;
import com.example.tjebin.furniture.services.MaterialService;

@RestController
@CrossOrigin(origins = "*")
public class MaterialController {
    @Autowired
    MaterialService service;
    
    @GetMapping("/api/tjebin/colors/{cid}/materials")
    public List<Material> findAllMaterialsForColor(@PathVariable("cid") Long id) {
        return service.findAllMaterialsForColor(id);
    }
    
    @PostMapping("/api/tjebin/colors/{cid}/materials")
    public Material createMaterialForStyle(@PathVariable("cid") Long id, @RequestBody Material material) {
    	material.setColorId(id);
    	return service.createMaterialForColor(id, material);
    }
    
    @DeleteMapping("/api/tjebin/materials/{mid}")
    public Integer deleteMaterial(
            @PathVariable("mid") Long id) {
        return service.deleteMaterial(id);
    }

    @PutMapping("/api/tjebin/materials")
    public Material updateMaterial(
            @RequestBody Material material) {
        return service.updateMaterial(material);
    }
    
    // const data = { 'id': req.body.id, 'image_name': name };
    //image upload from 'http://localhost:5000/upload/image'
    @PostMapping("/api/tjebin/materials/imagename")
    public Material uploadImage(@RequestBody Material material) {
        return service.saveImage(material);
    }
}