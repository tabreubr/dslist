package com.thiagoabreu.dslist.services;


import com.thiagoabreu.dslist.dto.GameMinDTO;
import com.thiagoabreu.dslist.entities.Game;
import com.thiagoabreu.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
