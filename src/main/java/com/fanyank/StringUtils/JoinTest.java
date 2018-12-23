package com.fanyank.StringUtils;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;

import java.util.List;

public class JoinTest {
    public static void main(String[] args) {
        //Joiner
        //数组跳过null值
        Joiner joiner = Joiner.on(";").skipNulls();
        String str1 = joiner.join("A","B",null,"C");
        //数组不跳过null值
        Joiner joiner1 = Joiner.on(";").useForNull("null value is here");
        String str2 = joiner1.join("A","B",null,"C");

        List<Integer> list = Ints.asList(1,2,3,4,5);
        String str3 = Joiner.on("->").skipNulls().join(list);


        //Splitter
        List<String> afterSplitter = Splitter.on(",").trimResults().omitEmptyStrings().splitToList("foo,bar,,,   qux");
    }
}
