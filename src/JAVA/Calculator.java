package JAVA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int ModoElegido = PreguntarModo(0);
        PreguntarLVL();
        MenuInicial();
    }
    
    public static int PreguntarModo(int Modo) {
        boolean Ciclo = true;
        while (Ciclo) {
            System.out.println("Digite el Modo de la calculadora \n 1. Console \n 2. JOptionPane \n 3. GUI");
            Scanner Entrada = new Scanner(System.in);
            Modo = Entrada.nextInt();
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