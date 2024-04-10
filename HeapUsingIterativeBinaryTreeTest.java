import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class HeapUsingIterativeBinaryTreeTest {

    private HeapUsingIterativeBinaryTree<Integer, String> heap;

    @Before
    public void setUp() {
        Comparator<Integer> priorityComparator = Comparator.naturalOrder();
        heap = new HeapUsingIterativeBinaryTree<>(priorityComparator);
    }

    @Test
    public void testInsert() {
        heap.Insert(3, "Value 3");
        heap.Insert(1, "Value 1");
        heap.Insert(5, "Value 5");
        heap.Insert(2, "Value 2");
        heap.Insert(4, "Value 4");

        assertEquals(5, heap.count());
        assertFalse(heap.isEmpty());
    }

    @Test
    public void testGet() {
        heap.Insert(3, "Value 3");
        heap.Insert(1, "Value 1");
        heap.Insert(5, "Value 5");
        heap.Insert(2, "Value 2");
        heap.Insert(4, "Value 4");

        assertEquals("Value 5", heap.get());
    }

    @Test
    public void testRemove() {
        heap.Insert(3, "Value 3");
        heap.Insert(1, "Value 1");
        heap.Insert(5, "Value 5");
        heap.Insert(2, "Value 2");
        heap.Insert(4, "Value 4");

        assertEquals("Value 5", heap.remove());
        assertEquals(4, heap.count());
    }

    @Test
    public void testCount() {
        assertEquals(0, heap.count());

        heap.Insert(3, "Value 3");
        heap.Insert(1, "Value 1");
        heap.Insert(5, "Value 5");

        assertEquals(3, heap.count());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(heap.isEmpty());

        heap.Insert(3, "Value 3");

        assertFalse(heap.isEmpty());
    }
}