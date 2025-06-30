package org.example;

public class Calculate {
    // 两个数的和
    public int sum(int x, int y) {
        return x + y;
    }
    
    // 两个数的平均值
    public double average(int x, int y) {
        return (x + y) / 2.0;
    }
    
    // 两个数之间所有数的和(包括这两个数)
    public int sumBetween(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    
    // 两个数之间所有奇数的和
    public int sumOddBetween(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    // 两个数之间所有偶数的和
    public int sumEvenBetween(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}