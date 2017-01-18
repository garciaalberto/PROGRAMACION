# Programa que devolvera un valor True si el string insertado (palabra) es un palindromo
# y devolvera False en caso contrario

def esPalindromo(palabra):
    assert isinstance (palabra, str), "Introduce una palabra valida"
    assert len(palabra) > 1, "Un palindromo debe constar de mas de una letra"
    longitud = len(palabra) - 1
    contador = 0
    while longitud >= contador:
        if palabra[contador] == palabra[longitud]:
            longitud = longitud - 1
            contador = contador + 1
        else:
            return False
    return True

###Casos Test###

# Caso Test 1
palabra = "oso"

if esPalindromo(palabra) == True:
    print("Caso TEST 1 ok")
else:
    print("Caso TEST 1 fail")

# Caso Test 2
palabra = "abc"

if esPalindromo(palabra) == False:
    print("Caso TEST 2 ok")
else:
    print("Caso TEST 2 fail")

# Caso Test 3

palabra = "arenera"

if esPalindromo(palabra) == True:
    print("Caso TEST 3 ok")
else:
    print("Caso TEST 3 fail")

# Caso Test 4

palabra = "caballo"

if esPalindromo(palabra) == False:
    print("Caso TEST 4 ok")
else:
    print("Caso TEST 4 fail")

# Caso Test 5

palabra = "sobreverbos"

if esPalindromo(palabra) == True:
    print("Caso TEST 5 ok")
else:
    print("Caso TEST 5 fail")

# Caso Test 6

palabra = "palindromo"

if esPalindromo(palabra) == False:
    print("Caso TEST 6 ok")
else:
    print("Caso TEST 6 fail")

# Caso Test 7

palabra = 32

try:
    esPalindromo(palabra)
except AssertionError:
    print("Caso TEST 7 ok")
else:
    print("Caso TEST 7 fail")

# Caso Test 8

palabra = ""

try:
    esPalindromo(palabra)
except AssertionError:
    print("Caso TEST 8 ok")
else:
    print("Caso TEST 8 fail")

# Caso Test 9

palabra = "o"

try:
    esPalindromo(palabra)
except AssertionError:
    print("Caso TEST 9 ok")
else:
    print("Caso TEST 9 fail")

# Caso Test 10

palabra = "abba"

if esPalindromo(palabra) == True:
    print("Caso TEST 10 ok")
else:
    print("Caso TEST 10 fail")