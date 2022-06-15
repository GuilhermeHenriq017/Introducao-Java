package App;
import java.util.Scanner;

import Algoritmo.ValidaCPF;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
            // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true)
           System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF) + "   11CPF válido!");
        else System.out.printf("Erro, CPF invalido !!!\n");
        }
    }
    




