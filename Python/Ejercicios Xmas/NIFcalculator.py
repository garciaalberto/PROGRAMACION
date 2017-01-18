def calcularNIF(dni):
    assert isinstance (dni, int), "Error: Uno (o mas) de los valores introducidos no es un numero"
    assert len(str(dni)) == 8, "Error: Necesitas un numero exacto de 8 numeros para poder calcular el NIF"
    letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    residuo = dni % 23
    letraNIF = letras[residuo]
    assert len(letraNIF) == 1, "Error inesperado: La longitud de la letra NIF supera 1"
    assert isinstance (letraNIF, str), "Error inesperado: el NIF no es una letra"
    return letraNIF

### CASOS TEST ###

# Caso test 1 #

dni = 41585112

if calcularNIF(dni) == "P":
    print("Caso test 1 OK")

else:
    print("Caso test 1 FAIL")

# Caso test 2 #

dni = "assasasa"

try:
    calcularNIF(dni)
except AssertionError:
    print("Caso test 2 OK")
else:
    print("Caso test 2 FAIL")

# Caso test 3 #

dni = 4158511

try:
    calcularNIF(dni)
except AssertionError:
    print("Caso test 3 OK")
else:
    print("Caso test 3 FAIL")