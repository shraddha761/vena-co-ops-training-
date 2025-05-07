package CollectionsFrameWork.Q11CompanyAsset;

public class Asset {
    private int assetId;
    private String name;
    private String department;

    Asset(int AssetID, String AssetName, String department) {
        this.assetId = AssetID;
        this.name = AssetName;
        this.department = department;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Asset ID: " + assetId + ", Name: " + name + ", Department: " + department;
    }
}
