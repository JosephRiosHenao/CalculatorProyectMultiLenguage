Nombre = input("Digite su nombre: ")
Ciclo = True
while Ciclo:
    Edad = (int)(input("Digite su edad: "))
    if Edad >= 0 and Edad <= 100:
        Ciclo = False
        if Edad >= 18:
            print("Usted Sr "+Nombre+" es mayor de edad")
        if Edad <= 17:
            print("Usted Sr "+Nombre+" es menor de edad")
    else:
        print("Digite un valor valido")