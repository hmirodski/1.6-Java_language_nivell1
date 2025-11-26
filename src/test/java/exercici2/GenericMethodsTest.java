package exercici2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class GenericMethodsTest {
    @Test
    public void testWithPersonaStringDouble() {
        GenericMethods gm = new GenericMethods();
        Person p = new Person("Horacio", "Miroddi", 33);
        assertDoesNotThrow(() -> gm.showGenericMethods(p, "Texto", 3.14));
    }

    @Test
    public void testWithDifferentTypes() {
        GenericMethods gm = new GenericMethods();
        assertDoesNotThrow(() -> gm.showGenericMethods("Hola", 25, true));
    }


}
