package JAVA;

import java.util.Scanner;



public class Calculator {

    public static int ModoElegido;

    public static void main(String[] args) {
        ModoElegido = PreguntarModo(0);
        System.out.println(ModoElegido);
        switch (ModoElegido){
            case 1: //Console
                boolean NivelCalcladora = JAVA.CalculatorConsole.NivelCalculadora();
                JAVA.CalculatorConsole.Menu();
            break;
            case 2:

            break;
            case 3:

            break;
        }
        PreguntarLVL();
        MenuInicial();
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

    public static void PreguntarLVL() {
    }    
    public static void MenuInicial() {
        System.out.println("hola");
    }
}