package edu.uca;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class DataStructures {
    //Si se alteran los tests, se invalidará el ejercicio sin posibilidad de corregirlo.
    public static List<String> concatenarListas(List<String> lista1, List<String> lista2) {
        List<String> concatenada = new ArrayList<>();
        // Implementación aquí
        return concatenada;
    }

    @Test
    public void testConcatenarListas() {
        List<String> lista1 = Arrays.asList("a", "b", "c");
        List<String> lista2 = Arrays.asList("d", "e", "f");
        List<String> esperado = Arrays.asList("a", "b", "c", "d", "e", "f");
        Assert.assertEquals(esperado, concatenarListas(lista1, lista2));
    }

    public static int contarPalabrasUnicas(List<String> palabras) {
        int conteo = 0;
        // Implementación aquí
        return conteo;
    }

    @Test
    public void testContarPalabrasUnicas() {
        List<String> palabras = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        int esperado = 3; // 'apple', 'banana', 'orange'
        Assert.assertEquals(esperado, contarPalabrasUnicas(palabras));
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
        Map<String, Integer> combinado = new HashMap<>();
        // Implementación aquí
        return combinado;
    }

    @Test
    public void testCombinarMapas() {
        Map<String, Integer> mapa1 = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> mapa2 = Map.of("b", 3, "c", 4, "d", 5);
        Map<String, Integer> esperado = Map.of("a", 1, "b", 5, "c", 7, "d", 5);
        Assert.assertEquals(esperado, combinarMapas(mapa1, mapa2));
    }
}
