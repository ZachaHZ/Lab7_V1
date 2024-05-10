package domain;

import org.junit.jupiter.api.Test;
import util.Utility;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    public void testing() {
        Complex complex = new Complex();
        int[] tmp = new int[50000];

        int[] a = new int[50000];
        int[] b = new int[50000];
        int[] c = new int[50000];
        int[] d = new int[50000];
        int[] e = new int[50000];
        int[] f = new int[50000];

        for(int i = 0; i < a.length; i++){
            a[i]= util.Utility.getRandom(99);
        }

        for(int i = 0; i < b.length; i++){
            b[i]= util.Utility.getRandom(99);
        }

        for(int i = 0; i < c.length; i++){
            c[i]= util.Utility.getRandom(99);
        }

        for(int i = 0; i < d.length; i++){
            d[i]= util.Utility.getRandom(99);
        }

        for(int i = 0; i < e.length; i++){
            e[i]= util.Utility.getRandom(99);
        }

        for(int i = 0; i < f.length; i++){
            f[i]= util.Utility.getRandom(99);
        }

        System.out.println("Content of array a (without sorting):");
        for(int j = 0; j <= 200; j++){
            System.out.print(a[j] + " ");
        }

        System.out.println("Content of array b (without sorting):");
        for(int j = 0; j <= 200; j++){
            System.out.print(b[j] + " ");
        }

        System.out.println("Content of array c (without sorting):");
        for(int j = 0; j <=200; j++){
            System.out.print(c[j] + " ");
        }

        System.out.println("Content of array d (without sorting):");
        for(int j = 0; j <=200; j++){
            System.out.print(d[j] + " ");
        }

        System.out.println("Content of array e (without sorting):");
        for(int j = 0; j <=200; j++){
            System.out.print(e[j]+ " ");
        }

        System.out.println("Content of array f (without sorting):");
        for(int j = 0; j <=200; j++){
            System.out.print(f[j]+ " ");
        }

        complex.quickSort(a,0, a.length - 1);
        complex.shellSort(b);
        complex.mergeSort(c, tmp, 0, c.length - 1);
        complex.shellSort(d);
        complex.radixSort(e, e.length);
        complex.mergeSort(f, tmp, 0, f.length - 1);

        System.out.println("\n");
        System.out.println("Content of array a (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(a[j] + " ");
        }

        System.out.println("Content of array b (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(b[j] + " ");
        }

        System.out.println("Content of array c (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(c[j] + " ");
        }

        System.out.println("Content of array d (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(d[j] + " ");
        }

        System.out.println("Content of array e (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(e[j]);
        }

        System.out.println("Content of array f (sorted):");
        for(int j = 0; j < 100; j++){
            System.out.print(f[j] + " ");
        }
    }
}