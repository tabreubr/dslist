package com.thiagoabreu.dslist.services;

import com.thiagoabreu.dslist.dto.GameListDTO;
import com.thiagoabreu.dslist.entities.GameList;
import com.thiagoabreu.dslist.projections.GameMinProjection;
import com.thiagoabreu.dslist.repositories.GameListRepository;
import com.thiagoabreu.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    @Autowired
    public GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = 0; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

}
