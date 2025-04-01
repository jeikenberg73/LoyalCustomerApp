package loyalcustomer;

import java.util.HashSet;
import java.util.Set;

/**
 * This is the model for the customer. This model contains the customer's ID,
 * The dates visited, and the pages visited.
 */
class Customer {
    // The model uses a constructor to tie a customer ID to the customer object.
    Customer(Integer id) {
        mCustomerID = id;
    }

    // Create a variable to hold the customer ID. This will be an integer.
    private Integer mCustomerID;

    // Create a set to hold the dates visiting the web site. Use a set because we
    // only need
    // to know if they visited the web site on a particular day once.
    private Set<String> mDatesVisited = new HashSet<>();

    // Create a set to hold the pages visited on the web site. Use a set because we
    // only need
    // to know what pages in the web site they visited and not how many times they
    // visited each.
    private Set<Integer> mPagesVisited = new HashSet<>();

    // Getters and Setters
    public Integer getCustomerID() {
        return mCustomerID;
    }

    public Set<String> getDatesVisited() {
        return mDatesVisited;
    }

    public void setDatesVisited(Set<String> datesVisited) {
        mDatesVisited = datesVisited;
    }

    public Set<Integer> getPagesVisited() {
        return mPagesVisited;
    }

    public void setPagesVisited(Set<Integer> pagesVisited) {
        mPagesVisited = pagesVisited;
    }
}