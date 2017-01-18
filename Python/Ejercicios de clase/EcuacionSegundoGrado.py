#Ejercicio propuesto en clase: Creación de un programa que resuelva ecuaciones de segundo grado utilizando el TDD
#Autores: Alejandro Suárez y Alberto García
import math
def resolverEcuacionSegundoGrado(a, b, c):
    disc = (b**2-(4*a*c))
    if a != 0 and disc >= 0:
        x1= int((-b + math.sqrt(disc))/(2*a))
        x2= int((-b - math.sqrt(disc))/(2*a))
        return x1, x2
    else:
        return None


#caso test 1
# a=1 b=-7 c=10      x1= 5        x2= 2
a = 1
b = -7
c = 10

x1, x2 = resolverEcuacionSegundoGrado (a, b, c)

if x1 == 5 and x2 == 2:
    print("Pass caso test 1")

else:
    print("Fail caso test 1")



#Caso test 2
# a=0 b=-7 c=10   output muerte y destruccion

a = 0
b = -7
c = 10

if resolverEcuacionSegundoGrado(a, b, c) == None:
    print("Pass caso test 2")

else:
    print("Fail caso test 2")

#Caso test 3
# a=-1 b=0 c=-1

a = -7
b =  0
c = -7

if resolverEcuacionSegundoGrado(a, b, c) == None:
    print("Pass caso test 3")

else:
    print("Fail caso test 3")
