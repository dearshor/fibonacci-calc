package org.dearshor.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

/**
 * Created by Xue Hong on 16/1/24.
 */
public class FibonacciCalculatorTest {

    private static FibonacciCalculator calculator;
    private static ConcurrentHashMap<Long, BigInteger> cache;

    @BeforeClass
    public static void setUp() throws Exception {
        cache = new ConcurrentHashMap<>(100000);
        calculator = new FibonacciCalculator(cache);
        // warm-up
        long begin = System.currentTimeMillis();

        calculator.calculate(100000L);
        long end = System.currentTimeMillis();
        System.out.printf("warm-up: elapsed time: %d  ms\n", end - begin);

    }

    @After
    public void tearDown() throws Exception {

    }

//    @Test
    public void testCalculate2() throws Exception {

        System.out.printf("fibonacci(100) = %s \n", calculator.calculate2(100L));
        System.out.printf("fibonacci(1000) = %s \n", calculator.calculate2(1000L));
        System.out.printf("fibonacci(1500) = %s \n", calculator.calculate2(1500L));
        System.out.printf("fibonacci(10000) = %s \n", calculator.calculate2(10000L));
        System.out.printf("fibonacci(20000) = %s \n", calculator.calculate2(20000L));
        System.out.printf("fibonacci(100000) = %s \n", calculator.calculate2(100000L));
        System.out.printf("fibonacci(1000000) = %s \n", calculator.calculate2(1000000L));
    }

//    @Test
    public void testCalculate3() throws Exception {

        System.out.printf("fibonacci(100) = %s \n", calculator.calculate3(100L));
        System.out.printf("fibonacci(1000) = %s \n", calculator.calculate3(1000L));
        System.out.printf("fibonacci(1500) = %s \n", calculator.calculate3(1500L));
        System.out.printf("fibonacci(10000) = %s \n", calculator.calculate3(10000L));
        System.out.printf("fibonacci(20000) = %s \n", calculator.calculate3(20000L));
        System.out.printf("fibonacci(100000) = %s \n", calculator.calculate3(100000L));
        System.out.printf("fibonacci(1000000) = %s \n", calculator.calculate3(1000000L));



        /*System.out.println();

        for (Map.Entry e : cache.entrySet()) {
            System.out.printf("%d => %s \n", e.getKey(), e.getValue().toString());
        }*/
    }

//    @Test
    public void testCalculate() throws Exception {
        long begin = System.currentTimeMillis();
//        System.out.printf("fibonacci(100) = %s \n", calculator.calculate(100L));
//        System.out.printf("fibonacci(1000) = %s \n", calculator.calculate(1000L));
//        System.out.printf("fibonacci(1500) = %s \n", calculator.calculate(1500L));
//        System.out.printf("fibonacci(10000) = %s \n", calculator.calculate(10000L));
//        System.out.printf("fibonacci(20000) = %s \n", calculator.calculate(20000L));
//        System.out.printf("fibonacci(100000) = %s \n", calculator.calculate(100000L));
        System.out.printf("fibonacci(10 0000) = %s \n", calculator.calculate(10 * 10000L));
//        System.out.printf("fibonacci(Integer.MAX_VALUE) = %s \n", calculator.calculate3(Integer.MAX_VALUE));

        long end = System.currentTimeMillis();
        System.out.printf("testCalculate(10 0000): elapsed time: %d ms \n", end - begin);
    }

    @Test
    public void testCalculateAgain() throws Exception {
        long begin = System.currentTimeMillis();

        System.out.println("##### test again #####");
        System.out.printf("fibonacci(10 0000) = %s \n", calculator.calculate(10 * 10000L));
        long end = System.currentTimeMillis();
        System.out.printf("testCalculateAgain(10 0000): elapsed time: %d ms\n", end - begin);

        System.out.printf("fibonacci(110 0000) = %s \n", calculator.calculate(110 * 10000L));
        end = System.currentTimeMillis();
        System.out.printf("testCalculateAgain(110 0000): elapsed time: %d ms\n", end - begin);

    }


}