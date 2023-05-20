package com.devricardo.projetoGame.dto;

import com.devricardo.projetoGame.entities.GameList;

public class GameListDTO {
	
	public Long id;
	public String name;

	public GameListDTO() {
		
	}
	public GameListDTO (GameList entity) {
		id = entity.getId();
		name = entity.getName();
		
	}
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
