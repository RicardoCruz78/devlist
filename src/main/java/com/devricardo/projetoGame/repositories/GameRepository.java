package com.devricardo.projetoGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.projetoGame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {

}
