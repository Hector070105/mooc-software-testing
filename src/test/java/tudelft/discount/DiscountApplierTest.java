package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    void aplicaDescuentoACategoriaHome() {
        ProductDao dao = Mockito.mock(ProductDao.class);

        Product product = new Product("Mesa", 100.0, "HOME");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(product));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, product.getPrice(), 0.001);
    }

    @Test
    void aplicaIncrementoACategoriaBusiness() {
        ProductDao dao = Mockito.mock(ProductDao.class);

        Product product = new Product("Laptop", 100.0, "BUSINESS");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(product));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(110.0, product.getPrice(), 0.001);
    }
}