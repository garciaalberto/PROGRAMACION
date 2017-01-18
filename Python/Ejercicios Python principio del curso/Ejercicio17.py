#Ejercicio número 17 de iniciación a la programación
#Autor: Alberto García
#No funciona, error fila 20
#Bastante mal planteado
print("Inserte el primer número: ")
numeroA = int(input())
print("Inserte el segundo número: ")
numeroB = int(input())
swap = numeroB
if(numeroB>numeroA):
	numeroB = numeroA
	numeroA = swap
else: pass
contPar = 0
contImpar = 0
while (numeroA<=numeroB):
	if (numeroA%2==0):
		contPar = contPar + numeroA
		numeroA = numeroA + 1
	else: 
	contImpar = contImpar + numeroA
	numeroA = numeroA + 1
print(str(contPar))
print(str(contImpar))