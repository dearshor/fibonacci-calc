package org.dearshor.fibonacci;

import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Created by Xue Hong on 16/1/24.
 */
public class FibonacciCalculator {

    private ConcurrentHashMap<Long, BigInteger> cache;

    public FibonacciCalculator(ConcurrentHashMap<Long, BigInteger> cache) {
        this.cache = cache;
    }

    public BigInteger calculate(Long n) {

        assert n >= 0;

        if(n < 2) {
            return cache.computeIfAbsent(n, new Function<Long, BigInteger>() {
                @Override
                public BigInteger apply(Long aLong) {
                    return BigInteger.valueOf(aLong);
                }
            });
        }




         return  cache.computeIfAbsent(n, new Function<Long, BigInteger>() {
                @Override
                public BigInteger apply(Long aLong) {
                    BigInteger result = BigInteger.ZERO;
                    BigInteger x1 = BigInteger.ZERO;
                    BigInteger x2 = BigInteger.ONE;
                    for(long m = 2L; m++ <= n ;) {
                        result = x1.add(x2);
                        x1 = x2;
                        x2 = result;
                    }
                    return result;
                }
         });

    }

    public long calculate2(long n) {
        assert n >= 0;

        if (n < 2) {
            return n;
        }

        long result = 0L;
        long x1 = 0L;
        long x2 = 1L;
        for (long m = 2L; m <= n ; m++ ) {
            result = x1 + x2;
            x1 = x2;
            x2 = result;
        }
        return result;
    }

    public BigInteger calculate3(long n) {
        assert n >= 0;

        if (n < 2) {
            return BigInteger.valueOf(n);
        }

        BigInteger result = BigInteger.ZERO;
        BigInteger x1 = BigInteger.ZERO;
        BigInteger x2 = BigInteger.ONE;
        for (long m = 2L; m <= n ; m++ ) {
            result = x1.add(x2);
            x1 = x2;
            x2 = result;
        }
        return result;
    }


}
