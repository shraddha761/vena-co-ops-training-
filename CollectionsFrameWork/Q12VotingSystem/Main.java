package CollectionsFrameWork.Q12VotingSystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Shraddha");
        votingSystem.castVote("Ruhi");
        votingSystem.castVote("Ranjana");
        votingSystem.castVote("Pratham");
        votingSystem.castVote("Shraddha");

        votingSystem.displayResult();

    }
}
