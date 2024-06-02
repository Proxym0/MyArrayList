class QuickSort<E extends Comparable<? super E>> {

    private MyArrayList<E> list;

    public QuickSort(MyArrayList<E> list) {
        this.list = list;
    }

  
    private void sort() {
        int low = 0;
        int high = list.size()-1;
        if (low >= high) {
            return;
        }

        // Выбор опорного элемента
        E pivot = list.get(high);

        // Разбивка массива
        int partitionIndex = partition(low, high, pivot);

        // Рекурсивная сортировка подмассивов
        sort(low, partitionIndex - 1);
        sort(partitionIndex + 1, high);
    }

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
}
