package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Player;
import com.example.demo.repository.PlayerRepository;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerRepository playerRepo;
	
	@RequestMapping("getplayer")
	public Player getPlayer(String id) {
		System.out.println("Player id "+id);
		return playerRepo.getPlayerById(id);
	}
	
	@RequestMapping("createplayer")
	public void createPlayer(String id,String firstName) {
		
		System.out.println("Player id "+id);
		System.out.println("Player firstName "+firstName);
		playerRepo.createPlayer(id, firstName);
	}
	
	@RequestMapping("udpateplayer")
	public void updatePlayer(String id,String firstName) {
		
		System.out.println("Player id "+id);
	}
	
	
	@RequestMapping("deleteplayer")
	public void deletePlayer(String id,String firstName) {
		System.out.println("Player id "+id);
	}

}
