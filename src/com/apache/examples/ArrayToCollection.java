/*
使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
同 Collection.toArray 一起，充当了基于数组的 API 与基于 collection 的 API 之间的桥梁
 */
package com.apache.examples;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
    public static void main(String args[]) throws IOException {
        int n = 5;
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for (String li : list) {
            String str = li;
            System.out.print(str + " ");
        }

    }
}
