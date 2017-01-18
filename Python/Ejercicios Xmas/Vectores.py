vector = []

def crearVector(*valores):
    for valor in valores:
        vector.append(int(valor))
    return vector

def encontrarNumero(seleccion):
    crearVector(*valores)
    if seleccion in vector:
        posicion = vector.index(seleccion) + 1 # He puesto el +1 para que la posicion que de se empieze desde el 1, ya que el usuario final de este programa podria no entender que los arrays se empiezan a contar desde el 0 y no el 1
        print("Valor encontrado en la posicion " + str(posicion))
    else:
        print("Valor no encontrado en el vector")

def encontrarMenor():
    crearVector(*valores)
    menor = min(vector)
    posicionMenor = vector.index(menor) + 1
    print("El menor valor es " + str(menor) + " que ocupa la posicion " + str(posicionMenor))

def encontrarMayor():
    crearVector(*valores)
    mayor = max(vector)
    posicionMayor = vector.index(mayor) + 1
    print("El mayor valor es " + str(mayor) + " que ocupa la posicion " + str(posicionMayor))

def vectores():
    crearVector(*valores)
    encontrarNumero(seleccion)
    encontrarMenor()
    encontrarMayor()

# Caso Test # 

valores = (5, 4, 3, 2, 1)
seleccion = 4

vectores()

#Esto dara como output que ha encontrado el numero 4 en la posicion 2
#Que el menor numero es 1 y esta en la posicion 5
#Y el mayor es el 5 que esta en la posicion 1