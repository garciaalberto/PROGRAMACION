

valoresFibonacci = {}

def fibonacci(numero):
    comprobarNumero(numero, valoresFibonacci)
    if numero <= 1:
        resultado = numero
        return resultado
    else:
        resultado = fibonacci(numero - 1) + fibonacci(numero - 2)
        sumarValor(numero, resultado)
        sumarValor(numero-1, resultado)
        sumarValor(numero-2, resultado)
        return resultado

def comprobarNumero(numero, valoresFibonacci):
    if numero in valoresFibonacci:
        resultado = valoresFibonacci[numero]
        return resultado
    if (numero -1) in valoresFibonacci and (numero -2) in valoresFibonacci:
        resultado = (valoresFibonacci[numero -1] + valoresFibonacci[numero -2])
    else:
        pass

def sumarValor(numero, resultado):
    if resultado not in valoresFibonacci:
        valoresFibonacci[numero] = resultado
    return valoresFibonacci

### Casos Test ###

# Caso Test 1
numero = 0

if fibonacci(numero) == 0:
    print("Caso Test 1 OK")
else:
    print("Caso Test 1 FAIL")

# Caso Test 2
numero = 1

if fibonacci(numero) == 1:
    print("Caso Test 2 OK")
else:
    print("Caso Test 2 FAIL")

# Caso Test 3
numero = 2

if fibonacci(numero) == 1:
    print("Caso Test 3 OK")
else:
    print("Caso Test 3 FAIL")

# Caso Test 4
numero = 3

if fibonacci(numero) == 2:
    print("Caso Test 4 OK")
else:
    print("Caso Test 4 FAIL")

# Caso Test 5
numero = 4

if fibonacci(numero) == 3:
    print("Caso Test 5 OK")
else:
    print("Caso Test 5 FAIL")

# Caso Test 6
numero = 17

if fibonacci(numero) == 1597:
    print("Caso Test 6 OK")
else:
    print("Caso Test 6 FAIL")

# Caso Test 7
numero = 17

if fibonacci(numero) == 1597:
    print("Caso Test 7 OK")
else:
    print("Caso Test 7 FAIL")

# Caso Test 8
numero = 28

if fibonacci(numero) == 317811:
    print("Caso Test 8 OK")
else:
    print("Caso Test 8 FAIL")