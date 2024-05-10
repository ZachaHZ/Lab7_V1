package domain;

import org.junit.jupiter.api.Test;

import static domain.Elementary.sorted;

class ElementaryTest {
    @Test
    public void testing(){
        Elementary elementary = new Elementary();
        int[] a = new int[20000];
        int[] b = new int[20000];
        int[] c = new int[20000];
        int[] d = new int[20000];
        int[] e = new int[20000];
        int[] f = new int[20000];
        int count = 0;

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
        for(int j = 0; j <=500; j++){
            System.out.println(a[j]);
        }

        System.out.println("Content of array b (without sorting):");
        for(int j = 0; j <=500; j++){
            System.out.println(b[j]);
        }

        System.out.println("Content of array c (without sorting):");
        for(int j = 0; j <=500; j++){
            System.out.println(c[j]);
        }

        System.out.println("Content of array d (without sorting):");
        for(int j = 0; j <=500; j++){
            System.out.println(d[j]);
        }

        System.out.println("Content of array e (without sorting):");
        for(int j = 0; j <=500; j++){
            System.out.println(e[j]);
        }

        System.out.println("Content of array f (without sorting):");
        for(int j = 0; j <=500; j++){
            System.out.println(f[j]);
        }

        if (!isSorted(a)){
            elementary.improvedBubbleSort(a);
        }

        if (!isSorted(b)){
            elementary.bubbleSort(b);
        }

        if (!isSorted(c)){
            elementary.selectionSort(c);
        }

        if (!isSorted(d)){
            elementary.improvedBubbleSort(d);
        }

        if (!isSorted(e)){
            elementary.countingSort(e);
        }

        if (!isSorted(f)){
            elementary.selectionSort(f);
        }

        System.out.println("Content of array a (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(a[j]);
        }

        System.out.println("Content of array b (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(b[j]);
        }

        System.out.println("Content of array c (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(c[j]);
        }

        System.out.println("Content of array d (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(d[j]);
        }

        System.out.println("Content of array e (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(e[j]);
        }

        System.out.println("Content of array f (sorted):");
        for(int j = 0; j <=500; j++){
            System.out.println(f[j]);
        }
    }

    public boolean isSorted(int[] a){
        if(sorted == 1)
            return true;
        return false;
    }
}