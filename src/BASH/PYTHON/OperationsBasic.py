def Sumar():
    CicloFunciones = True;
    while (CicloFunciones):
        CantidadSinEvaluar = int(input("Digite la cantidad de numeros a sumar"))
        if (CantidadSinEvaluar>=10):
            ConfirmacionDeNumero = True            
            while (ConfirmacionDeNumero):
                Confirmacion = int(input(f"Estas seguro de sumar {CantidadSinEvaluar} numeros"))
                if (Confirmacion==1 or Confirmacion==2):
                    ConfirmacionDeNumero = False
                    cantidad = CantidadSinEvaluar
                    Resultado = SumarVarios(cantidad)
                else:
                    print("--Digite un dato valido--")
        elif (CantidadSinEvaluar<=10 and CantidadSinEvaluar>= 0):
            Resultado = SumarPocos(cantidad)
    return Resultado


def SumarVarios(cantidad):
    NumeroEnCola = [None]*(cantidad+1)
    NumeroEnCola[0] = 0
    for Indice in len(NumeroEnCola):
        
    Resultado = 0

    return Resultado

def SumaPocos(cantidad):
    