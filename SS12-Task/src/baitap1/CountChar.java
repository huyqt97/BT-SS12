package baitap1;

import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        List<String> nameLists = Arrays.asList("phat","hung","phat","hung","hieu","long");
        Map<String,Integer> nameMap = new HashMap<>();
        for (int i = 0; i < nameLists.size(); i++) {
            if(!nameMap.containsKey(nameLists.get(i))){
                nameMap.put(nameLists.get(i),1);}
                else {
                    int count = nameMap.get(nameLists.get(i));
                    nameMap.put(nameLists.get(i),count +1);
                }

            }
        System.out.println(nameMap);

        }
    }

