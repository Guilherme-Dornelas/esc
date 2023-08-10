package br.senai.sp.escola;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        String professor;
        String NomedoAluno;
        String disciplina;
        int frequencia;
        int nota1;
        int nota2;
        float mediadoAluno;
        String sit;
        boolean continuar = true;


        Scanner teclado = new Scanner(System.in);

        while (continuar) {

            System.out.println("------------------------------------");
            System.out.println("ola prof, qual seu nome:");
            professor = teclado.next();
            System.out.println("informe o nome do aluno");
            NomedoAluno = teclado.next();
            System.out.println("infome sua disciplina");
            disciplina = teclado.next();
            System.out.println("informe afrequencia do aluno:");
            frequencia = teclado.nextInt();
            System.out.println("informe nota 1");
            nota1 = teclado.nextInt();
            System.out.println(" informe nota 2 ");
            nota2 = teclado.nextInt();
            System.out.println("-----------------------------------");

            boolean validacao = ("vitor".equalsIgnoreCase(professor));

            mediadoAluno = (nota1 + nota2 / 2);
            System.out.println(mediadoAluno);

            if (mediadoAluno >= 7 && frequencia >= 75 && !validacao || mediadoAluno >= 6 && frequencia >= 90 && !validacao) {
                sit = " aprovado";
            } else {
                sit = "Reprovado";
            }


            System.out.println("ola prof" + " " + professor + " " + " tudo bem");
            System.out.println("ola" + " " + NomedoAluno);
            System.out.println(" sua disciplina: " + " " + disciplina);
            System.out.println(" a frequencia do aluno" + " " + NomedoAluno + " " + frequencia);
            System.out.println("a nota 1 do aluno" + " " + NomedoAluno + " " + nota1);
            System.out.println("a nota 2 do aluno" + " " + NomedoAluno + " " + nota2);
            System.out.println("A situçao do aluno e:" + " " + sit);

            System.out.println("Deseja cadastrar um novo aluno ?");
            String resp = teclado.next();

            if (resp .equalsIgnoreCase("nao")){
                continuar = false;
            }
        }

        System.out.println(" cadastro Finalizado com sucesso !");
    }


}
