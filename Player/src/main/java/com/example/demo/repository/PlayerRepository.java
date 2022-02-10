package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Player;

@Repository
public class PlayerRepository {
	
	public List<Player> playerList = new ArrayList();
	
	public List<Player> getPlayerList(){
		return playerList;
	}

	public Player getPlayerById(String id) {
		Player playerbyId=null;
		for(Player player:playerList) {
			if(id.equals(player.getId())){
				playerbyId= player;
			}
		}
		System.out.println("Player by ID *******"+playerbyId);
		return playerbyId;
		
	}

	public void createPlayer(String id, String firstName) {
		Player player=new Player();
		player.setId(id);
		player.setFirstName(firstName);
		
		playerList.add(player);
		System.out.println(" *** Player List "+playerList.toString());
		
	}
}
