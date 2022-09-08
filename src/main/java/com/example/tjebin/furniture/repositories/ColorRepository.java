package com.example.tjebin.furniture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.tjebin.furniture.models.Color;

public interface ColorRepository
    extends JpaRepository<Color, Long> {

    @Query(value="SELECT * FROM color WHERE style_id=:sid", nativeQuery = true)
	public List<Color> findAllColorsForFurniture( @Param("sid") Long sid);

}
