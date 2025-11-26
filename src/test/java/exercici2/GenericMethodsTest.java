package exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GenericMethodsTest {

    @Test
    public void testWithPersonaStringDouble() {
        GenericMethods generic = new GenericMethods();
        Person p = new Person("Horacio", "Miroddi", 33);
        assertDoesNotThrow(() -> generic.showGenericMethods(p, "Texto", 3.14));
    }

    @Test
    public void testWithDifferentTypes() {
        GenericMethods generic = new GenericMethods();
        assertDoesNotThrow(() -> generic.showGenericMethods("Hola", 25, true));
    }
}
