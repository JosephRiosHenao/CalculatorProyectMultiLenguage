package BASH.JAVA;

import java.util.Scanner;

public class CalculatorFormulasBasicas {
    boolean Ciclo, Ciclo2;
    Scanner Entrada = new Scanner(System.in);
    int Cantidad;
    public Double Resultado;
    String MostrarResultado = "...";


    public int NumerosMultiples(){
        int Confirmacion;
        int CantidadAEvaluar = 0;
        Ciclo = true;
        while (Ciclo){
            System.out.println("Digite cantidad de numeros a digitar");
            CantidadAEvaluar = Entrada.nextInt();
            if (CantidadAEvaluar >= 2 && CantidadAEvaluar <= 10){
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
        return CantidadAEvaluar;
    }


    public void PedirNumeroDouble(){

    }

    
    public void Sumar(){
        Cantidad = NumerosMultiples();
        double num[] = new double[Cantidad];
        for (int i = 0; i < Cantidad; i++){
            System.out.println("Digite el "+(i+1)+"° numero a sumar");
            num[i] = Entrada.nextDouble();
            if (i == 0){
                MostrarResultado = "El resultado es: "+num[i];
            }else{
                MostrarResultado += " + "+num[i];
                Resultado += num[i];
            }
        }
        MostrarResultado += " = "+Resultado;
        System.out.println(MostrarResultado);
    }
}
