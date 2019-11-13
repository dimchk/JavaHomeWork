package lesson1;

import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Twww");
//        String s = "ggd";
//        char a = '\u0045';


//        int[] a;
//        a = new int[5];
//        a[0] = 6;
//        int[] b = {1, 1, 1};
//        int[] c = new int[12];
//        System.out.println(b[2]);
//        System.arraycopy(b, 0, c, c.length / 2 - b.length / 2, b.length);
//        System.out.println(Arrays.toString(c));


        int[][] array = new int[3 + (int) (Math.random() * 6)][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(int)(Math.random()*4+5)];
            for (int j =0; j<array[i].length; j++)
            {
                array[i][j] = ((int)(Math.random()*101));
            }
        }
        System.out.println(Arrays.deepToString(array));

//        Scanner in  = new Scanner(System.in);
//        System.out.println("Enter number");
//        String s = in.nextLine();
//        System.out.println(("S=" + s));


//        double count = Math.random() * 100;
//        array[1] = new int[4];
//        array[2] = new int[] {2,3,4,5};
//        String s = "Hello world";
//        System.out.println(s.substring(1));


    }
}
