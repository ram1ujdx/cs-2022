package com.cs.app.mymvnapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Phone {
	
	@Autowired
	private MusicPlayer player;
	
	public Phone() {
		System.out.println("Phone Object Created");
	}

	public void playMusic(String song) {
		player.play(song);
	}
	
	public void pauseMusic() {
		player.pause();
	}

}
