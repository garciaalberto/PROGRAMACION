#Ejercicio número 11 de iniciación a la programación
#Autor: Alberto García
print("Inserte el número 1 (N1):")
num1 = int(input())
print("Inserte el número 2 (N2):")
num2 = int(input())
print("Inserte el número 3 (N3):")
num3 = int(input())
if ((num1+num2) is num3): print("Se cumple que N3 = N1 + N2")
elif ((num1+num3) is num2): print("Se cumple que N2 = N1 + N3")
elif ((num2+num3) is num1): print("Se cumple que N1 = N2 + N3")
else: print("Los números no cumplen la condición")