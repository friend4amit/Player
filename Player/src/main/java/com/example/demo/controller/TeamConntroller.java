package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Player;

@RestController
public class TeamConntroller {

	@RequestMapping("createteam")
	public void createUser(String teamID) {
		
		System.out.println("Player id "+teamID);
	}
	
	@RequestMapping("udpateTeam")
	public void updateUser(String id,Player Team) {
		
		System.out.println("Player id "+id);
	}
	
	@RequestMapping("getTeam")
	public void readUser(String id,String firstName) {
		
		System.out.println("Player id "+id);
	}
	
	@RequestMapping("deleteTeam")
	public void deleteUser(String id,String firstName) {
		System.out.println("Player id "+id);
	}

}
