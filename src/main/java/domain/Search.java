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
public class Search {

    public int linearSearch(int a[], int element){
        if(element>a[a.length-1])
            return -1;
        for(int i=0;i<a.length;i++){
            if(a[i]==element)
                return i;
        }
        return -1;
    }


    /**
     * Recursive binarySearch(value, 0, data.length-1)
     * Data array must be sorted
     * @param sortedArray
     * @param value
     * @param low
     * @param high
     * @return
     */
    public int binarySearch (int sortedArray[], int value, int low, int high){
        int middle = (low+high)/2;
        if(low>high)
            return -1;
        else
        if(value==sortedArray[middle])
            return middle;
        else if (value<sortedArray[middle])
            return binarySearch(sortedArray, value, low, middle-1);
        else
            return binarySearch (sortedArray, value, middle+1, high);
    }

    /***
     * Iteractive binarySearch(value)
     * Data array must be sorted
     *
     * @param sortedArray
     * @param value
     * @return
     */
    public int binarySearch(int sortedArray[], int value){
        int low = 0;
        int high = sortedArray.length-1;
        int middle = (low+high)/2;
        while ((low<=high) && (sortedArray[middle]!=value)) {
            if (value<sortedArray[middle])
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low+high)/2;
        }//while
        if (low>high)
            return -1; //el elemento no existe
        return middle;
    }

}

