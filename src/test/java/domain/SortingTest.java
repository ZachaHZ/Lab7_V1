package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

    @Test
    public void testBinarySearchIterative() {
        // Generar un array aleatorio de tamaño 30
        int[] array = generateRandomArray();

        // Ordenar el array
        Arrays.sort(array);

        // Elemento a buscar
        int element =0; //TODO

        // Realizar la búsqueda binaria iterativa
        Search search = new Search();
        int pos = search.binarySearch(array, element);

        // Verificar el resultado de la búsqueda binaria iterativa
        if (pos != -1) {
            System.out.println("El elemento [" + element + "] existe en la posición: " + pos);
            assertTrue(array[pos] == element);
        } else {
            System.out.println("El elemento [" + element + "] no existe en el array.");
            assertFalse(Arrays.stream(array).anyMatch(x -> x == element));
        }
    }

    @Test
    public void testBinarySearchRecursive() {
        // Generar un array aleatorio de tamaño 30
        int[] array = generateRandomArray();

        // Ordenar el array
        Arrays.sort(array);

        // Elemento a buscar
        int element = 0; //TODO

        // Realizar la búsqueda binaria recursiva
        Search search = new Search();
        int pos = search.binarySearch(array, element, 0, array.length - 1);

        // Verificar el resultado de la búsqueda binaria recursiva
        if (pos != -1) {
            System.out.println("El elemento [" + element + "] existe en la posición: " + pos);
            assertTrue(array[pos] == element);
        } else {
            System.out.println("El elemento [" + element + "] no existe en el array.");
            assertFalse(Arrays.stream(array).anyMatch(x -> x == element));
        }
    }

    // Método para generar un array aleatorio de tamaño 30 con valores entre 1 y 100
    public static int[] generateRandomArray() {
        int[] randomArray = new int[30];
        for (int i = 0; i < 30; i++) {
            randomArray[i] = (int) (Math.random() * 100) + 1; // Valores entre 1 y 100
        }
        return randomArray;
    }
}