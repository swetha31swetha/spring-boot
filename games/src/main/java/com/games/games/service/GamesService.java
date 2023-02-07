package com.games.games.service;

import com.games.games.entity.Children;
import com.games.games.repository.ChildrenRepository;
import com.games.games.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService {
    @Autowired
    private ChildrenRepository repository;
    @Autowired
    private GamesRepository gamesRepository;
    public String save(Children children){
        repository.saveAndFlush(children);
        return "games";
    }
}
