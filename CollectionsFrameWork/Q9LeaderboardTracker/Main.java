package CollectionsFrameWork.Q9LeaderboardTracker;

public class Main {
    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();

        leaderboard.addOrUpdatePlayer("Shraddha", 300);
        leaderboard.addOrUpdatePlayer("Ruhi", 400);
        leaderboard.addOrUpdatePlayer("Rohit", 600);
        leaderboard.addOrUpdatePlayer("Pratham", 700);
        leaderboard.printLeaderboard();

        System.out.println("After UpdatePlayer");
        leaderboard.addOrUpdatePlayer("Shraddha", 500);
        leaderboard.addOrUpdatePlayer("Pratham", 800);

        leaderboard.printLeaderboard();
    }
}
