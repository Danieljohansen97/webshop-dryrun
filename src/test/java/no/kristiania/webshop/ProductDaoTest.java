package no.kristiania.webshop;

// Data
// Access
// Object
// -Pattern

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductDaoTest {

    @Test
    void shouldListInsertedProducts() {
        ProductDao dao = new ProductDao();
        String productName = pickOne(new String[] {"Apples", "Bananas", "Coconuts", "Dates", "Oranges"});
        dao.insertProduct(productName);
        assertThat(dao.listAll()).contains(productName);
    }

    private String pickOne(String[] strings) {
        return strings[new Random().nextInt(strings.length)];
    }

}
