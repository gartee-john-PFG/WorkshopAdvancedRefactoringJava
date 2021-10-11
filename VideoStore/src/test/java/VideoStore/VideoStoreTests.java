package VideoStore;

import org.junit.jupiter.api.Test;
import org.approvaltests.combinations.CombinationApprovals;

public class VideoStoreTests {
    @Test
    public void approveCustomerStatement() {
        CombinationApprovals.verifyAllCombinations(this::createCustomerStatement
                , new String[] {"Star Wars", "The Maltese Falcon", "101 Dalmations"}
                , new Integer[] {Movie.NEW_RELEASE, Movie.REGULAR, Movie.CHILDRENS}
                , new Integer[] {1, 2, 3, 4});
    }

    private String createCustomerStatement(String movieName, int priceCode, int daysRented) {
        Customer customer = new Customer("Customer Name");
        Movie movie = new Movie(movieName, priceCode);
        movie.setPriceCode(priceCode);
        customer.addRental (new Rental(movie, daysRented));
        return customer.statement();
    }
}