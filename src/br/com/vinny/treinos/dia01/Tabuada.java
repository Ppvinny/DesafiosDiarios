package br.com.vinny.treinos.dia01;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabuada;
        int resultado;

        System.out.println("Digite a numero para Tabuada:");
        tabuada = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            resultado = tabuada * i;
            System.out.println(tabuada + " * " + i + " = " + resultado);
        }
    }
}
