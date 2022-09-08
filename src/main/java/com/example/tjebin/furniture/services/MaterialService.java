package com.example.tjebin.furniture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tjebin.furniture.models.Color;
import com.example.tjebin.furniture.models.Material;
import com.example.tjebin.furniture.repositories.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    MaterialRepository repository;

	public List<Material> findAllMaterialsForColor(Long id) {
		return repository.findAllMaterialsForColor(id);
	}

	public Material createMaterialForColor(Long id, Material material) {
		return repository.save(material);
	}

	public Integer deleteMaterial(Long id) {
		repository.deleteById(id);
		return 1;
	}

	public Material updateMaterial(Material material) {
		return repository.save(material);
	}
	
	public Material saveImage(Material material) {
		Material materialById =  repository.getOne(material.getId());
		materialById.setImageName(material.getImageName());
		return repository.save(materialById);
	}
}
