package com.example.tjebin.furniture.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="furniture")
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String owner;
    private Date lastModified;
    private String imageName;

    public Furniture() {
    }
 
    public Furniture(Long id, String title, String owner, Date lastModified, String imageName) {
		super();
		this.id = id;
		this.title = title;
		this.owner = owner;
		this.lastModified = lastModified;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}