

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(1);

        QuickSortMyArrayList<Integer> sorter = new QuickSortMyArrayList<>(list);
        sorter.sort();
        System.out.println(list);
    }
}