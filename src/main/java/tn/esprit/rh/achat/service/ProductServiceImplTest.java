package tn.esprit.rh.achat.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.Product;
import tn.esprit.devops_project.entities.ProductCategory;
import tn.esprit.devops_project.services.ProductServiceImpl;

@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    void testRetrieveProduct() {
        // Create a product
        Product product = new Product();
        product.setTitle("Test Product");
        // Set other properties as needed (if available)

        // Save the product and retrieve its ID
        product = productService.addProduct(product, 1L); // Replace 1L with a valid stock ID

        // Call the method to be tested
        Product retrievedProduct = productService.retrieveProduct(product.getIdProduct());

        // Assert that the retrieved product matches the expected product
        Assertions.assertNotNull(retrievedProduct);
        Assertions.assertEquals("Test Product", retrievedProduct.getTitle());
        // Add more assertions for other properties as needed
    }
}