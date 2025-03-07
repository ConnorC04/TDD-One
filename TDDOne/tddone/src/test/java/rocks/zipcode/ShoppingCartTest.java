package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Before;
import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    // Make sure to test all functionality including:

    ShoppingCart.Item newItem = new ShoppingCart.Item("bananas", 5, 1);
    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp() {
        double taxRate = 0.07;
        this.shoppingCart = new ShoppingCart(taxRate);
        this.shoppingCart.addItem(newItem);
    }

    @Test
    public void testAddItem(){
        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void testRemoveItem(){
        this.shoppingCart.removeItem(newItem);
        assertEquals(0, shoppingCart.getItemCount());
    }

    @Test
    public void testGetSubtotal(){
        assertEquals(5, shoppingCart.getSubtotal());
    }

    @Test
    public void testGetTaxAmount(){
        assertEquals(0.35, shoppingCart.getTaxAmount(), 0.001);
    }

    @Test
    public void testGetTotal(){
        assertEquals(5.35, shoppingCart.getTotal());
    }

    @Test
    public void testClearCart(){
        shoppingCart.clearCart();
        assertEquals(0, shoppingCart.getItemCount());
    }

    @Test
    public void testGetItemName(){
        assertEquals("bananas", newItem.getName());
    }

    @Test
    public void testGetItemPrice(){
        assertEquals(5, newItem.getPrice());
    }

    @Test
    public void testGetItemQuantity(){
        assertEquals(1, newItem.getQuantity());
    }

    @Test
    public void testSetQuantity(){
        newItem.setQuantity(1);
        assertEquals(1, newItem.getQuantity());
    }






    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)
}
