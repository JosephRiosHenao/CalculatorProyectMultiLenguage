Limit = (int(input("Digite el max de numeros a escaner ")))
for i in range(Limit):
    if ((i%2) == 0):
        print((f"{i} es par"))
    else:
        print((f"{i} es impar"))