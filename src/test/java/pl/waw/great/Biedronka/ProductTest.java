package pl.waw.great.Biedronka;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTest {

    @Test
    public void testCreateProduct() {
        Product chleb = new Product(1, "chleb", BigDecimal.valueOf(20), 1);

        System.out.println(chleb);

        assertTrue(chleb.getId() == 1);
        assertTrue(chleb.getAmount() == 1);

        assertTrue(chleb.getName().equals("chleb"));
        assertTrue(chleb.getPrice().equals( BigDecimal.valueOf(20)));

    }
}