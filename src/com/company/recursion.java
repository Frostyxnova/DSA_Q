package com.company;

public class recursion {
    public static void main(String[] args) {
        funrev(5);

        System.out.println(fact(5));
        int[] arr = {1,2,3,5,6,8};
        System.out.println(sorted(arr,0));

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funrev(int n) {
        if (n == 0) {
            return;
        }

        funrev(n - 1);
        System.out.println(n);
    }


    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    static boolean sorted(int[] arr, int index){
        // base condition
        if (index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
