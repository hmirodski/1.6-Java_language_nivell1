package exercici2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethodsTest {

    private GenericMethods genericMethods;
    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        genericMethods = new GenericMethods();
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void shouldAcceptPersonStringAndNumber() {
        Person person = new Person("Horacio", "Miroddi", 36);
        
        assertDoesNotThrow(() -> 
            genericMethods.showGenericMethods(person, "Text", 3.14));
        
        String output = outputStream.toString();
        assertTrue(output.contains("Horacio"));
        assertTrue(output.contains("Text"));
        assertTrue(output.contains("3.14"));
    }

    @Test
    void shouldAcceptMixedPrimitiveTypes() {
        assertDoesNotThrow(() -> 
            genericMethods.showGenericMethods("Hello", 25, true));
        
        String output = outputStream.toString();
        assertTrue(output.contains("Hello"));
        assertTrue(output.contains("25"));
        assertTrue(output.contains("true"));
    }

    @Test
    void shouldAcceptArgumentsInAnyOrder() {
        Person person = new Person("Test", "User", 30);
        
        assertDoesNotThrow(() -> 
            genericMethods.showGenericMethods(100, person, "Last"));
        
        String output = outputStream.toString();
        assertTrue(output.contains("100"));
        assertTrue(output.contains("Test"));
        assertTrue(output.contains("Last"));
    }
}
