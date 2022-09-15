package com.mygame;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) throws InterruptedException {
		
		Logic game = new Logic();
		System.out.println(Integer.toHexString(game.hashCode()));
		System.out.println(game.hashCode());
		game.setPlayerName();
		
	}

}


//Rock    = 1
//Paper   = 2
//Scissor = 3
