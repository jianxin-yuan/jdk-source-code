package com.yuan.test.map;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yuan
 * @date 2020/7/7 2:48 下午
 */
public class HashMapTest {
    public static void main(String[] args) {

        List<Detail> list = new ArrayList<>();

        list.add(new Detail("111","s","fff"));
        list.add(new Detail("222","ss","fff"));
        list.add(new Detail("333","sss","fff"));
        list.add(new Detail("444","ssss","fff"));
        list.add(new Detail("555","sssss","fff"));
        list.add(new Detail("666","ssssss","fff"));


        Map<String, List<Detail>> collect = list.stream().collect(Collectors.groupingBy(Detail::getCode));

        System.out.println(collect);

    }
}
