package com.example.restwithswagger.services;

import com.example.restwithswagger.entity.Player;
import com.example.restwithswagger.ifaces.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repo;

    public List<Player> getAll(){
        return this.repo.findAll();
    }

    public Player addPlayer(Player player){
        return this.repo.save(player);
    }

    public Player findByPlayerName(String playerName){
        return this.repo.findByPlayerName(playerName);
    }

    public Player findByPlayerId(Long playerId){
        return this.repo.findByPlayerId(playerId);
    }

}
