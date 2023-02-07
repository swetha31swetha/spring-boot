package com.games.games.controller;

import com.games.games.entity.Children;
import com.games.games.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamesController {
    @Autowired
    private GamesService service;
    @PostMapping("/post")
    private String save(@RequestBody Children children){
        service.save(children);
        return "games";
    }
}
