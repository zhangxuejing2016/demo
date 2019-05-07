//package com.xj.forMainMethod;
//
//import javafx.util.Pair;
//import org.apache.commons.lang.StringUtils;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// * Created by Administrator on 2017/11/28.
// */
//public class StringTest {
//    private String a = "";
////    public static void main(String[] args) {
////        String no1 = paddingZeroForNum(String.valueOf(123456789), 10);
////        System.out.println(no1);
////    }
////    private static String paddingZeroForNum(String num, int len) {
////        if (num.length() < len) {
////            if (len == 2) {
////                return "0" + num;
////            }
////            StringBuilder sb = new StringBuilder(num);
////            for (int i = 0; i < (len - num.length()); i++) {
////                sb.append("0");
////            }
////            return sb.toString();
////        }
////        return num;
////    }
//
//    public static void main(String[] args) {
//        Pair<Double, Double> p1 = new Pair<Double, Double>(0.1, 0.2);
//        Pair<Double, Double> p2 = new Pair<Double, Double>(0.3, 0.5);
//        Pair<Double, Double> p3 = new Pair<Double, Double>(0.2, 0.6);
//        Pair<Double, Double> p4 = new Pair<Double, Double>(0.2, 0.5);
//        ArrayList<Pair<Double, Double>> ls = new ArrayList<Pair<Double, Double>>();
//        ls.add(p1); ls.add(p2); ls.add(p3);ls.add(p4);
//        Collections.sort(ls, new Comparator<Pair<Double, Double>>() {
//            @Override
//            public int compare(Pair<Double, Double> o1, Pair<Double, Double> o2) {
//                if (o1.getKey() > o2.getKey()) return 1;
//                else if (o1.getKey() < o2.getKey()) return -1;
//                return 0;
//            }
//        });
//        System.out.println(ls);
//    }
//}
