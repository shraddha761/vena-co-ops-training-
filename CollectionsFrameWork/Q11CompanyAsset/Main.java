package CollectionsFrameWork.Q11CompanyAsset;

public class Main {
    public static void main(String[] args) {
        AssetTracker tracker = new AssetTracker();

        tracker.addAsset("IT", new Asset(1001, "Laptop", "IT"));
        tracker.addAsset("HR", new Asset(1001, "Projector", "HR"));
        tracker.addAsset("SALE", new Asset(1003, "Mic", "SALE"));
        tracker.addAsset("CORE", new Asset(1001, "Mouse", "CORE"));
        tracker.addAsset("HR", new Asset(1005, "Mobile", "HR"));

        tracker.printAssets();
    }
}
