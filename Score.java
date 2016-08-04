public class Score {
	
	public static void main(String ag[]) {
		Score score = new Score();
		String input = "aaaaabaa";
		char[] in = input.toUpperCase().toCharArray();
		for (char ch : in) {
			score.incrementPoint(ch);
		}
	}

	int[] points = { 0, 0 };
	int[] sets = { 0, 0 };
	int[] games = { 0, 0 };

	private boolean hasWon(int player) {
		return sets[player] - sets[(1 - player)] >= 2;
	}

	public void incrementPoint(char ch) {
		int player = getPlayerFromChar(ch);
		points[player]++;
		int otherPlayer = 1 - player;
		int pointDifference = points[player] - points[otherPlayer];
		if ((pointDifference >= 2) && points[player] >= 4) {
			incrementGames(player);
			resetPoints();
		}

	}

	private void incrementGames(int player) {

		int otherPlayer = 1 - player;

		games[player]++;

		if (games[player] >= 6 && games[player] - games[otherPlayer] >= 2) {
			incrementSets(player);
			resetGames();
		}

	}

	private void incrementSets(int player) {

		sets[player]++;

	}

	public void resetPoints() {
		points[0] = 0;
		points[1] = 0;
	}

	public void resetGames() {
		games[0] = 0;
		games[1] = 0;
	}

	private int getPlayerFromChar(char ch) {
		if (ch == 'A')
			return 0;
		return 1;
	}
	
	public printScore() {
		System.out.println("A:" + sets[0] + games[0] + points[0]);
		System.out.println("B:" + sets[1] + games[1] + points[1]);	
	}

}
