package exercici1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoGenericMethodsTest {

    private NoGenericMethods<String> stringContainer;
    private NoGenericMethods<Integer> intContainer;

    @BeforeEach
    void setUp() {
        stringContainer = new NoGenericMethods<>("A", "B", "C");
        intContainer = new NoGenericMethods<>(1, 2, 3);
    }

    @Test
    void shouldStoreValuesFromConstructor() {
        assertEquals("A", stringContainer.getFirst());
        assertEquals("B", stringContainer.getSecond());
        assertEquals("C", stringContainer.getThird());
    }

    @Test
    void shouldUpdateValuesWithSetters() {
        intContainer.setFirst(10);
        intContainer.setSecond(20);
        intContainer.setThird(30);

        assertEquals(10, intContainer.getFirst());
        assertEquals(20, intContainer.getSecond());
        assertEquals(30, intContainer.getThird());
    }

    @Test
    void shouldRejectNullInConstructor() {
        assertThrows(NullPointerException.class, 
            () -> new NoGenericMethods<>(null, "B", "C"));
    }

    @Test
    void shouldRejectNullInSetters() {
        assertThrows(NullPointerException.class, 
            () -> stringContainer.setFirst(null));
    }

    @Test
    void shouldWorkWithDifferentTypes() {
        NoGenericMethods<Double> doubleContainer = new NoGenericMethods<>(1.1, 2.2, 3.3);
        
        assertEquals(1.1, doubleContainer.getFirst());
        assertEquals(2.2, doubleContainer.getSecond());
        assertEquals(3.3, doubleContainer.getThird());
    }
}
