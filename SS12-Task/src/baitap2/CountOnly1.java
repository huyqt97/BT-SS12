package baitap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOnly1 {
    public static void main(String[] args) {
        List<String> nameLists = Arrays.asList("phat", "hung", "phat", "hung", "hieu", "long");
        Map<String, Integer> nameMap = new HashMap<>();
        Map<String, Integer> nameMap1 = new HashMap<>();

        for (int i = 0; i < nameLists.size(); i++) {
            if (!nameMap.containsKey(nameLists.get(i))) {
                nameMap.put(nameLists.get(i), 1);
            } else {
                int count = nameMap.get(nameLists.get(i));
                nameMap.put(nameLists.get(i), count + 1);
            }

        }
        for (String name : nameMap.keySet()) {
            int count = nameMap.get(name);
            if (count == 1) {
                nameMap1.put(name, 1);


            }


        }
        System.out.println(nameMap1);

    }}


