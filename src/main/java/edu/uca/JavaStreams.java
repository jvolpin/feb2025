package edu.uca;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    //Si se alteran los tests, se invalidará el ejercicio sin posibilidad de corregirlo.
    public static List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        // Implementación aquí
        return cuadrados;
    }

    @Test
    public void testElevarAlCuadrado() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        List<Integer> esperado = Arrays.asList(1, 4, 9, 16);
        Assert.assertEquals(esperado, elevarAlCuadrado(numeros));
    }

    public static List<String> filtrarNombresPorLetra(List<String> nombres, char letra) {
        List<String> filtrados = new ArrayList<>();
        // Implementación aquí
        return filtrados;
    }

    @Test
    public void testFiltrarNombresPorLetra() {
        List<String> nombres = Arrays.asList("Alice", "Bob", "Charlie", "David");
        char letra = 'B';
        List<String> esperado = Arrays.asList("Bob");
        Assert.assertEquals(esperado, filtrarNombresPorLetra(nombres, letra));
    }

    public static int sumarElementos(List<Integer> numeros) {
        int suma = 0;
        return suma;
    }

    @Test
    public void testSumarElementos() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        int esperado = 10;
        Assert.assertEquals(esperado, sumarElementos(numeros));
    }
}
