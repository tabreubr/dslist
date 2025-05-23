package com.thiagoabreu.dslist.repositories;

import com.thiagoabreu.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
