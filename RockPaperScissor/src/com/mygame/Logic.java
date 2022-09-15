package com.mygame;

import java.util.Random;
import java.util.Scanner;

public class Logic  {
	public static void main(String args[]) throws InterruptedException {	
		Logic game = new Logic();
		game.setPlayerName();	
	}
	
	String PlayerName;
	boolean retry;
	
	void setPlayerName() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		while(PlayerName == null) {
			System.out.print("Please enter your name>>> ");
			PlayerName=sc.next();
		}
		System.out.println("Hi "+PlayerName+", Welcome to game!");
		setValues();
	}
	
	
	void setValues() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int y=0;
		if(retry == true) {
			while(y<1 || y>2) {
				System.out.print("Do you want to retry\n1.Yes\n2.No\n>>> ");
				y = sc.nextInt();
			}
		}else {y=1;}
		
		if(y==1) {
			int x=0;
			while(x<1 || x>3) {
				System.out.print("Please Select any of following\n1.Stone\n2.Paper\n3.Scissor\n>>> ");
				x = sc.nextInt();
			}	
			startGame(x ,new Random().nextInt(2)+1);
		}else {System.out.println("Thank you "+PlayerName+" for playing a game!");}
	}
	
	//Rock    = 1
	//Paper   = 2
	//Scissor = 3
	private void startGame(int x, int y) throws InterruptedException{
		System.out.print("Getting Results.");
		for(int i=0; i<=5;i++) {
			Thread.sleep(200);
			System.out.print(".");
		}System.out.println();
			if(x==1) {
				if(y==1) {
					System.out.println("Tie: "+PlayerName+" and computer both selected stone");
				}else if(y==2){
					System.out.println("Computer Win :"+PlayerName+" selected stone and computer selected paper");
				}else if(y==3){
					System.out.println("You Win :"+PlayerName+" selected stone and computer selected paper");	
				}
			}else if(x==2){
				if(y==1) {
					System.out.println("You Win :"+PlayerName+" selected paper and computer selected stone");
				}else if(y==2){
					System.out.println("Tie: "+PlayerName+" and computer both selected paper");
				}else if(y==3){
					System.out.println("Computer Win :"+PlayerName+" selected paper and computer selected scissor");
				}			
			}else if(x==3){
				if(y==1) {
					System.out.println("Computer Win :"+PlayerName+" selected scissor and computer selected stone");
				}else if(y==2){
					System.out.println("You Win :"+PlayerName+" selected scissor and computer selected paper");
				}else if(y==3){
					System.out.println("Tie: "+PlayerName+" and computer both selected scissor");
			}
		}	
		retry=true;
		setValues();
	}
}
