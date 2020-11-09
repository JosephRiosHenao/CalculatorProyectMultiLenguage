def ModoDeVisualizacion():
    CicloFunciones = True
    Eleccion = 1
    while CicloFunciones:
        Eleccion = (int(input("Digite el modo de visualizacion a usar \n 1. Console \n 2.Graphics")))
        if Eleccion == 1 or Eleccion == 2:
            CicloFunciones = False
        else:
            print("\n Digite una opcion valida \n")
    return Eleccion

def LvLCalcculadoraConsole():
    CicloFunciones = True
    Eleccion = 1
    while CicloFunciones:
        Eleccion = (int(input("Digite el nivel de calculadora a usar \n 1. Basica \n 2. Avanzada")))
        if Eleccion == 1 or Eleccion == 2:
            CicloFunciones = False
        else:
            print("\n Digite una opcion valida \n")
    return Eleccion