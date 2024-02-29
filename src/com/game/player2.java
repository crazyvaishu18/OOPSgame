package com.game;

public class player2 extends player1 {
	private int health;
	private boolean armour;
	
	public player2( String name,String weapon,int health,boolean armour) {
		super(name, weapon,health);
		this.health=health;
		this.armour=armour;
		
	}
	 public void damageByGun1() {
		 if(armour) {
		 this.health-=20;
		 if(this.health<=0) 
			 this.health=0;
		 
		 System.out.println(" armour is on. got hit gun 1.health is reduced by 20"+",new health is"+this.health );
		 }
		 if(this.health==0) {
			 System.out.println(getName()+"is dead");
		 }
	 }
		 
	 public void damageByGun2() {
		 if(armour) {
		 this.health-=50;
		 if(this.health<=0) 
			 this.health=0;
		 
		 System.out.println("got hit gun 1.health is reduced by 50"+",new health is:"+this.health );
		 }
		 if(this.health==0) {
			 System.out.println(getName()+" is dead");
		 }
	 }
     public void heal() {
    	 super.heal();
    	 
     }
}





















