/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hsh.mathutil.main;

import com.hsh.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    // from server 
    public static void sayHiFromServer() {
        
    }
    
    
    public static void main(String[] args) {
        
        // cách kiểm thử số 2 -  in ra tập tin or màn hình
        
        // test case 1 : check if 0! return 1
        
        int n = 0;
        
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        
        String msg = "0! =  | expected: "+ expectedResult
        + " actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
        
    }

//    public static void main(String[] args) {
//        
//        // TEST CASE 1 : N=0, HY VONG ==1
//        
//        int n = 0;
//        long expectedValue = 1; // hy vong tra ve 1
//        long actualValue; // cho ham xem tra ve bao nhieu
//        
//        actualValue = MathUtility.getFactorial(n);
//        
//        // so sánh 2 giá trị xem bằng nhau hay ko
//        
//        System.out.println("0 ! Expected: " + expectedValue);
//        System.out.println("Actual value : " + actualValue);
//    
//    
//        n = 1;
//        expectedValue = 1; // hy vong tra ve 1
//        
//        actualValue = MathUtility.getFactorial(n);
//        
//        // so sánh 2 giá trị xem bằng nhau hay ko
//        
//        System.out.println("0 ! Expected: " + expectedValue);
//        System.out.println("Actual value : " + actualValue);
//    
//        
//    }

    
}
