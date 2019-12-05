package com.example.bootquickstart.ifaces;

import com.example.bootquickstart.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface PlayerRepository extends JpaRepository <Player, Long> {
    public Player findByPlayerName(String playerName);
    public Player findByPlayerId(Long playerId);
}
