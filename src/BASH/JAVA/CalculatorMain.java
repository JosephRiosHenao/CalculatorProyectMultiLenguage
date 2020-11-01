package BASH.JAVA;

public class CalculatorMain {

    public static int OperacionElegida;
    public static boolean NivelCalcladora;

    public static void main(String[] args) {
        NivelCalcladora = BASH.JAVA.CalculatorConsole.NivelCalculadora();

        if (NivelCalcladora){ //Avanzado

        }else{ //Basico
            OperacionElegida = BASH.JAVA.CalculatorConsole.MenuBasico();
        }
        
    }
}
