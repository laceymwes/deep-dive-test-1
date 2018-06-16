package edu.cnm.deepdive;

import static edu.cnm.deepdive.Leaderboard.getCompetitionRanking;
import static edu.cnm.deepdive.Leaderboard.getDenseRanking;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {

  private final static int[] COMP_BOARD_ONE = {100, 100, 50, 40, 40, 20, 10};
  private final static int[] SCORES_ONE = {5, 25, 50, 120};
  private final static int[] COMP_TEST_ONE_RESULT = {8, 6, 3, 1};
  private final static int[] DENSE_TEST_ONE_RESULT = {6, 4, 2, 1};

  private final static int[] COMP_BOARD_TWO = {100, 90, 80, 80, 80, 20};
  private final static int[] SCORES_TWO = {10, 50, 80, 90};
  private final static int[] COMP_TEST_TWO_RESULT = {7, 6, 3, 2};
  private final static int[] DENSE_TEST_TWO_RESULT = {5, 4, 3, 2};


  @Test
  void testGetCompetitionRanking() {
    assertArrayEquals(COMP_TEST_ONE_RESULT, getCompetitionRanking(COMP_BOARD_ONE, SCORES_ONE));
    assertArrayEquals(COMP_TEST_TWO_RESULT, getCompetitionRanking(COMP_BOARD_TWO, SCORES_TWO));
  }

  @Test
  public void testGetDenseRanking() {
    assertArrayEquals(DENSE_TEST_ONE_RESULT, getDenseRanking(COMP_BOARD_ONE, SCORES_ONE));
    assertArrayEquals(DENSE_TEST_TWO_RESULT, getDenseRanking(COMP_BOARD_TWO, SCORES_TWO));
  }
}