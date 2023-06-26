package thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Jonh",30);
        hashMap.put("Jonh1",31);
        hashMap.put("Jonh2",29);
        hashMap.put("Jonh3",29);
        System.out.println("Display entries on hashmap");
        System.out.println(hashMap +"\n");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Jonh1",30);
        linkedHashMap.put("Jonh1",31);
        linkedHashMap.put("Jonh2",29);
        linkedHashMap.put("Jonh3",29);
        System.out.println("\n"+"The age for" + " Jonh1 is " + linkedHashMap.get("Jonh1") );
    }

}
