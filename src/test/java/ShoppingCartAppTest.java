import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartAppTest {

    @Test
    void testCalculateTotalCost() {
        int[] quantities = {3, 2, 4};
        double[] prices = {10.0, 5.0, 20.0};
        double expectedTotalCost = 3 * 10.0 + 2 * 5.0 + 4 * 20.0;
        double actualTotalCost = ShoppingCartApp.calculateTotalCost(quantities, prices);
        assertEquals(expectedTotalCost, actualTotalCost);
    }

    @Test
    void testCalculateTotalCostZeroQuantity() {
        int[] quantities = {0, 2, 4};
        double[] prices = {10.0, 5.0, 20.0};
        double expectedTotalCost = 0 * 10.0 + 2 * 5.0 + 4 * 20.0;
        double actualTotalCost = ShoppingCartApp.calculateTotalCost(quantities, prices);
        assertEquals(expectedTotalCost, actualTotalCost);
    }

    @Test
    void testCalculateTotalCostZeroPrices() {
        int[] quantities = {3, 2, 4};
        double[] prices = {0.0, 0.0, 0.0};
        double expectedTotalCost = 3 * 0.0 + 2 * 0.0 + 4 * 0.0;
        double actualTotalCost = ShoppingCartApp.calculateTotalCost(quantities, prices);
        assertEquals(expectedTotalCost, actualTotalCost);
    }
}