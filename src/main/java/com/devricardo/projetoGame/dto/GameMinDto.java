package com.devricardo.projetoGame.dto;

import com.devricardo.projetoGame.entities.Game;
import com.devricardo.projetoGame.projections.GameMinProjection;

import jakarta.persistence.Column;

public class GameMinDto {
	
	private long id;
	private String title;
	private Integer year;	
	private String  imgUrl;	
	private String shortDescription;	
	
	public GameMinDto() {
		
	}

	public GameMinDto(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
public GameMinDto(GameMinProjection projection) {
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
