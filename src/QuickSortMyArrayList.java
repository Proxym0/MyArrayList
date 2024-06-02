public class QuickSortMyArrayList<E extends Comparable<? super E>> {

    private MyArrayList<E> list;

    public QuickSortMyArrayList(MyArrayList<E> list) {
        this.list = list;
    }

    public void sort() {
        quickSort(0, list.size() - 1);
    }

    /**
     * Выбор опорного элемента pivot
     * Разбика массива на подмассивы partitionIndex
     * quickSort рекурсивно сортирует подмассивы
     */
    private void quickSort(int low, int high) {
        if (low >= high) {
            return;
        }
        E pivot = list.get(high);
        int partitionIndex = partition(low, high, pivot);
        quickSort(low, partitionIndex - 1);
        quickSort(partitionIndex + 1, high);
    }
    /**
     * Разбивает массив на подмассивы производя сортировку в методе swap()
     */
    private int partition(int low, int high, E pivot) {
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                list.swap(i, j);
            }
        }
        list.swap(i + 1, high);
        return i + 1;
    }
    /**
     * Проверяет отсортирован ли массив
     */
    public boolean isSorted(MyArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}