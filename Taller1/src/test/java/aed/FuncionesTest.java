package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FuncionesTest {
    Funciones funciones = new Funciones();

/***  Primera parte: Funciones en java ***/

    @Test
    void testCuadrado() {
        assertEquals(0, funciones.cuadrado(0));
        assertEquals(4, funciones.cuadrado(2));
        assertEquals(9, funciones.cuadrado(3));
    }

    @Test
    void testDistancia() {
        assertEquals(0, funciones.distancia(0, 0), 1e-5);
        assertEquals(5, funciones.distancia(3, 4), 1e-5);
        assertEquals(1.41421356237, funciones.distancia(1, 1), 1e-5);
        assertEquals(8.0622577483, funciones.distancia(7, 4), 1e-5);
    }

    @Test
    void testPar() {
        assertTrue(funciones.esPar(0));
        assertTrue(funciones.esPar(-2));
        assertTrue(funciones.esPar(8));
        assertTrue(funciones.esPar(14));
        assertFalse(funciones.esPar(1));
        assertFalse(funciones.esPar(-7));
        assertFalse(funciones.esPar(33));
    }

    @Test
    void testBisiesto() {
        assertTrue(funciones.esBisiesto(2024));
        assertTrue(funciones.esBisiesto(2012));
        assertTrue(funciones.esBisiesto(2000));
        assertFalse(funciones.esBisiesto(2023));
        assertFalse(funciones.esBisiesto(2014));
        assertFalse(funciones.esBisiesto(2100));
    }
    
    @Test
    void testFactorialIterativo() {
        assertEquals(1, funciones.factorialIterativo(0));
        assertEquals(1, funciones.factorialIterativo(1));
        assertEquals(2, funciones.factorialIterativo(2));
        assertEquals(120, funciones.factorialIterativo(5));
        assertEquals(3628800, funciones.factorialIterativo(10));
    }

    @Test
    void testFactorialRecursivo() {
        assertEquals(1, funciones.factorialRecursivo(0));
        assertEquals(1, funciones.factorialRecursivo(1));
        assertEquals(2, funciones.factorialRecursivo(2));
        assertEquals(120, funciones.factorialRecursivo(5));
        assertEquals(3628800, funciones.factorialRecursivo(10));
    }

    @Test
    void testPrimo() {
        assertFalse(funciones.esPrimo(0));
        assertFalse(funciones.esPrimo(1));
        assertFalse(funciones.esPrimo(4));
        assertFalse(funciones.esPrimo(49));
        assertTrue(funciones.esPrimo(2));
        assertTrue(funciones.esPrimo(3));
        assertTrue(funciones.esPrimo(17));
    }

    @Test
    void testSumatoria() {
        assertEquals(0, funciones.sumatoria(new int[]{}));
        assertEquals(15, funciones.sumatoria(new int[]{0,1,2,3,4,5}));
        assertEquals(10, funciones.sumatoria(new int[]{2,3,5}));
        assertEquals(-8, funciones.sumatoria(new int[]{5, -25, 4, 8}));
    }

    @Test
    void testBusqueda() {
        assertEquals(0, funciones.busqueda(new int[]{1, 2, 3}, 1));
        assertEquals(2, funciones.busqueda(new int[]{10, 11, 15, 24}, 15));
        assertEquals(3, funciones.busqueda(new int[]{10, 11, 15, 24}, 24));
    }

    @Test
    void testTienePrimo() {
        assertFalse(funciones.tienePrimo(new int[]{1,4,6,15}));
        assertTrue(funciones.tienePrimo(new int[]{7,4,6,15}));
        assertTrue(funciones.tienePrimo(new int[]{1,4,7,15}));
        assertTrue(funciones.tienePrimo(new int[]{1,4,6,7}));
        assertTrue(funciones.tienePrimo(new int[]{2, 5, 11}));
    }

    @Test
    void testTodosPares() {
        assertTrue(funciones.todosPares(new int[]{6, 2, 14, 20}));
        assertFalse(funciones.todosPares(new int[]{3, 2, 14, 20}));
        assertFalse(funciones.todosPares(new int[]{6, 3, 14, 20}));
        assertFalse(funciones.todosPares(new int[]{6, 2, 14, 7}));
    }

    @Test
    void testPrefijo() {
        assertTrue(funciones.esPrefijo("abcde", "abcde"));
        assertTrue(funciones.esPrefijo("abcde", "abcdefg"));
        assertFalse(funciones.esPrefijo("abcde", "bcdefg"));
        assertFalse(funciones.esPrefijo("abcde", "abcdfg"));
        assertFalse(funciones.esPrefijo("abcde", "abc"));
    }

    @Test
    void testSufijo() {
        assertTrue(funciones.esSufijo("edcba", "edcba"));
        assertTrue(funciones.esSufijo("edcba", "gfedcba"));
        assertFalse(funciones.esSufijo("edcba", "gfedcb"));
        assertFalse(funciones.esSufijo("edcba", "gfdcba"));
        assertFalse(funciones.esSufijo("edcba", "cba"));
    }

/***  Segunda parte: Debugging ***/

    
    @Test
    void testXOR() {
        assertFalse(funciones.xor(false, false));
        assertTrue(funciones.xor(false, true));
        assertTrue(funciones.xor(true, false));
        assertFalse(funciones.xor(true, true));
    }
    
    @Test
    void testIguales() {
        assertTrue(funciones.iguales(new int[0], new int[0]));
        assertTrue(funciones.iguales(new int[]{1,2,3}, new int[]{1,2,3}));
        assertFalse(funciones.iguales(new int[]{1,2,3}, new int[]{1,2,4}));
        assertFalse(funciones.iguales(new int[]{1,2,3}, new int[]{3,2,1}));
        assertFalse(funciones.iguales(new int[]{1,2,3}, new int[]{1,2,3,4}));
        assertFalse(funciones.iguales(new int[]{1,2,3,4}, new int[]{1,2,3}));
    }

    @Test
    void testOrdenado() {
        assertTrue(funciones.ordenado(new int[0]));
        assertTrue(funciones.ordenado(new int[]{5}));
        assertTrue(funciones.ordenado(new int[]{7,7,7}));
        assertTrue(funciones.ordenado(new int[]{4,5,6}));
        assertTrue(funciones.ordenado(new int[]{6,20,31,98}));
        assertFalse(funciones.ordenado(new int[]{4,5,4}));
        assertFalse(funciones.ordenado(new int[]{3,2,1}));
        assertFalse(funciones.ordenado(new int[]{8, 14, 12, 25}));
    }

    @Test
    void testMaximo() {
        assertEquals(0, funciones.maximo(new int[]{0}));
        assertEquals(1, funciones.maximo(new int[]{1}));
        assertEquals(10, funciones.maximo(new int[]{4, 8, 10}));
        assertEquals(40, funciones.maximo(new int[]{40, 8, 10}));
        assertEquals(80, funciones.maximo(new int[]{40, 80, 10}));
        assertEquals(-2, funciones.maximo(new int[]{-6, -2, -5}));
    }

    @Test
    void testTodosPositivos() {
        assertTrue(funciones.todosPositivos(new int[0]));
        assertTrue(funciones.todosPositivos(new int[]{4}));
        assertTrue(funciones.todosPositivos(new int[]{5, 8, 3}));
        assertFalse(funciones.todosPositivos(new int[]{7, 4, 0}));
        assertFalse(funciones.todosPositivos(new int[]{7, -2, 4}));
    }
    

    /*** Ejercicio 1 – cuadrado ***/
    @Test
    void testCuadradoExtra() {
        assertEquals(0, funciones.cuadrado(0));
        assertEquals(1, funciones.cuadrado(-1));   // negativo
        assertEquals(1000000, funciones.cuadrado(1000)); // grande
    }

    /*** Ejercicio 2 – distancia ***/
    @Test
    void testDistanciaExtra() {
        assertEquals(13, funciones.distancia(5, 12), 1e-5); // triple pitagórico
        assertEquals(7, funciones.distancia(0, -7), 1e-5); // eje Y negativo
    }

    /*** Ejercicio 3 – esPar ***/
    @Test
    void testEsParExtra() {
        assertTrue(funciones.esPar(1000000));   // grande
        assertFalse(funciones.esPar(999999));
    }

    /*** Ejercicio 4 – esBisiesto ***/
    @Test
    void testEsBisiestoExtra() {
        assertTrue(funciones.esBisiesto(2400)); // múltiplo de 400
        assertFalse(funciones.esBisiesto(1900)); // múltiplo de 100 pero no de 400
    }

    /*** Ejercicio 5 – factorial ***/
    @Test
    void testFactorialExtra() {
        assertEquals(1, funciones.factorialIterativo(0));
        assertEquals(720, funciones.factorialRecursivo(6));
        assertEquals(479001600, funciones.factorialIterativo(12)); // límite int32
    }

    /*** Ejercicio 6 – esPrimo ***/
    @Test
    void testEsPrimoExtra() {
        assertTrue(funciones.esPrimo(97)); // primo mayor
        assertFalse(funciones.esPrimo(100)); // compuesto
    }

    /*** Ejercicio 7 – sumatoria ***/
    @Test
    void testSumatoriaExtra() {
        assertEquals(0, funciones.sumatoria(new int[]{})); // vacío
        assertEquals(-6, funciones.sumatoria(new int[]{-1,-2,-3}));
    }

    /*** Ejercicio 8 – busqueda ***/
    @Test
    void testBusquedaExtra() {
        assertEquals(1, funciones.busqueda(new int[]{4, 5, 6}, 5));
        assertEquals(0, funciones.busqueda(new int[]{5, 5, 5}, 5)); // repetidos
    }

    /*** Ejercicio 9 – tienePrimo ***/
    @Test
    void testTienePrimoExtra() {
        assertFalse(funciones.tienePrimo(new int[]{})); // vacío
        assertTrue(funciones.tienePrimo(new int[]{4,6,9,11})); // último es primo
    }

    /*** Ejercicio 10 – todosPares ***/
    @Test
    void testTodosParesExtra() {
        assertTrue(funciones.todosPares(new int[]{})); // vacíamente verdadero
        assertFalse(funciones.todosPares(new int[]{2,4,5}));
    }

    /*** Ejercicio 11 – esPrefijo ***/
    @Test
    void testEsPrefijoExtra() {
        assertTrue(funciones.esPrefijo("", "hola")); // vacío es prefijo
        assertFalse(funciones.esPrefijo("hola mundo", "hola")); // más largo
    }

    /*** Ejercicio 12 – esSufijo ***/
    @Test
    void testEsSufijoExtra() {
        assertTrue(funciones.esSufijo("", "hola")); // vacío es sufijo
        assertFalse(funciones.esSufijo("mundo hola", "hola")); // más largo
    }

    /*** Ejercicio 13 – xor ***/
    @Test
    void testXorExtra() {
        assertFalse(funciones.xor(false, false));
        assertTrue(funciones.xor(true, false));
        assertTrue(funciones.xor(false, true));
        assertFalse(funciones.xor(true, true));
    }

    /*** Ejercicio 14 – iguales ***/
    @Test
    void testIgualesExtra() {
        assertTrue(funciones.iguales(new int[]{}, new int[]{}));
        assertFalse(funciones.iguales(new int[]{1,2}, new int[]{2,1})); // distinto orden
        assertFalse(funciones.iguales(new int[]{1,2,3}, new int[]{1,2}));
    }

    /*** Ejercicio 15 – todosPositivos ***/
    @Test
    void testTodosPositivosExtra() {
        assertTrue(funciones.todosPositivos(new int[]{1,2,3}));
        assertFalse(funciones.todosPositivos(new int[]{0,1,2})); // 0 no es positivo
    }

    /*** Ejercicio 16 – maximo ***/
    @Test
    void testMaximoExtra() {
        assertEquals(7, funciones.maximo(new int[]{7})); // único elemento
        assertEquals(10, funciones.maximo(new int[]{1,10,5}));
        assertEquals(-1, funciones.maximo(new int[]{-3,-1,-5}));
    }

    /*** Ejercicio 17 – ordenado ***/
    @Test
    void testOrdenadoExtra() {
        assertTrue(funciones.ordenado(new int[]{1,2,2,3}));
        assertFalse(funciones.ordenado(new int[]{5,4,3}));
    }


}
