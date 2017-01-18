#Programa que calcula el Factorial de un número
#Autores: Isabel Martinez y Alberto Garcia

import math #Importa librería math, usada para hacer los casos test

def factorial(numero):
    
    assert isinstance (numero, int), "No es un número entero" #Precondición
    assert numero >= 0, "El número intruducido es negativo" #Precondición

    multiplicador = 1
    contador = 1

    if numero == 0:
        return 1
    else:
        while contador <= numero:
            multiplicador = multiplicador * contador
            contador = contador + 1
    
    assert isinstance (multiplicador, int), "La función no devuelve un número entero" #Postcondición
    assert numero >= 0, "La función no devuelve un número positivo" #Postcondición
    return multiplicador

## CASOS TEST ##

# TEST número 0
numero = 0
factorial(numero)
if factorial(numero) == math.factorial(numero):
    print("Caso Test zero ok")
else:
    print("Caso Test zero no ok")

# TEST números positivos
for numero in range(1, 11):
    if factorial(numero) == math.factorial(numero):
        print("Caso Test números ok " + str(numero))
    else:
        print("Caso Test numeros no ok " + str(numero))

# TEST número negativo
numero = -2
factorial(numero) #Esto debería lanzar un error de aserción

# TEST valor es string
numero = "abc"
factorial(numero) #Esto debería lanzar un error de aserción

# TEST número decimal
numero = 3.6
factorial(numero) #Esto debería lanzar un error de aserción