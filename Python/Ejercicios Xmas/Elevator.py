def elevator(numero, exponente):
    assert isinstance (numero, int)
    assert isinstance (numero, int)
    if exponente == 0:
        return 1
    elif exponente == 1:
        return numero
    else:
        return numero * elevator(numero, exponente -1)


### CASOS TEST ###


# Caso test 1 #

numero = 2
exponente = 0

for contador in range(1, 10):
    print(elevator(numero, exponente))
    exponente = exponente + 1

# Esto deberia imprimir las 8 primeras potencias de 2 (empezando por el 0)

# Caso test 2 #

numero = "a"
exponente = "b"

try:
    elevator(numero, exponente)
except AssertionError:
    print("Caso test 2 OK")
else:
    print("Caso test 2 FAIL")