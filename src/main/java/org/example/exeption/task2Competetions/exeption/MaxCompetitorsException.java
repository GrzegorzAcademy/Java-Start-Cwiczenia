package org.example.exeption.task2Competetions.exeption;

public class MaxCompetitorsException extends RuntimeException {
  private final int MaxCompetitors;

    public MaxCompetitorsException(int maxCompetitors) {
        MaxCompetitors = maxCompetitors;
    }

    public int getMaxCompetitors() {
        return MaxCompetitors;
    }
}


