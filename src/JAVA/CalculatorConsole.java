package JAVA;

import java.util.Scanner;

public class CalculatorConsole {

    public static boolean Ciclo;
    public static Scanner Entrada = new Scanner(System.in);

    public static boolean NivelCalculadora(){
        boolean LVLMode = false;
        Ciclo = true;
        while (Ciclo){
            System.out.println("Digite el nivel de calculadora a manejar \n 1. Basica \n 2. Avanzada");
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
    
    public static int MenuBasico() {
        int OperacionAElegir = 0;
        Ciclo = true;
        while (Ciclo){
            System.out.println("Acontinuacion digite la operacion a realizar" 
            +"\n 1. Suma" 
            +"\n 2. Resta" 
            +"\n 3. Multiplicación" 
            +"\n 4. Division"
            +"\n 5. Potenciación" 
            +"\n 6. Radicación"
            +"\n 7. Reiniciar programa");
            OperacionAElegir = Entrada.nextInt();
            if (OperacionAElegir >= 1 && OperacionAElegir <= 7){
                Ciclo = false;
                System.out.println("--Operacion elegida registrada--");
            }else{
                System.out.println("Digite un dato valido");
            }
        }
        return OperacionAElegir;
    }
}
