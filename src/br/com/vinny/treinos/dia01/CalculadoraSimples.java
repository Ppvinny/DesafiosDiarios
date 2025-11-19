package br.com.vinny.treinos.dia01;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolhe = 0;
        int menu = 0;
        float valor1;
        float valor2;
        float resultado;

        System.out.println("Calculadora Simples");
        while (menu == 0) {
            System.out.println("Menu \n" + "1 - Soma.\n" + "2 - Subtração \n" + "3 - Multiplicação \n" + "4 - Divisão \n" + "5 - sair");

            escolhe = sc.nextInt();
            if (escolhe > 5) {
                System.out.println("Opção Invalida! ");
            } else {
                switch (escolhe) {
                    case 1:
                        System.out.println("Digite um numero: ");
                        valor1 = sc.nextFloat();
                        System.out.println("Digite outro numero: ");
                        valor2 = sc.nextFloat();
                        resultado = valor1 + valor2;
                        System.out.println("A soma do " + valor1 + " + " + valor2 + " é igual a " + resultado + "\n");
                        break;
                    case 2:
                        System.out.println("Digite um numero: ");
                        valor1 = sc.nextFloat();
                        System.out.println("Digite outro número: ");
                        valor2 = sc.nextFloat();
                        resultado = valor1 - valor2;
                        System.out.println("A subtração de " + valor1 + " - " + valor2 + " é igual a " + resultado + "\n");
                        break;
                    case 3:
                        System.out.printf("Digite um numero: ");
                        valor1 = sc.nextFloat();
                        System.out.println("Digite outro número: ");
                        valor2 = sc.nextFloat();
                        resultado = valor1 * valor2;
                        System.out.println("A multiplicação de " + valor1 + " * " + valor2 + "é igual a " + resultado + "\n");
                        break;
                    case 4:
                        do {
                            System.out.println("Digite um numero maior que 0 : ");
                            valor1 = sc.nextFloat();
                            System.out.println("Digite outro numero maior que 0: ");
                            valor2 = sc.nextFloat();
                        }
                        while (valor1 <= 0 || valor2 <= 0);
                        resultado = valor1 / valor2;
                        System.out.println("O divisão de " + valor1 + " / " + valor2 + " é igual a " + resultado + "\n");
                        break;
                    case 5:
                        System.out.println("Encerrado!");
                        menu = 5;
                        break;
                }
            }
        }
    }
}