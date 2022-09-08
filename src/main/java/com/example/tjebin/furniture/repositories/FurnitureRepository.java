package com.example.tjebin.furniture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.tjebin.furniture.models.Furniture;

public interface FurnitureRepository
    extends PagingAndSortingRepository<Furniture, Long> {

    @Query(value="SELECT * FROM furniture WHERE id=:wid", nativeQuery = true)
    public Furniture findFurnitureById(@Param("wid") Long widgetId);

    @Query(value="SELECT * FROM furniture", nativeQuery = true)
    public List<Furniture> findAllFurnitures();
}
