package edu.cnm.deepdive;

import static edu.cnm.deepdive.Leaderboard.getCompetitionRanking;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {

  private final static int[] COMP_BOARD_ONE = {100, 100, 50, 40, 40, 20, 10};
  private final static int[] SCORES_ONE = {5, 25, 50, 120};
  private final static int[] TEST_ONE_RESULT = {8, 6, 3, 1};

  private final static int[] COMP_BOARD_TWO = {100, 90, 80, 80, 80, 20};
  private final static int[] SCORES_TWO = {10, 50, 80, 90};
  private final static int[] TEST_TWO_RESULT = {7, 6, 3, 2}	;

  @Test
  void testGetCompetitionRanking() {
    assertArrayEquals(TEST_ONE_RESULT, getCompetitionRanking(COMP_BOARD_ONE, SCORES_ONE));
    assertArrayEquals(TEST_TWO_RESULT, getCompetitionRanking(COMP_BOARD_TWO, SCORES_TWO));
  }
}