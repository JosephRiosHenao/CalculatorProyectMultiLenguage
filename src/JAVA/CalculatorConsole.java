package JAVA;

import java.util.Scanner;

public class CalculatorConsole {

    public static boolean NivelCalculadora(){
        boolean Ciclo = true, LVLMode = false;
        while (Ciclo){
            System.out.println("Digite el nivel de calculadora a manejar \n 1. Basica \n 2. Avanzada");
            Scanner Entrada = new Scanner(System.in);
            int LVL = Entrada.nextInt();
            if ( LVL == 1 || LVL == 2){
                Ciclo = false;
                if (LVL == 1){
                    LVLMode = false;
                    System.out.println("--Nivel de Calculadora registrado--");
                }else{
                    LVLMode = true;
                    System.out.println("--Nivel de Calculadora registrado--");
                } 
            }else{
                System.out.println("Digite un dato valido");
            }
        }
        return LVLMode;
    }
    
    public static void Menu() {
        System.out.println("Digi");
    }
}
