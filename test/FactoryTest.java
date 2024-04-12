import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryTest {
    @Test
    @DisplayName("Test que compreva que el objeto devuelto es el correcto")
    public void testGetProducto() {
        IComun palet = Factory.getProducto(Factory.PALET);
        IComun carton = Factory.getProducto(Factory.CARTON);
        IComun madera = Factory.getProducto(Factory.MADERA);

        assertTrue(palet.getClass() == Camion.class);
        assertTrue(carton.getClass() == Bicicleta.class);
        assertTrue(madera.getClass() == Camion.class);
    }
}