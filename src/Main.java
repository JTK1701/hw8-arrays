import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        int [] first = new int[3];
        first [0] = 1;
        first [1] = 2;
        first [2] = 3;
        double [] second = {1.57, 7.654, 9.986};
        float [] my = new float[5];
        my [0] = 5.0f;
        my [1] = 4.24f;
        my [2] = 0.15f;
        my [3] = (float) 98.64;
        my [4] = first[0];
        System.out.println(" ");
        System.out.println("2 задача");
        System.out.println(first[0] + ", " + first[1] + ", " + first[2]);
        System.out.println(second[0] + ", " + second[1] + ", " + second[2]);
        System.out.println(my[0] + ", " + my[1] + ", " + my[2]+", "+my[3]+", "+my[4] );
        System.out.println(" ");
        System.out.println("3 задача");
        System.out.println(first[2] + ", " + first[1] + ", " + first[0]);
        System.out.println(second[2] + ", " + second[1] + ", " + second[0]);
        System.out.println(my[4] + ", " + my[3] + ", " + my[2]+", "+my[1]+", "+my[0] );
        System.out.println(" ");
        System.out.println("4 задача");
        for (int i = 0; i < first.length; i++) {
            if ((first[i] % 2) != 0) {
                first[i]++;
            }
        }
        System.out.print(Arrays.toString(first));
    }
}

