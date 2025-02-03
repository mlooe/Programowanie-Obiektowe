package algorithm;

import java.util.HashMap;

public class algorithm {
    public static <K, V> int countUniqueKeys(HashMap<K, V> hashMap){
        return hashMap.keySet().size();
    }
}
