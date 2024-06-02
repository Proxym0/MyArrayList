import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void testGetElementByIndex(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        assertEquals(Optional.ofNullable(list.get(0)), Optional.of(5));
        assertFalse(list.isEmpty());
    }
    @Test
    public void testClear(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
    }
    @Test
    public void testRemoveByIndex(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.remove(1);
        assertEquals(list.size(),2);
        assertEquals(Optional.ofNullable(list.get(1)), Optional.of(3));
    }
}
