package org.example.aggregation.task3cinema;

public class Move {
   private String movieTitle;
    private String movieType;
    private int movieTime;
    private int ageRequired;
    private int maxSeats;
    private Move ticet;

    public int getFreeSets() {
        return freeSets;
    }

    public void setFreeSets(int freeSets) {
        this.freeSets = freeSets;
    }

    private int freeSets;


    public Move(String movieTitle, String movieType, int movieTime, int ageRequired, int maxSeats, int freeSets) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSets = freeSets;
    }

    public Move getTicet() {
        return ticet;
    }

    public void setTicet(Move ticet) {
        this.ticet = ticet;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }
}
