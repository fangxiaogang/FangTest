package com.xiaogang.test.fangtest;

public class returntest {

    public static void main(String[] args) {
        int i = test();
       System.out.println(i+"test");
    }
//    public static void main(){
//       int i = test();
////        System.out.println(i);
//    }
//
    private static int test() {
        if (true) {
            return 2;
        }
        return 3;
    }
}

