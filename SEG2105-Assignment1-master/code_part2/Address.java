package code_part2;

/**
 * This class contains instance of Address
 * 
 */
public class Address {
    // instance variable

    /*
     * Contain the name of the street
     */
    private String street;

    /*
     * Contain the number of the habitation
     */
    private int number;

    /*
     * Contain the postal code
     */
    private String postal;

    public Address(String street, int number, String postal) {
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

}
