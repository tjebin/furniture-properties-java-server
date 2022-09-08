package com.example.tjebin.furniture.models;

import javax.persistence.*;

@Entity
@Table(name="style")
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long furnitureId;
    private String imageName;

    public Style() {
    }
 
	public Style(Long id, String title, Long furnitureId, String imageName) {
		super();
		this.id = id;
		this.title = title;
		this.furnitureId = furnitureId;
		this.imageName = imageName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(Long furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
}