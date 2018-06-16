package edu.cnm.deepdive;

import static edu.cnm.deepdive.ClockAngles.hourHandDegrees;
import static edu.cnm.deepdive.ClockAngles.minuteHandDegrees;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockAnglesTest {

  private static final int TEST_ONE_HOURS = 0;
  private static final double TEST_ONE_MINUTES = 0.0;
  private static final double HOUR_RESULT_ONE = 0.0;
  private static final double MINUTE_RESULT_ONE = 0.0;

  private static final int TEST_TWO_HOURS = 3;
  private static final double TEST_TWO_MINUTES = 15.0;
  private static final double HOUR_RESULT_TWO = 97.5;
  private static final double MINUTE_RESULT_TWO = 90.0;

  private static final int TEST_THREE_HOURS = 12;
  private static final double TEST_THREE_MINUTES = 30.0;
  private static final double HOUR_RESULT_THREE = 15.0;
  private static final double MINUTE_RESULT_THREE = 180.0;

  private static final int TEST_FOUR_HOURS = 19;
  private static final double TEST_FOUR_MINUTES = 42.0;
  private static final double HOUR_RESULT_FOUR = 231.0;
  private static final double MINUTE_RESULT_FOUR = 252.0;

  @Test
  void testHourHandDegrees() {
    assertEquals(HOUR_RESULT_ONE, hourHandDegrees(TEST_ONE_HOURS, TEST_ONE_MINUTES));
    assertEquals(HOUR_RESULT_TWO, hourHandDegrees(TEST_TWO_HOURS, TEST_TWO_MINUTES));
    assertEquals(HOUR_RESULT_THREE, hourHandDegrees(TEST_THREE_HOURS, TEST_THREE_MINUTES));
    assertEquals(HOUR_RESULT_FOUR, hourHandDegrees(TEST_FOUR_HOURS, TEST_FOUR_MINUTES));
  }

  @Test
  void testMinuteHandDegrees() {
    assertEquals(MINUTE_RESULT_ONE, minuteHandDegrees(TEST_ONE_MINUTES));
    assertEquals(MINUTE_RESULT_TWO, minuteHandDegrees(TEST_TWO_MINUTES));
    assertEquals(MINUTE_RESULT_THREE, minuteHandDegrees(TEST_THREE_MINUTES));
    assertEquals(MINUTE_RESULT_FOUR, minuteHandDegrees(TEST_FOUR_MINUTES));
  }

  @Test
  void testHourHandRadians() {
  }

  @Test
  void testMinuteHandRadians() {
  }
}