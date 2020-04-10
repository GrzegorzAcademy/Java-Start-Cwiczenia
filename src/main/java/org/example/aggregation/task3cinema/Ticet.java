package org.example.aggregation.task3cinema;

public class Ticet {
    private int ticetId;
    private Move movie;
    private Customer customer;

    public String TicetInfo(){
        return ticetId + " - "+movie+ " - "+ customer;
    }

    public Ticet(int ticetId, Move movie, Customer customer) {
        this.ticetId = ticetId;
        this.movie = movie;
        this.customer = customer;
    }

    public int getTicetId() {
        return ticetId;
    }

    public void setTicetId(int ticetId) {
        this.ticetId = ticetId;
    }

    public Move getMovie() {
        return movie;
    }

    public void setMovie(Move movie) {
        this.movie = movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
