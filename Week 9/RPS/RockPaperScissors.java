/*
 *RockPaperScissors.java
 *@author Frances Sheridan
 *5th Nov 2012
 */

 public class RockPaperScissors{
	 private String player1;
	 private int player2;
	 private String winner;
	 private int points;

	 public RockPaperScissors(){
		 player1 = new String();
		 player2 = (int)(Math.random()*3)+1;
		 winner = new String();
	 }

	 public void setPlayer1(String player1){
		 this.player1 = player1;
	 }

	 public void compute(){
		 if(player1.equalsIgnoreCase("Rock")){
			 if(player2 == 1){
				 winner = "draw";
				 points=+0;
			 }
			 else if(player2 == 2){
				 winner = "Player 2";
				 points=-1;
			 }
			 else{
				 winner = "Player 1";
				 points=+1;
			 }
		 }
		 else if(player1.equalsIgnoreCase("Paper")){
			 if(player2 == 1){
			 	 winner = "Player 1";
			 	  points=+1;
			 }
			 else if(player2 == 2){
			 	 winner = "draw";
			 	  points=+0;
			 }
			 else{
			 	 winner = "Player 2";
			 	  points=-1;
			 }
		 }
		 else if(player1.equalsIgnoreCase("Scissors")){
			 if(player2 == 1){
			 	 winner = "Player 2";
			 	 points=-1;
			 }
			 else if(player2 == 2){
			 	 winner = "Player 1";
			 	 points=+1;
			 }
			 else{
			 	 winner = "draw";
			 	 points=+0;

			 }
		 }
		 else{
			 winner = "Sorry, you have enered an invalid option.";
		 }
	 }


	 public String getWinner(){
		 return winner;
	 }
	 public int getPlayer2(){
	 		 return player2;
	 }
 }
