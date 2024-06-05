/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hsh.mathutil.core.test;

import com.hsh.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// quy ước đặt tên package
// tên miền đào ngược, chữ thường 100%  com.tenCongTy.tenDuAn.tenModule.tenClass  VD: com.microsoft.sqlserver.jdbc
// trong C# thì viết chiều xuôi và chữ hoa đầu từ   VD: Microsoft.Sqlserver

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
    
    // ở đây chứa các hàm để đi test hàm chính bên code chính, ở bên thư mục source, coi hàm chạy như dự kiến k, ổn k
    
    // ở đây ta làm các hàm ứng vs các test case
    
    // tên hàm mang ý nghĩa của test case (là 1 bộ data đưa vào app để verify hàm hay app có xử lí đúng k)
    
    // test case 1 : check hàm getFactorial with n = 0 => return 1
    
    @Test
    public void testFactoryGivenrightArg0ReturnWell() {
        int n = 0;
        // expected value : n = 0 -> 1
        
        // actual value :  ?
        
        long expectedValue = 1;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
        
    }
    
    @Test
    public void testFactoryGivenRightArg1ReturnWell() {
        int n = 1;
        long expectedValue = 1;
        long actualValue;   //  ?
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    
    // n = 2 expected : 2
    // n = 3 expected : 6
    // n = 5 expected : 120
    
    @Test
    public void testFactoryGivenRightArg235ReturnWell() {
        int n = 2;
        long expectedValue = 2;
        long actualValue;   //  ?
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
        
        assertEquals(6, MathUtility.getFactorial(3));
        
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
        int n = -1;
        
        //  expectedValue = Iligal Exeption;
        
        // màu xanh là chạy như kì vọng
        
        // do Exeption k là value nên k khai báo biến đc  -> hàm khác
        
        assertThrows(IllegalArgumentException.class, 
                () -> {
                    MathUtility.getFactorial(-1);
                } );
        
    }
    
 }  
    // phần kiến thức bổ sung vào CV
    
// TDD : Test Driven Development : là kĩ thuật viết code của dân DEV đi kèm với viết các test case để kiểm thử ngay những 
    // thứ mình vừa viết, tức là code của mỗi hàm luôn đi kèm code kiểm thử và kết quả kiểm thử hiển thị theo 2 màu xanh đỏ
    // và việc này cứ làm liên tục, viết code, viết test, kĩ thuật này là TDD, và mọi ngôn ngữ lập trình đều hỗ trợ bộ thư viện
    // framwork, giúp test code 2 màu xanh đổ gọi là unit testing framework ---> mọi ngôn ngữ đều có TDD


// DDT : data driven testing : 
    // ddt là phần mở rộng thêm khi viết Unit test, kĩ thuật nâng cao để giúp tổ chức các test case
    // kĩ thuật viết testcase mà ta tách riêng phần data ra khỏi câu lệnh cho dễ quản lí các test case
    // vì câu lẹnh expected trở nên gọn nhẹ hơn





// đề bài thuyết trình nhóm, nhóm hãy chon 1 unit test framework để demo
// vào google gõ Unit test framework for ... Java, C#,...