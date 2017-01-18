#Ejercicio número 1 de iniciación a la programación (Resuelto con TDD)
#Autor: Alberto García
def ejercicio1 (num):
    numPotenciaDos = num*num
    numPotenciaTres = num*num*num
    return num, numPotenciaDos, numPotenciaTres

#Caso test 1
#num = 2        output = 2   4   8
num = 2
num, numPotenciaDos, numPotenciaTres = ejercicio1(num)

if (num == 2) and (numPotenciaDos == 4) and (numPotenciaTres == 8):
    print("PASS Caso test 1")
    
else:
    print("FAIL Caso test 1")