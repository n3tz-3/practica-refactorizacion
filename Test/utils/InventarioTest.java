package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import utils.Inventario;

class InventarioTest {

    @Test
    void testAjusteCategoriaPremium() {
        Inventario inventario = new Inventario();
        double valorBase = 1000.0;
        // El ajuste premium debe ser el 20% de 1000 = 200
        double resultado = inventario.calcularAjusteCategoria("premium", valorBase);
        assertEquals(200.0, resultado, "El ajuste premium debería ser el 20% del valor base");
    }

    @Test
    void testAjusteCategoriaBasica() {
        Inventario inventario = new Inventario();
        double valorBase = 1000.0;
        // El ajuste basica debe ser el -5% de 1000 = -50
        double resultado = inventario.calcularAjusteCategoria("basica", valorBase);
        assertEquals(-50.0, resultado, "El ajuste básico debería restar el 5% del valor base");
    }

    @Test
    void testAjusteCategoriaDesconocida() {
        Inventario inventario = new Inventario();
        double valorBase = 1000.0;
        // Cualquier otra categoría no debería aplicar ajuste (0)
        double resultado = inventario.calcularAjusteCategoria("estandar", valorBase);
        assertEquals(0.0, resultado, "Una categoría desconocida no debería tener ajuste");
    }
}