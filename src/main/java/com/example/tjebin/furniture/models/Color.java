package com.example.tjebin.furniture.models;

import javax.persistence.*;

@Entity
@Table(name="color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long styleId;
    private String imageName;

    public Color() {
    }
 
	public Color(Long id, String title, Long colorId, String imageName) {
		super();
		this.id = id;
		this.title = title;
		this.styleId = colorId;
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

	public Long getStyleId() {
		return styleId;
	}

	public void setStyleId(Long styleId) {
		this.styleId = styleId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Color [id=" + id + ", title=" + title + ", styleId=" + styleId + ", imageName=" + imageName + "]";
	}
	
	
	
}