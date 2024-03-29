package goit.hw5;

class ArrayWorker {
    public void printElement(int[] array, int index) {
        int x = array.length;
        try{
        System.out.println("value is " + array[index]);
    }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("wrong index");
        }finally {
            System.out.println("index is " + index);
        }
        }
}

class ArrayWorkerTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);
    }
}