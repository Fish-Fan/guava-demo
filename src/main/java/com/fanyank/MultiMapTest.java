package com.fanyank;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MultiMapTest {
    public static void main(String[] args) {
        Multimap<String,Integer> map = ArrayListMultimap.create();
        map.put("item1",1);
        map.put("item1",2);
        map.put("item1",3);
        map.put("item2",1);
        map.put("item3",1);
        //遍历Map
        for(String s : map.keySet()) {
            List<Integer> collection = (List<Integer>) map.get(s);
            System.out.println(collection);
        }
        //获取原生Map
        Map<String, Collection<Integer>> originMap = map.asMap();
        List<Integer> list = (List<Integer>) map.get("item4");
        //containsKey
        boolean isHasKey = map.containsKey("item3");
        System.out.println("is has key: " + isHasKey);
        map.removeAll("item3");
        isHasKey = map.containsKey("item3");
        System.out.println("is has key: " + isHasKey);
    }
}
