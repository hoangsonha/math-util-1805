/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsh.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    
    // ta sẽ viết những hàm cung cấp các tiện ích toán học
    // các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    // thì sẽ đc thiết kế static
    // static sẽ đc gọi trực tiếp qua tên class
    
    public static long getFactorial(int n) {
        long product = 1;
        
        if(n < 0 || n > 20)
               throw new IllegalArgumentException("invalid n, n must be in [0 - 20]");
        if(n == 0)
            return 1;
        
        for (int i = 1; i <= n; i++) {
            product *= i;
            
        }
        return product;
    }   
    
    
}
