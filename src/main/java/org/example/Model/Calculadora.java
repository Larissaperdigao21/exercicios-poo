package org.example.Model;

import java.util.Scanner;

public class Calculadora {
    //METODOS PUBLICOS
    public static int soma(int a, int b) {
        int soma = (a + b);
        return soma;
    }

    public static int subtracao(int a, int b) {
        int subtracao = (a - b);
        return subtracao;
    }

    public static int multiplicacao(int a, int b) {
        int multiplicacao = (a * b);
        return multiplicacao;
    }

    public static double divisao(int a, int b) {
        if (b != 0) {
            double divisao = (a / b);
            return divisao;
        } else {
            System.out.println("Nao e possivel dividir um numero por zero!!");
        }
        return 0;
    }

    public void abrirMenu(){
        Scanner teclado = new Scanner(System.in);
        User user = new User();

        System.out.println("SEJA BEM VINDO A CALCULADORA POO.");
        System.out.print("Vamos começar com o seu nome: ");
        user.setNome(teclado.nextLine());
        System.out.print("Digite sua profissao: ");
        user.setProfissao(teclado.nextLine());
        System.out.print("Agora digite sua idade: ");
        user.setIdade(Integer.parseInt(teclado.nextLine()));
        System.out.println(user.toString());

        System.out.println("-----------------------------------");
        System.out.println("(1)PARA SOMAR");
        System.out.println("(2)PARA SUBTRAIR");
        System.out.println("(3)PARA MULTIPLICAR");
        System.out.println("(4)PARA DIVIDIR");
        System.out.println("(5)PARA SAIR");
        System.out.print("Selecione uma opcao: ");
        int escolha = teclado.nextInt();

        if(escolha != 5){
            System.out.println("Escolha o primeiro numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Escolha o segundo numero: ");
            int num2 = teclado.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("O resultado da soma entre os dois numeros e: " + Calculadora.soma(num1, num2));
                    break;
                case 2:
                    System.out.println("O resultado da subtracao entre os dois numeros e: " + Calculadora.subtracao(num1,num2));
                    break;
                case 3:
                    System.out.println("O resultado da multiplicacao entre os dois numeros e: " + Calculadora.multiplicacao(num1,num2));
                    break;
                case 4:
                    System.out.println("O resultado da divisao entre os dois numeros e: " + Calculadora.divisao(num1,num2));
                    break;
            }
        }else{
            System.out.println("SAINDO DA CALCULADORA...");
        }


    }


}
