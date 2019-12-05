package com.example.restwithswagger.ifaces;

import com.example.restwithswagger.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<Player, Long> {
    public Player findByPlayerName(String playerName);
    public Player findByPlayerId(Long playerId);
}
