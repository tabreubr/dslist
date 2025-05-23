package com.thiagoabreu.dslist.services;

import com.thiagoabreu.dslist.dto.GameListDTO;
import com.thiagoabreu.dslist.entities.GameList;
import com.thiagoabreu.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
