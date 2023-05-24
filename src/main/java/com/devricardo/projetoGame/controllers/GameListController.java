package com.devricardo.projetoGame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devricardo.projetoGame.dto.GameListDTO;
import com.devricardo.projetoGame.dto.GameMinDto;
import com.devricardo.projetoGame.services.GameListService;
import com.devricardo.projetoGame.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private  GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List <GameListDTO> findAll(){
		List <GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List <GameMinDto> findByList(@PathVariable Long listId){
		List <GameMinDto> result = gameService.findByList(listId);
		return result;
	}
} 
