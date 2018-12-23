package com.fanyank.collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.sun.tools.javac.util.Name;

import java.util.Map;

public class TableTest {
    //Guava中的table允许你建立一对多值的映射
    public static void main(String[] args) {
        Table<String,String,Integer> table = HashBasedTable.create();
        table.put("v1","v2",1);
        table.put("v2","v3",2);
        table.put("v3","v3",3);
        Map<String,Integer> row1 = table.row("v1"); //return a Map mapping v2->1
        Map<String,Integer> column2 = table.column("v3"); //return a Map mapping v2->1,v3->3
    }
}
