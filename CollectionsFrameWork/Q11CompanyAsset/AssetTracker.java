package CollectionsFrameWork.Q11CompanyAsset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssetTracker {
    Map<String, Set<Asset>> assets = new HashMap<>();
    Set<Integer> globalAssetIds = new HashSet<>();

    public void addAsset(String departmentName, Asset asset) {
        if(globalAssetIds.contains(asset.getAssetId())){
            System.out.println("Already added asset" + asset.getAssetId());
            return;
        }
            assets.computeIfAbsent(departmentName, k -> new HashSet<>()).add(asset);
            globalAssetIds.add(asset.getAssetId());
    }

    void printAssets() {
        for(String departmentName : assets.keySet()){
            Set<Asset> assetSet = assets.get(departmentName);
            System.out.println("Department: " + departmentName);
            for(Asset asset : assetSet){
                System.out.println(departmentName + ": " + asset);
            }
        }
    }
}
