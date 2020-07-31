/*
实例演示了如何使用 Collections 类 的collection.add() 来添加数据,
使用 collection.size()来计算集合的长度
 */
package com.apache.examples;

import java.util.*;

public class CollectionLength {
    public static void main(String[] args) {
        System.out.println("集合实列！\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);

        System.out.println("集合数据:");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        if (collection.isEmpty()) {
            System.out.println("集合空");
        } else  {
            System.out.println("集合长度：" + size);
        }
        System.out.println();
    }
}
