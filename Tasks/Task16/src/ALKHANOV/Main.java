package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(17);
        list.add(12);
        list.add(19);
        list.add(25);
        list.add(56);
        list.add(77);
        list.add(7);
        list.print();

        list.addToBegin(100);
        list.print();

        System.out.println(list.get(5));

        list.insert(125,3);
        list.print();

        list.reverse();
        list.print();

        System.out.println(list.getCount());

        list.sort();
        list.print();

        System.out.println(list.contains(99));
        System.out.println(list.contains(17));

        System.out.println(list.indexOf(99));
        System.out.println(list.indexOf(10));



    }
}
