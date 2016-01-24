package org.dearshor.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

/**
 * Created by Xue Hong on 16/1/24.
 */
public class FibonacciCalculatorTest {

    private static FibonacciCalculator calculator;
    private static ConcurrentHashMap<Long, BigDecimal> cache;

    @BeforeClass
    public static void setUp() throws Exception {
        cache = new ConcurrentHashMap<>(10000); calculator = new FibonacciCalculator(cache);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculate() throws Exception {
//        System.out.printf("fibonacci(1) = %s \n", calculator.calculate(1L).toString());
//        System.out.printf("fibonacci(10) = %s \n", calculator.calculate(10L).toString());
//        System.out.printf("fibonacci(20) = %s \n", calculator.calculate(20L).toString());
//        System.out.printf("fibonacci(50) = %s \n", calculator.calculate(50L).toString());
        System.out.printf("fibonacci(100) = %s \n", calculator.calculate3(100L));
        System.out.printf("fibonacci(1000) = %s \n", calculator.calculate3(1000L));
        System.out.printf("fibonacci(1500) = %s \n", calculator.calculate3(1500L));
        System.out.printf("fibonacci(10000) = %s \n", calculator.calculate3(10000L));
        System.out.printf("fibonacci(20000) = %s \n", calculator.calculate3(20000L));
        System.out.printf("fibonacci(100000) = %s \n", calculator.calculate3(100000L));
//        System.out.printf("fibonacci(Integer.MAX_VALUE) = %s \n", calculator.calculate3(Integer.MAX_VALUE));

        /*System.out.println();

        for (Map.Entry e : cache.entrySet()) {
            System.out.printf("%d => %s \n", e.getKey(), e.getValue().toString());
        }*/
    }
}