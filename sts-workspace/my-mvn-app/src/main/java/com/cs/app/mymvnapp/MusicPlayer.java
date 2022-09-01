package com.cs.app.mymvnapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	@Value("${vol}")
	private int vol;

	public void play(String song) {
		System.out.println("Playing "+song+".. Volume : "+vol);
	}
	
	public void pause() {
		System.out.println("Music Paused");
	}
	
}
