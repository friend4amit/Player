package com.example.demo.dto;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@Data
public class Team {
	String teamID;
	String teamName;
	private List<Player> teamPlayers;	
}
