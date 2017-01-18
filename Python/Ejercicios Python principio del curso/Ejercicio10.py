#Ejercicio número 10 de iniciación a la programación
#Autor: Alberto García
print("Inserte el primer número a sumar")
num1 = int(input())
print("Inserte el segundo número a sumar")
num2 = int(input())
if (num1>=0) and (num2>=0): print(num1+num2)
elif (num1<0) and (num2<0): print ("No se calcula la suma porque los dos números son negativos")
elif (num1<0): print("No se calcula la suma porque el primer número es negativo")
elif (num2<0): print("No se calcula la suma porque el segundo número es negativo")