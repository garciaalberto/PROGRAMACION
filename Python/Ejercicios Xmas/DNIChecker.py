def checkLongitud(dni):
    if len(dni) == 9:
        return True
    else:
        return False

def checkNumeros(dni):
    if dni[0:8].isdigit():
        return True
    else:
        return False

def checkLetraNIF(dni):
    residuo = int(dni[0:8]) % 23
    letraNIF = letras[residuo+1]
    if dni[8].isupper() and dni[8] == letraNIF:
        return True
    else:
        return False

def checkDNI(dni):
    return checkLongitud(dni) and checkNumeros(dni) and checkLetraNIF(dni)


letras = {1:"T", 2:"R", 3:"W", 4:"A", 5:"G", 6:"M", 7:"Y", 8:"F", 9:"P", 10:"D", 11:"X", 12:"B", 13:"N", 14:"J", 15:"Z", 16:"S", 17:"Q", 18:"V", 19:"H", 20:"L", 21:"C", 22:"K", 23:"E"}
'''

### CASOS TEST ###

# Caso test 1 #

dni = "41585112P"

if checkDNI(dni) == True:
    print("Caso test 1 OK")
else:
    print("Caso test 1 FAIL")


# Caso test 2 #

dni = "4158511P"

if checkDNI(dni) == False:
    print("Caso test 2 OK")
else:
    print("Caso test 2 FAIL")


# Caso test 3 #

dni = "99999999A"

if checkDNI(dni) == False:
    print("Caso test 3 OK")
else:
    print("Caso test 3 FAIL")


# Caso test 4 #

dni = "AAAAAAAAA"

if checkDNI(dni) == False:
    print("Caso test 4 OK")
else:
    print("Caso test 4 FAIL")

# Caso test 5 #

dni = "41585112p"

if checkDNI(dni) == False:
    print("Caso test 5 OK")
else:
    print("Caso test 5 FAIL")
'''