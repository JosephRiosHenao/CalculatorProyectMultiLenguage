def Sumar():
    CicloFunciones = True;
    Resultado = 0.0
    while (CicloFunciones):
        CantidadSinEvaluar = int(input("Digite la cantidad de numeros a sumar"))
        if (CantidadSinEvaluar>=10):
            CicloFunciones = False
            ConfirmacionDeNumero = True            
            while (ConfirmacionDeNumero):
                Confirmacion = int(input(f"Estas seguro de sumar {CantidadSinEvaluar} numeros \n 1. Si \n 2. No"))
                if (Confirmacion==1 or Confirmacion==2):
                    if Confirmacion==2:
                        CicloFunciones=True
                    ConfirmacionDeNumero = False
                    cantidad = CantidadSinEvaluar
                    Resultado = SumarVarios(cantidad)
                else:
                    print("--Digite un dato valido--")
        elif (CantidadSinEvaluar<=10 and CantidadSinEvaluar>= 0):
            CicloFunciones = False
            Resultado = SumarPocos(cantidad)
    return Resultado


def SumarVarios(cantidad):
    Resultado = 0.0
    NumeroEnCola = [None]*(cantidad+1)
    NumeroEnCola[0] = 0
    for Indice in len(NumeroEnCola):
        
    return Resultado

def SumaPocos(cantidad):
    
    return Resultado