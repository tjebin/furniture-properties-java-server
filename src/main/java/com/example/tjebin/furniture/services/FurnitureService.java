package com.example.tjebin.furniture.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tjebin.furniture.models.Furniture;
import com.example.tjebin.furniture.repositories.FurnitureRepository;

@Service
public class FurnitureService {

    @Autowired
    FurnitureRepository repository;

    public Furniture createFurniture( Furniture furniture) {
    	furniture.setLastModified(new Date());
        return repository.save(furniture);
    }

    public List<Furniture> findAllFurnitures() {
        return repository.findAllFurnitures();
    }

    public Integer deleteWidget(Long id) {
        repository.deleteById(id);
        return 1;
    }

    public Furniture findFurnitureById(Long id) {
    	
    	System.out.println("  .................Furniture retrieved- get Title ........."+repository.findFurnitureById(id).getTitle());
    	return repository.findFurnitureById(id);
    }

    public Furniture updateFurniture(Long id, Furniture furniture) {
        Furniture newFurniture = furniture;
        Furniture originalFurniture = findFurnitureById(id);
        originalFurniture.setTitle(newFurniture.getTitle());
        repository.save(originalFurniture);
        return originalFurniture;
    }
    
}
