package com.game;

public class Main {

	public static void main(String[] args) {
		player1 player=new player1("vaishu" ,"sword",100);
           
		// System.out.println(player.getName());
		 //System.out.println(player.getName());
		 //System.out.println(player.getName());
		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
	}

}
