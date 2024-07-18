import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class accountsMerge {
    public List<List<String>> graphConnected(List<List<String>> accounts){
        Map<String, List<Integer>> emailToldx = new HashMap<>();
        for(int i = 0;i < accounts.size();i++){
            for(int k = 1; k < accounts.get(1).size();k ++){
                emailToldx.computeIfAbsent(accounts.get(i).get(k),x -> new ArrayList<>()).add(i);
            }
        }
    }



}
