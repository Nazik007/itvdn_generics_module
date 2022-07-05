package GO_IT_HM_8;

public class ProgramResults {
    public static void main(String[] args) {
        MyList testList = new MyArrayList();
        MyLinkedList testList2 = new MyLinkedList();
        MyHashMap hashTest = new MyHashMap();

        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        System.out.println(testList.size());
        System.out.println(testList.get(5));

        System.out.println("-------------");


        testList2.add(0);
        testList2.add(1);
        testList.add(2);
        testList.add(3);
        System.out.println(testList2.get(25));
        System.out.println(testList2.poll());

        System.out.println("----------------");

        hashTest.put("Key", 44);
        hashTest.put("Different_key", 22);
        hashTest.put("Key", 2);
        System.out.println(hashTest.size);
        System.out.println(hashTest.get("Key"));
        System.out.println(hashTest.get("Different_key"));
    }
}
