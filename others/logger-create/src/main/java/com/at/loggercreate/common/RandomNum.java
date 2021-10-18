package com.at.loggercreate.common;

import java.util.Random;

/**
 * @author zero
 * @create 2021-06-26 17:44
 */
public class RandomNum {
    public RandomNum() {
    }

    public static final int getRandInt(int fromNum, int toNum) {
        return fromNum + (new Random()).nextInt(toNum - fromNum + 1);
    }

    public static final int getRandInt(int fromNum, int toNum, Long seed) {
        return fromNum + (new Random(seed)).nextInt(toNum - fromNum + 1);
    }
}