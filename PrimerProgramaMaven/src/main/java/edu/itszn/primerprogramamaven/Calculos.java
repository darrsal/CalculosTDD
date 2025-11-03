package edu.itszn.primerprogramamaven;

public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int suma = 0;
        for (int i = x; i <= y; i++) {
            suma = suma + i;
        }
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res = Math.abs(num);
        return res;
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        if (texto == null) {
            return 0;
        } else {
            String vocales = "aeiou";
            char[] items = texto.toLowerCase().toCharArray();

            int cont = 0;
            for (char letra : items) {
                if (vocales.indexOf(letra) != -1) {
                    cont++;
                }
            }
            return cont;
        }
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        if (texto == null) {
            return null;
        } else if (texto.length() == 0) {
            return "";
        } else {
            String[] listaPalabras = texto.split(" ");
            StringBuilder textoInv = new StringBuilder();
            for (String palabra : listaPalabras) {
                StringBuilder palabraInv = new StringBuilder();
                palabraInv.append(palabra);
                textoInv.append(palabraInv.reverse());
                textoInv.append(" ");
            }
            return textoInv.toString().trim();
        }
    }

}
