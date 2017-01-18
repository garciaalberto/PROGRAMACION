#Ejercicio número 14 de iniciación a la programación
#Autor: Alberto García con ayuda de Miguel Ángel Valero
#Necesita refactorización URGENTE
#Comprobar en el ejercicio si los billetes de 500 estaban permitidos
#Cambiar nombres variables?
print("Introduce una cantidad (en euros):")
money = int(input())
quinientos = 0
doscientos = 0
cien = 0
cincuenta = 0
veinte = 0
diez = 0
cinco = 0
dos = 0
uno = 0
while (money > 0):
    while(money >= 500):
        quinientos = quinientos + 1
        money = money - 500
    while(money >= 200):
        doscientos = doscientos + 1
        money = money - 200
    while(money >= 100):
        cien = cien + 1
        money = money - 100
    while(money >= 50):
        cincuenta = cincuenta + 1
        money = money - 50
    while(money >= 20):
        veinte = veinte + 1
        money = money - 20
    while(money >= 10):
        diez = diez + 1
        money = money - 10
    while(money >= 5):
        cinco = cinco + 1
        money = money - 5
    while(money >= 2):
        dos = dos + 1
        money = money - 2
    while(money >= 1):
        uno = uno + 1
        money = money - 1
if(quinientos > 0):
    print("Billetes de 500: " + str(quinientos))
if(doscientos > 0):
    print("Billetes de 200: " + str(doscientos))
if(cien > 0):
    print("Billetes de 100: " + str(cien))
if(cincuenta > 0):
    print("Billetes de 50: " + str(cincuenta))
if(veinte > 0):
    print("Billetes de 20: " + str(veinte))
if(diez > 0):
    print("Billetes de 10: " + str(diez))
if(cinco > 0):
    print("Billetes de 5: " + str(cinco))
if(dos > 0):
    print("Monedas de 2: " + str(dos))
if(uno > 0):
    print("Monedas de 1: " + str(uno))