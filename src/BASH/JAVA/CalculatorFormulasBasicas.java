package BASH.JAVA;

import java.util.Scanner;

public class CalculatorFormulasBasicas {
    boolean Ciclo, Ciclo2;
    Scanner Entrada = new Scanner(System.in);
    public int[] num;


    public int NumerosMultiples(){
        int Confirmacion;
        int CantidadAEvaluar = 0;
        System.out.println("Digite cantidad de numeros a digitar");
        CantidadAEvaluar = Entrada.nextInt();
        Ciclo = true;
        while (Ciclo){
            if (CantidadAEvaluar >= 1){
                Ciclo = false;
                System.out.println("--Operacion elegida registrada--");
                return CantidadAEvaluar;
            }else if(CantidadAEvaluar > 10){
                Ciclo2 = true;
                while (Ciclo2){
                    System.out.println("La cantidad("+CantidadAEvaluar+")es muy grande \n ¿Desea continuar? \n 1. Si \n 2. No");
                    Confirmacion = Entrada.nextInt();
                    if (Confirmacion == 1 || Confirmacion == 2){
                        Ciclo2 = false;
                        System.out.println("--Operacion elegida registrada--");
                        return CantidadAEvaluar;
                    }else{
                        System.out.println("Digite un dato valido");
                    }
                }
            }else{
                System.out.println("Digite un dato valido");
            }
        }
    }

    public float Sumar(int NumerosDeNumeros){

    }
}
