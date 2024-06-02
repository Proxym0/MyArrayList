import java.util.Arrays;
/**
 * Класс предназначен для создания кастомного ArrayList.
 */
public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] elements;
    private int size;
    private int capacity;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        this.elements = (E[]) new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    /**
     * Получение элемента по индексу
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return elements[index];
    }
    /**
     * Изменение элемента по индексу
     */
    public void set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        elements[index] = element;
    }
    /**
     * Возвращает количество элементов в массиве.
     */
    public int size() {
        return size;
    }
    /**
     * Получение информации не пустой ли список
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * Добавление элемента в список
     */
    public boolean add(E element) {
        if (size == capacity) {
            growCapacity();
        }

        elements[size++] = element;
        return true;
    }
    /**
     * Добавление элемента в список по индексу
     */
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == capacity) {
            growCapacity();
        }

        // Shift elements to the right
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element;
        size++;
    }
    /**
     * Удаление элемента по индексу
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E element = elements[index];

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;

        return element;
    }
    /**
     * Удаление элемента из списка
     */
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                remove(i);
                return true;
            }
        }

        return false;
    }
    /**
     * Удаление всех элементов из списка
     */
    public void clear() {
        size = 0;
        elements = (E[]) new Object[capacity];
    }
    /**
     * Увеличение размера списка при его переполнении
     */
    private void growCapacity() {
        int newCapacity = capacity * 3 / 2 + 1;
        elements = Arrays.copyOf(elements, newCapacity);
        capacity = newCapacity;
    }
    /**
     * Меняет элементы в массиве местами в порядке сортировки
     */
    public void swap(int i, int j) {
        if (i < 0 || i >= size || j < 0 || j >= size) {
            throw new IndexOutOfBoundsException();
        }
        E temp = get(i);
        set(i, get(j));
        set(j, temp);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}