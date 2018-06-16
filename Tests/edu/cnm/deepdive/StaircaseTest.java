package edu.cnm.deepdive;

import static edu.cnm.deepdive.Staircase.buildLinearStaircase;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseTest {

  private static final int TEST_ONE_HEIGHT = 2;
  private static final String[] TEST_ONE_RESULT = {" *",
                                                   "**"};

  private static final int TEST_TWO_HEIGHT = 5;
  private static final String[] TEST_TWO_RESULT = {"    *",
                                                   "   **",
                                                   "  ***",
                                                   " ****",
                                                   "*****"};
  @Test
  void testBuildLinearStaircase() {
    assertArrayEquals(TEST_ONE_RESULT, buildLinearStaircase(TEST_ONE_HEIGHT));
    assertArrayEquals(TEST_TWO_RESULT, buildLinearStaircase(TEST_TWO_HEIGHT));
  }
}