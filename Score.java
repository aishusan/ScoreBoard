public class Score {

	int[] points = { 0, 0 };
	int[] sets = { 0, 0 };
	int[] games = { 0, 0 };

	private boolean hasWon() {
		return false;
	}

	public void incrementPoint(int player) {

	}

	private void incrementGames(int player) {
		
		int otherPlayer = (player+1)%2;
        
        game[player]++;
        
        if(game[player] == 6 && game[player] - game[otherPlayer] >= 2) {
            incrementSet(player);
            resetGame();
        }
		
	}

	private void incrementSets(int player) {
	
		set[player]++;
	
	}

	public void resetPoints() {

	}

	public void resetGames() {

	}
}
