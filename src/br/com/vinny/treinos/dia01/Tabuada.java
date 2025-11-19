package br.com.vinny.treinos.dia01;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabuada;

        System.out.println("Digite a numero para Tabuada:");
        tabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " * " + i + " = " + (tabuada * i));
        }
    }
}

