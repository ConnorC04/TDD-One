package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:

    private double taxRate;
    private double price;
    private String name;
    private int quantity;
    private List<ShoppingCart.Item> ItemList;
    private ShoppingCart shoppingCart;
    private ShoppingCart.Item newItem;

    public void setUp(){
        this.shoppingCart = new ShoppingCart(taxRate);
        this.newItem = new ShoppingCart.Item(name, price, quantity);
    }

    @Test
    public void testAddItem(){
        setUp();
        assertArrayEquals(shoppingCart.addItem(newItem));
    }


    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)
}
