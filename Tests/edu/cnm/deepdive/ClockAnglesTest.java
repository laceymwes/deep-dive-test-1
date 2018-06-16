package edu.cnm.deepdive;

import static edu.cnm.deepdive.ClockAngles.hourHandDegrees;
import static edu.cnm.deepdive.ClockAngles.hourHandRadians;
import static edu.cnm.deepdive.ClockAngles.minuteHandDegrees;
import static edu.cnm.deepdive.ClockAngles.minuteHandRadians;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockAnglesTest {

  private static final int TEST_ONE_HOURS = 0;
  private static final double TEST_ONE_MINUTES = 0.0;
  private static final double HOUR_DEGREES_RESULT_ONE = 0.0;
  private static final double MINUTE_DEGREES_RESULT_ONE = 0.0;
  private static final double HOUR_RADIANS_RESULT_ONE = 1.57079632679;
  private static final double MINUTE_RADIANS_RESULT_ONE = 1.57079632679;

  private static final int TEST_TWO_HOURS = 3;
  private static final double TEST_TWO_MINUTES = 15.0;
  private static final double HOUR_DEGREES_RESULT_TWO = 97.5;
  private static final double MINUTE_DEGREES_RESULT_TWO = 90.0;
  private static final double HOUR_RADIANS_RESULT_TWO = 6.152285613280012;
  private static final double MINUTE_RADIANS_RESULT_TWO = 0;

  private static final int TEST_THREE_HOURS = 12;
  private static final double TEST_THREE_MINUTES = 30.0;
  private static final double HOUR_DEGREES_RESULT_THREE = 15.0;
  private static final double MINUTE_DEGREES_RESULT_THREE = 180.0;
  private static final double HOUR_RADIANS_RESULT_THREE = 1.3089969389957474;
  private static final double MINUTE_RADIANS_RESULT_THREE = 4.71238898038469;

  private static final int TEST_FOUR_HOURS = 19;
  private static final double TEST_FOUR_MINUTES = 42.0;
  private static final double HOUR_DEGREES_RESULT_FOUR = 231.0;
  private static final double MINUTE_DEGREES_RESULT_FOUR = 252.0;
  private static final double HOUR_RADIANS_RESULT_FOUR = 3.822271061867582;
  private static final double MINUTE_RADIANS_RESULT_FOUR = 3.4557519189487724;

  @Test
  void testHourHandDegrees() {
    assertEquals(HOUR_DEGREES_RESULT_ONE, hourHandDegrees(TEST_ONE_HOURS, TEST_ONE_MINUTES));
    assertEquals(HOUR_DEGREES_RESULT_TWO, hourHandDegrees(TEST_TWO_HOURS, TEST_TWO_MINUTES));
    assertEquals(HOUR_DEGREES_RESULT_THREE, hourHandDegrees(TEST_THREE_HOURS, TEST_THREE_MINUTES));
    assertEquals(HOUR_DEGREES_RESULT_FOUR, hourHandDegrees(TEST_FOUR_HOURS, TEST_FOUR_MINUTES));
  }

  @Test
  void testMinuteHandDegrees() {
    assertEquals(MINUTE_DEGREES_RESULT_ONE, minuteHandDegrees(TEST_ONE_MINUTES));
    assertEquals(MINUTE_DEGREES_RESULT_TWO, minuteHandDegrees(TEST_TWO_MINUTES));
    assertEquals(MINUTE_DEGREES_RESULT_THREE, minuteHandDegrees(TEST_THREE_MINUTES));
    assertEquals(MINUTE_DEGREES_RESULT_FOUR, minuteHandDegrees(TEST_FOUR_MINUTES));
  }

  @Test
  void testHourHandRadians() {
    assertEquals(HOUR_RADIANS_RESULT_ONE, hourHandRadians(TEST_ONE_HOURS, TEST_ONE_MINUTES));
    assertEquals(HOUR_RADIANS_RESULT_TWO, hourHandRadians(TEST_TWO_HOURS, TEST_TWO_MINUTES));
    assertEquals(HOUR_RADIANS_RESULT_THREE, hourHandRadians(TEST_THREE_HOURS, TEST_THREE_MINUTES));
    assertEquals(HOUR_RADIANS_RESULT_FOUR, hourHandRadians(TEST_FOUR_HOURS, TEST_FOUR_MINUTES));
  }

  @Test
  void testMinuteHandRadians() {
    assertEquals(MINUTE_RADIANS_RESULT_ONE, minuteHandRadians(TEST_ONE_MINUTES));
    assertEquals(MINUTE_RADIANS_RESULT_TWO, minuteHandRadians(TEST_TWO_MINUTES));
    assertEquals(MINUTE_RADIANS_RESULT_THREE, minuteHandRadians(TEST_THREE_MINUTES));
    assertEquals(MINUTE_RADIANS_RESULT_FOUR, minuteHandRadians(TEST_FOUR_MINUTES));
  }
}