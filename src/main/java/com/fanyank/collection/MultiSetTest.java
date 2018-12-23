package com.fanyank.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Iterator;
import java.util.Map;

public class MultiSetTest {
    public static void main(String[] args) {
        Multiset<String> set = HashMultiset.create();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("1");
        //get each item counts
        for(String item : set.elementSet()) {
            System.out.println("item: " + item + ", counts: " + set.count(item));
        }
        //print
        System.out.println(set.toString());
    }
}
