package com.example.tjebin.furniture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.tjebin.furniture.models.Style;

public interface StyleRepository
    extends JpaRepository<Style, Long> {

    @Query(value="SELECT * FROM style WHERE furniture_id=:fid", nativeQuery = true)
    public List<Style> findAllStylesForFurniture(@Param("fid") Long fid);

    @Query(value="DELETE FROM style WHERE id=:sid", nativeQuery = true)
	public void deleteStyleById(Long sid);

}
