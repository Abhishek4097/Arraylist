import java.io.*;
import java.util.*;

class arraylist {
    public static void main(String[] args)
    {
        int n = 5;

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++)
            arr.add(i);

        System.out.println(arr);
        for (Integer integer : arr)
            System.out.print(integer);
    }
}
