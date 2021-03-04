package genericClass;


public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray) {
        for(E ele:inputArray){
            //System.out.printf("%s", ele);
            System.out.println(ele.getClass());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        printArray(intArray);
        System.out.println("----------");
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        printArray(doubleArray);
    }

}
