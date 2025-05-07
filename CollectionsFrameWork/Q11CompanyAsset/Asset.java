package CollectionsFrameWork.Q11CompanyAsset;

public class Asset {
    private int assetId;
    private String name;
    private String department;

    Asset(int assetID, String assetName, String department) {
        this.assetId = assetID;
        this.name = assetName;
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
