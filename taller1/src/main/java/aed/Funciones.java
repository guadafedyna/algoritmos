package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        return (x*x);
    }

    double distancia(double x, double y) {
        double res = Math.sqrt((x*x) + (y*y));
        return res;
    }

    boolean esPar(int n) {
        return (n % 2 == 0);
    }

    boolean esBisiesto(int n) {
        return (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0));
    }

    int factorialIterativo(int n) {
        int res = 1;
        if (n == 0){
            return 1; 
        } else {
            for (int i = 1; i <= n; i++){
                res = res * i;
            }
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialIterativo(n-1);
    }

    boolean esPrimo(int n) {
        int contadorDivisores = 0;
        for (int i= 1; i<= n; i++){
            if (esDivisor(i,n)){
                contadorDivisores ++;
            }
        }
        return contadorDivisores == 2;
    }

    boolean esDivisor(int divisor, int n){
        return n % divisor == 0;
    }

    int sumatoria(int[] numeros) {
        int longitud = numeros.length;
        int res = 0;

        for (int i=0; i < longitud; i++){
            res += numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int longitud = numeros.length;
        int posicion = 0;

        for(int i=0; i<longitud; i++){
            if (numeros[i] == buscado){
                posicion = i;
            }
        }
        return posicion;
    }

    boolean tienePrimo(int[] numeros) {
        int longitud = numeros.length;

        for(int i = 0; i< longitud; i++){
            if (esPrimo(numeros[i])){
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        int longitud = numeros.length;

        for(int i=0; i<longitud; i++){
            if (!(esPar(numeros[i]))){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        int longitud1 = s1.length(); 
        int longitud2 = s2.length();

        for(int i = 0; i < longitud1; i++){
            if ((s1.charAt(i) != s2.charAt(i)) | (longitud1 > longitud2) ){
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        int longitud1 = s1.length();
        int longitud2 = s2.length();

        for(int i=0; i< longitud1; i++){
            if((s1.charAt(longitud1-i-1) != s2.charAt(longitud2-i-1)) | longitud1 > longitud2){
                return false;
            }
        }
        return true;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && (!(a && b));
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        int longitudx = xs.length;
        int longitudy = ys.length;

        if (longitudx != longitudy){
            return false;
        }

        for (int i = 0; i < xs.length; i++) {
            if ((xs[i] != ys[i]))  {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length-1 ; i++) {
            if (xs[i] > xs[i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res){
                res = xs[i];
            }
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
