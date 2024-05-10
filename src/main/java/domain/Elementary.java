/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Profesor Lic. Gilberth Chaves A.
 */
public class Elementary {
    private int it_total;
    static int  sorted=0;
    public int getIt_total(){
        return it_total;
    }
    public void setSorted(int sorted){
        this.sorted=sorted;
    }

    public void bubbleSort(int a[]){
        for(int i=1;i<a.length;i++)
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }//if
            }//for j
        sorted=1;
    }

    public void improvedBubbleSort(int a[]){
        boolean swapped = true; //intercambiado
        for(int i=1;swapped;i++){
            swapped = false;
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                    swapped = true;
                }//if
            }//for j
        }//for i
        sorted=1;
    }

    public void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=a[i];
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    minIndex=j;
                }//if
            }//for j
            a[minIndex]=a[i];
            a[i]=min;
        }//for i
        sorted=1;
    }

    public void countingSort(int a[]) {
        int max = util.Utility.maxArray(a); //va de 0 hasta el elemento maximo
        // create buckets
        int counter[] = new int[max + 1];
        // fill buckets
        for (int element : a) {
            counter[element]++; //incrementa el num de ocurrencias del elemento
        }
        // sort array
        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i]>0) { //significa q al menos hay un elemento (q existe)
                a[index++] = i;
                counter[i]--;
            }
        }//for i
        sorted=1;
    }

    //public boolean isSorted(int[] a){
    //if(sorted == 1)
    //    return true;
    //return false;
    //}


}

