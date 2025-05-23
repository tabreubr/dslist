package com.thiagoabreu.dslist.services;


import com.thiagoabreu.dslist.dto.GameDTO;
import com.thiagoabreu.dslist.dto.GameMinDTO;
import com.thiagoabreu.dslist.entities.Game;
import com.thiagoabreu.dslist.services.exception.ObjectNotFoundException;
import com.thiagoabreu.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return gameRepository.findById(id)
                .map(GameDTO::new)
                .orElseThrow(() -> new ObjectNotFoundException("Game not found with id: " + id));
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }


}
