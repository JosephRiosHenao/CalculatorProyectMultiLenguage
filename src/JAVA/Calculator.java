package JAVA;

import java.util.Scanner;



public class Calculator {

    public static int ModoElegido, OperacionElegida;
    public static boolean NivelCalcladora;

    public static void main(String[] args) {
        ModoElegido = PreguntarModo(0);
        System.out.println(ModoElegido);
        switch (ModoElegido){
            case 1: //Console
                NivelCalcladora = JAVA.CalculatorConsole.NivelCalculadora();
                if (NivelCalcladora){ //Avanzado

                }else{ //Basico
                    OperacionElegida = JAVA.CalculatorConsole.MenuBasico();

                }
            break;
            case 2:

            break;
            case 3:

            break;
        }
    }
    
    public static int PreguntarModo(int Modo) {
        boolean Ciclo = true;
        while (Ciclo) {
            System.out.println("Digite el Modo de la calculadora \n 1. Console \n 2. JOptionPane \n 3. JPanel");
            Modo = new Scanner(System.in).nextInt();
            if (Modo == 1 || Modo == 2 || Modo == 3){
                System.out.println("--Modo registrado--");
                break;
            }else{
                System.out.println("Digite un indice valido");
            }
        }
        return Modo;
    }
}
