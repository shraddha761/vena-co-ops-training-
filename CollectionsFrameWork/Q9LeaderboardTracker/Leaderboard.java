package CollectionsFrameWork.Q9LeaderboardTracker;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Leaderboard {
    Comparator<Player> comparator = (p1, p2) ->{
        int score = Integer.compare(p2.score , p1.score);
        return score;
    };
    private TreeSet<Player> leaderboard = new TreeSet<>(comparator);
    private Map<String, Player> playersMap = new HashMap<>();

    void addOrUpdatePlayer(String name, int score) {
        if(playersMap.containsKey(name)){
            Player existing = playersMap.get(name);
            leaderboard.remove(existing);
            existing.setScore(score);
            leaderboard.add(existing);
        }
        else{
            Player newPlayer = new Player(name, score);
            leaderboard.add(newPlayer);
            playersMap.put(name, newPlayer);
        }
    }
    void printLeaderboard(){
        for(Player player : leaderboard){
            System.out.println(player.name  + " " + player.getScore());
        }
    }
}
