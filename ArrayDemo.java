import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {0,1, 2, 3, 4, 5};

        
            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
            int[] array2 = new int[5];
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.binarySearch(array, 3));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            Arrays.fill(array2, 10);
            System.out.println(Arrays.toString(array2));

        }
    }
    

