package com.fanyank.collectionUtils;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

public class StaticConstructTest {
    public static void main(String[] args) {
        //初始化List
        ArrayList<Integer> list = Lists.newArrayList();
        //or use with JDK
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //带参初始化
        Integer[] array = {2,3,4};
        List<Integer> list2 = Lists.asList(1,array);
        //or
        List<Integer> list3 =  Ints.asList(1,2,3,4);
        //反转数组
        List<Integer> reverseList = Lists.reverse(list3);
        //partition
        List<List<Integer>> partitionArr = Lists.partition(list3,2);

    }
}
