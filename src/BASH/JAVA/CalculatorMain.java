package BASH.JAVA;

public class CalculatorMain {

    public static int OperacionElegida;
    public static boolean NivelCalcladora;
    public static boolean CicloDeCalculadoraBasica;

    public static void main(String[] args) {
        NivelCalcladora = BASH.JAVA.CalculatorConsole.NivelCalculadora();
        if (NivelCalcladora){ //Avanzado
        
        }else{ //Basico
            CicloDeCalculadoraBasica = true;
            while (CicloDeCalculadoraBasica){
                OperacionElegida = BASH.JAVA.CalculatorConsole.MenuBasico();
                if (OperacionElegida == 1){ //Suma
    
                }else if (OperacionElegida == 2){ //Resta
    
                }else if (OperacionElegida == 3){ //Multiplicacion
    
                }else if (OperacionElegida == 4){ //Division

                }else if (OperacionElegida == 5){ //Potenciacion

                }else if (OperacionElegida == 6){ //Radicacion

                }else{//Volver al inicio
                    CicloDeCalculadoraBasica = false;
                }
            }
            
        }   
    }
}
