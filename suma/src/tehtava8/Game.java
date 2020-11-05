package tehtava8;

abstract class Game {
	
	protected int playerCount;
	
	abstract void initializeGame();
	abstract void makePlay(int player);
	abstract boolean endOfGame();
	abstract void printWinner();
	
	/*A template method*/
	public final void playOneGame(int playersCount) {
		
		// Amount of players
		this.playerCount = playersCount;
		
		// Start algorith for the game (prepare things for the game)
		initializeGame();
		
		int i = 0;
		while(!endOfGame()) {
			
			// One player make one move depending on the game rules
			makePlay(i);
			
			// Get the next player
			i = (i + 1) % playersCount;
			
		}
		
		// Print the winner of the game 1...N
		printWinner();
	}

}
