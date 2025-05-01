package CollectionsFrameWork.Q11CompanyAsset;

public class Asset {
    int assetId;
    String name;
    String department;

    Asset(int AssetID, String AssetName, String department) {
        this.assetId = AssetID;
        this.name = AssetName;
        this.department = department;
    }

    public String toString() {
        return "Asset ID: " + assetId + ", Name: " + name + ", Department: " + department;
    }
}
