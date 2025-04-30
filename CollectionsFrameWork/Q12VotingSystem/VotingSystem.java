package CollectionsFrameWork.Q12VotingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingSystem {
    private Map<String, Integer> votingSystem = new HashMap<>();

    public void addVote(String voter) {
        votingSystem.put(voter, votingSystem.getOrDefault(voter, 0) + 1);
    }

    public void displayVote(){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(votingSystem.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        for(Map.Entry<String, Integer> entry : list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
