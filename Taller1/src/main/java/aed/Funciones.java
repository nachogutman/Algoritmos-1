package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        return x * x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        return (n % 4 == 0 && !(n % 100 == 0)) || n % 400 == 0;
    }

    int factorialIterativo(int n) {
        int resultado = 1;
        for(int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }

    int factorialRecursivo(int n) {
        if(n == 0 | n == 1){
            return 1;
        } else {
            return n * factorialRecursivo(n-1);
        }
    }

    boolean esPrimo(int n) {
        if(n == 0 | n == 1){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        int suma = 0;
        for(int i = 0;i < numeros.length;i++){
            suma += numeros[i];
        }
        return suma;
    }

    int busqueda(int[] numeros, int buscado) {
        for(int i = 0; i < numeros.length; i++){
            if (buscado == numeros[i]){
                return i;
            }
        }
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            if(esPrimo(numeros[i])){
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 1; i <= s1.length(); i++){
            if(s1.charAt(s1.length() - i) != s2.charAt(s2.length() - i)){
                return false;
            }
        }
        return true;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        if(xs.length != ys.length){
            res = false;
        } else{
            for (int i = 0; i < xs.length; i++) {
                if (xs[i] != ys[i]) {
                    res = false;
                }
            }
        }
        
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length - 1; i++) {
            if (xs[i] > xs[i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) res = xs[i];
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x : xs) {
            if (x <= 0) {
                res = false;
            }
        }
        return res;
    }

}
