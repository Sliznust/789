import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7} };

        for (int[] ints : nums2) {
//            System.out.println(Arrays.toString(ints));
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

