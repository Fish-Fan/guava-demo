package com.fanyank.collection;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapTest {
    //BiMap可以实现key->value,value->key的双向映射
    public static void main(String[] args) {
        BiMap<String,Integer> nameForId = HashBiMap.create();
        nameForId.put("John",1);
        nameForId.put("Cherry",2);
        nameForId.put("Jackson",3);

        //反向获取，根据Id获取对应的名称
        String name = nameForId.inverse().get(1);
        System.out.println(name);
    }
}
