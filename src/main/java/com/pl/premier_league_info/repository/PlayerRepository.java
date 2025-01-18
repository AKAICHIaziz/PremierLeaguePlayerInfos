package com.pl.premier_league_info.repository;

import com.pl.premier_league_info.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    public void deletePlayerByName(String playerName);

    Optional<Player> findPlayerByName(String name);

}
