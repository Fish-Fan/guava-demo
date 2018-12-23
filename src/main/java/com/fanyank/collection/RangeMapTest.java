package com.fanyank.collection;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class RangeMapTest {
    //范围区间映射到某个值
    public static void main(String[] args) {
        RangeMap<Integer,String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1,3),"1,2,3");
        rangeMap.put(Range.open(7,9),"8");
        String value1 = rangeMap.get(1); //return 1,2,3
        String value2 = rangeMap.get(2); //return 1,2,3
        String value3 = rangeMap.get(3); //return 1,2,3

        String value7 = rangeMap.get(7); //return null
        String value8 = rangeMap.get(8); //return 8
        String value9 = rangeMap.get(9); //return null
    }
}
