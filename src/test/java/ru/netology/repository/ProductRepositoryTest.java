package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book coreJava = new Book();
    private Book aliceInWonderland = new Book();
    private Smartphone iphone = new Smartphone();
    private Smartphone huawei = new Smartphone();

    @Test
    public void shouldSaveOneProduct() {
        repository.save(coreJava);
        Product[] expected = new Product[]{coreJava};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSaveAllProducts() {
        repository.save(coreJava);
        repository.save(aliceInWonderland);
        repository.save(iphone);
        repository.save(huawei);

        Product[] expected = new Product[]{coreJava,aliceInWonderland,iphone,huawei};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}