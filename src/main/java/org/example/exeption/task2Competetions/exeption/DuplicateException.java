package org.example.exeption.task2Competetions.exeption;

import org.example.exeption.task2Competetions.Participant;

public class DuplicateException extends RuntimeException {
   private Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
