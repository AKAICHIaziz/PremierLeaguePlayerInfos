package com.pl.premier_league_info.service;

import com.pl.premier_league_info.model.Player;
import com.pl.premier_league_info.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByTeam(String teamName) {
        return playerRepository.findAll()
                .stream()
                .filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll()
                .stream()
                .filter(player -> player.getName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByPosition(String searchText) {
        return playerRepository.findAll()
                .stream()
                .filter(player -> player.getPosition().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByNation(String searchText) {
        return playerRepository.findAll()
                .stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position){
        return playerRepository.findAll()
                .stream()
                .filter(player -> team.equals(player.getTeam()) && position.equals(player.getPosition()))
                .collect(Collectors.toList());
    }

    public Player addPlayer (Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findPlayerByName(updatedPlayer.getName());
        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPosition(updatedPlayer.getPosition());
            playerToUpdate.setNation(updatedPlayer.getNation());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    // mantain data integrity during the delete
    @Transactional
    public void deletePLayerByName(String playerName) {
        playerRepository.deletePlayerByName(playerName);
    }

}
