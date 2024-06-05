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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {

    // chuẩn bị data sau này sẽ đưa vào assert của framework
    // data này sẽ từ từ đc chích vào trong assert(), nó phải nắm trong hàm static (nằm cố định ở 1 vùng ram, static chỉ có 1 vùng RAM)
    // 0! có trả về 1 hay k, 5! = 120, 6! = 720
    // ta thấy có các bộ data (0 -> 1, 1 -> 1, 2 -> 2, 3 -> 6, 4 -> 25, 5 -> 120, 6 -> 720)
    // ta để riêng data này ra 1 mảng 2 chiều
    
    public static Object[][] initData() {
        return new Object[][]
        {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }
    
    // test case so sanh xem ham co tra ve debug k 
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
