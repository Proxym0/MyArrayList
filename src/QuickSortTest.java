import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Класс предназначен для тестирования класса QuickSort.
 * Метод testSingleElementList() проверяет на наличие одного элемента с сортируемом списке.
 * Метод testEmptyListElements() проверяет не пустой ли сортируемый список.
 * Метод testIsSortedList() проверяет  сортирован ли список.
 */
public class QuickSortTest {
    @Test
    public void testSingleElementList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        QuickSortMyArrayList<Integer> sorter = new QuickSortMyArrayList<>(list);
        sorter.sort();
        assertEquals(Optional.ofNullable(list.get(0)), Optional.of(5));
    }

    @Test
    public void testEmptyListElements(){
        MyArrayList<Integer> list = new MyArrayList<>();
        QuickSortMyArrayList<Integer> sorter = new QuickSortMyArrayList<>(list);
        sorter.sort();
        assertTrue(list.isEmpty());
    }
    @Test
    public void testIsSortedList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        QuickSortMyArrayList<Integer> sorter = new QuickSortMyArrayList<>(list);
        sorter.sort();
        boolean sorted = sorter.isSorted(list);
        assertTrue(sorted);
    }
}
