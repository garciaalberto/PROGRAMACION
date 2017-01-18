#Ejercicio número 2 de iniciación a la programación (Resuelto con TDD)
#Autor: Alberto García
import math
def calcularPerimetroArea (radio):
    perimetro = float(radio * 2 * math.pi)
    area = float(math.pi * radio ** 2)
    return perimetro, area

#Caso test 1
#radio = 3      output = 18.8496    28,2743
radio =3
perimetro, area = calcularPerimetroArea (radio)

if perimetro == 18.8496 and area == 28.2743:
    print("PASS Caso test 1")
    
else:
    print("FAIL Caso test 1")
#Da FAIL; comprobar numeros flotantes