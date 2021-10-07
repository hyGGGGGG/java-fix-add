package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void addTest() {
        Assertions.assertEquals(Challenge.add(1, 1), 2);
        Assertions.assertEquals(Challenge.add(1, 2), 3);
        Assertions.assertEquals(Challenge.add(-1, 1), 0);
        Assertions.assertEquals(Challenge.add(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
