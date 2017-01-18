#Ejercicio número 12 de iniciación a la programación
#Autor: Alberto García
print("Inserta el primer número a sumar (par y menor de 50):")
num1 = int(input())
print("Inserta el segundo número a sumar (par y entre 100 y 500):")
num2 = int(input())
if (num1<=50) and (num2>=100) and (num2<=500) and ((num1%2) is 0) and ((num2%2) is 0): print(num1+num2)
else: print("Error")