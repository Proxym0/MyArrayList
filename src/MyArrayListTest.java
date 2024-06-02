import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
/**
 * Класс предназначен для тестирования класса MyArrayList.
 * Метод testGetElementByIndex() тестирует получение элемента по индексу.
 * Метод testClear() тестирует удаление всех элементов из списка.
 * Метод testRemoveByIndex() тестирует удаление элементов по индексу.
 * Метод testSize() проверяет размер списка.
 * Метод testIsEmpty() тестирует на проверку пустоты списка.
 * Метод testSet() тестирует изменение элемента по индексу.
 */
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
    @Test
    public void testSize() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertEquals(list.size(), 0);
        list.add(5);
        assertEquals(list.size(), 1);
        list.add(10);
        assertEquals(list.size(), 2);
    }
    @Test
    public void testIsEmpty() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertTrue(list.isEmpty());
        list.add(5);
        assertFalse(list.isEmpty());
    }
    @Test
    public void testSet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.set(1, 7);
        assertEquals(Optional.ofNullable(list.get(0)), Optional.of(5));
        assertEquals(Optional.ofNullable(list.get(1)), Optional.of(7));
        assertEquals(Optional.ofNullable(list.get(2)), Optional.of(15));
    }
}
