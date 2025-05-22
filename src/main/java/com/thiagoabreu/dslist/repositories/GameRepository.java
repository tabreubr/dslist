package com.thiagoabreu.dslist.repositories;

import com.thiagoabreu.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
