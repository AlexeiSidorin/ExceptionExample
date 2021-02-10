package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.exception.NotFoundException;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

   @Test
    void shouldDeleteById() {

       ProductManager manager = new ProductManager();
       manager.deleteById(1);
       Product bookNull = manager.search(1);

       assertNull(bookNull);

   }

    @Test
    public void shouldThrowNotFoundException(){

        ProductManager manager = new ProductManager();
        assertThrows(NotFoundException.class, () -> manager.deleteById(2));
    }

}