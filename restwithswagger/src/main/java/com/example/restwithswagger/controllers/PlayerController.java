package com.example.restwithswagger.controllers;

import com.example.restwithswagger.entity.Player;
import com.example.restwithswagger.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PlayerController {

    @Autowired
   /* private Player Kohli;*/
    private PlayerService playerService;

    @GetMapping(value = "/player")
    public List<Player> getPlayer(){
        return this.playerService.getAll();
    }

    @PostMapping(value = "/player", produces = "application/json", consumes = "application/json")
    public Player addPlayer(@Valid @RequestBody Player player){
        return this.playerService.addPlayer(player);
    }

    @GetMapping(value = "/player/{name}")
    public Player getPlayerByName(@RequestParam(value = "name") String name){
        return this.playerService.findByPlayerName(name);
    }

    @GetMapping(value = "/player/{id}")
    public Player getPlayerById(@RequestParam(value = "id") Long id){
        return this.playerService.findByPlayerId(id);
    }
}
