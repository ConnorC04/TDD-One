package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:

    private double taxRate;
    private List<ShoppingCart.Item> items;
    private final ShoppingCart shoppingCart = new ShoppingCart(taxRate);


//    @Test
//    public void addItems(){
//        List<ShoppingCart.Item> actual;
//        actual.add(Item apples);
//     }
    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)
}
