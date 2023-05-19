package com.devricardo.projetoMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.projetoMovie.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {

}

