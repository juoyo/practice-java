package com.apache.examples;

import java.util.*;

public class CollectionTraverse {
    public static void main(String[] args) {
        ListTraverse();
        SetTraverse();
        MapTraverse();
    }

    // 遍历set
    private static void SetTraverse() {
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        // 重复添加
        set.add("Java");
        set.add("JavaScript");

        // 使用iterator遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }

    // 遍历list
    private static void ListTraverse() {
        List<String> list = new ArrayList<>();
        list.add("菜");
        list.add("鸟");
        list.add("www.baidu.com");

        // iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for循环
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 增强for循环
        for (String value : list) {
            System.out.println(value);
        }
    }

    // 遍历Map
    private static void MapTraverse() {
        Map<String, String> hmap = new HashMap<String, String>();
        hmap.put("1", "PHP");
        hmap.put("2", "Java");
        hmap.put("3", "C");

        // 调用
        entrySetTradition(hmap);
    }
    private static void keySetFunction(Map<String, String> hmap) {
        Set<String> set = hmap.keySet();
        for (String key : set) {
            System.out.println(key + " : " + hmap.get(key));
        }
    }

    private static void keySetTradition(Map<String, String> hmap) {
        Set<String> set = hmap.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + hmap.get(it.next()));
        }
    }

    private static void entrySetFunction(Map<String, String> hmap) {
        Set<Map.Entry<String, String>> set = hmap.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void entrySetTradition(Map<String, String> hmap) {
        Set<Map.Entry<String, String>> set = hmap.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
