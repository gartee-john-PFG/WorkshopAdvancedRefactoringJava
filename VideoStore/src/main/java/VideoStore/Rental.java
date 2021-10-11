package VideoStore;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    @Override
    public String toString() {
        return "Rental [daysRented=" + daysRented + ", movie=" + movie + "]";
    }
    
}