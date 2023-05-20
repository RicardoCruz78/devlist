package com.devricardo.projetoGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devricardo.projetoGame.dto.GameMinDto;
import com.devricardo.projetoGame.entities.Game;
import com.devricardo.projetoGame.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
		
	}

}
