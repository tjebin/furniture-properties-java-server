package com.example.tjebin.furniture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.tjebin.furniture.models.Material;

public interface MaterialRepository
    extends JpaRepository<Material, Long> {

    @Query(value="SELECT * FROM material WHERE color_id=:cid", nativeQuery = true)
    public List<Material> findAllMaterialsForColor(@Param("cid") Long fid);

}
