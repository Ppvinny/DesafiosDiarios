package br.com.vinny.treinos.dia01;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Categoria por Idade!");
        System.out.println("Digite sua idade: ");

        idade = sc.nextInt();
        while (idade < 0){
            System.out.println("Idade Invalida, digite novamente:");
            idade = sc.nextInt();
        }

        if (idade >= 0 && idade < 12 ){
            System.out.println("Criança!");
        }else if (idade > 12 && idade < 17 ){
            System.out.println("Adolescente!");
        } else if (idade > 17 && idade < 59) {
            System.out.println("Adulto!");
        } else {
            System.out.println("Idoso");
        }

    }
}
