import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.98};
        char[] array3 = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("\n2 задача");
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2] + ", " + array3[3] + ", " + array3[4]);

        System.out.println("\n3 задача");
        System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
        System.out.println(array3[4] + ", " + array3[3] + ", " + array3[2] + ", " + array3[1] + ", " + array3[0]);

        System.out.println("\n4 задача");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}