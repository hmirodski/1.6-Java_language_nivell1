package exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoGenericMethodsTest {
    @Test
    public void testConstructorStoresValues() {
        NoGenericMethods<String> ngm = new NoGenericMethods<>("A", "B", "C");

        assertEquals("A", ngm.getFirst());
        assertEquals("B", ngm.getSecond());
        assertEquals("C", ngm.getThird());

        NoGenericMethods<Integer> notGeneric = new NoGenericMethods<>(1, 2, 3);

        notGeneric.setFirst(10);
        notGeneric.setSecond(20);
        notGeneric.setThird(30);

        assertEquals(10, notGeneric.getFirst());
        assertEquals(20, notGeneric.getSecond());
        assertEquals(30, notGeneric.getThird());
    }

    @Test
    public void testConstructorRejectsNull() {
        assertThrows(NullPointerException.class, () -> new NoGenericMethods<>(null, "B", "C"));
    }
}
