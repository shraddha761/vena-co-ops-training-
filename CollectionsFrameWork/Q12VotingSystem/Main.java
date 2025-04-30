package CollectionsFrameWork.Q12VotingSystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.addVote("Shraddha");
        votingSystem.addVote("Ruhi");
        votingSystem.addVote("Ranjana");
        votingSystem.addVote("Pratham");
        votingSystem.addVote("Shraddha");

        votingSystem.displayVote();

    }
}
