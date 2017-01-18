#Ejercicio número 13 de iniciación a la programación
#Autor: Alberto García
print("Inserte una cantidad:")
val = int(input())
if (val<=20): print(val)
elif (val>20) and (val<=100): print(val-(val*5/100))
elif (val>100): print(val-(val*10/100))