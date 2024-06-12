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
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n-1);
    }   
    
    
}


// test lại khi sửa code

// junit : việc test lại code cực nhanh, chỉ cần thấy màu xanh (đưa unit test và cài CI trên github)

// kiểm thử những cái đã kiểm thử gọi là regression, nên dùng tự động bằng jnit test framework
