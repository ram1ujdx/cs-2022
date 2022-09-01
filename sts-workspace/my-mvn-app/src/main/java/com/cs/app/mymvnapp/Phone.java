package com.cs.app.mymvnapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Autowired
	private MusicPlayer player;
	
	

	public void playMusic(String song) {
		player.play(song);
	}
	
	public void pauseMusic() {
		player.pause();
	}

}
