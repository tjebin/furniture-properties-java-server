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
import com.example.tjebin.furniture.services.FurnitureService;

@RestController
@CrossOrigin(origins = "*")
public class FurnitureController {
    @Autowired
    FurnitureService service;

    @PostMapping("/api/tjebin/furnitures")
    public Furniture createWidgetFormaterial(
            @RequestBody Furniture furniture) {
        return service.createFurniture(furniture);
    }

    @GetMapping("/api/tjebin/furnitures")
    public List<Furniture> findAllFurnitures() {
        return service.findAllFurnitures();
    }

    @GetMapping("/api/tjebin/furnitures/{fid}")
    public Furniture findFurnitureById(@PathVariable("fid") Long id) {
        return service.findFurnitureById(id);
    }

    @DeleteMapping("/api/tjebin/furnitures/{fid}")
    public Integer deleteFurniture(
            @PathVariable("fid") Long id) {
        return service.deleteWidget(id);
    }

    @PutMapping("/api/tjebin/furnitures/{fid}")
    public Furniture updateFurniture(
            @PathVariable("fid") Long id,
            @RequestBody Furniture furniture) {
        return service.updateFurniture(id, furniture);
    }

}