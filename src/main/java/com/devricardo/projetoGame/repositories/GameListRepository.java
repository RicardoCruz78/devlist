package com.devricardo.projetoGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.projetoGame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{
	
	

}
