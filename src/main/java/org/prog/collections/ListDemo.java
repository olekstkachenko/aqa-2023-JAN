package org.prog.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String... args) {
        List<String> aList = new ArrayList<>();

        aList.add("kmdf lkndfg");//0
        aList.add("xcvpmaspdj");//1
        aList.add("xc vlmndof");//2
        aList.add("xclmvnoihwa");//3
        aList.add("aslm cphd");
        aList.add("laqpsdnfk");
        aList.add("ccccc");
        aList.add("cjvh cwjlbef");
        aList.add("asdazxcpiqwensd");

        System.out.println(aList.size());

        aList.remove(3);
        aList.remove("ccccc");


        System.out.println(aList.size());

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        //stream demo here
        //NO STREAM SOLUTION
//        List<Integer> strLength = new ArrayList<>();
//        for (String s : aList) {
//            if (!s.contains(" ")) {
//                strLength.add(s.length());
//            }
//        }

        //STREAM SOLUTION
        List<Integer> streamIntList = aList.stream()
                .filter(s -> !s.contains(" "))
                .map(s -> s.length())
                .collect(Collectors.toList());

        for (Integer i : streamIntList) {
            System.out.println(i);
        }
    }
}
