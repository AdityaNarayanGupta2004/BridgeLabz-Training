package junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {

    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertEquals(2, manager.getSize(list));
    }

    @Test
    public void testRemoveElement() {
        manager.addElement(list, 10);
        manager.removeElement(list, 10);

        assertFalse(list.contains(10));
        assertEquals(0, manager.getSize(list));
    }

    @Test
    public void testSize() {
        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
    }
}
