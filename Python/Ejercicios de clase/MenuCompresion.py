# Autores: Jonathan Garcia y Alberto Garcia 

import xml.etree.ElementTree as ET
tree = ET.parse('platos.xml')
root = tree.getroot()

def imprimirNombrePrecio(root):
    for food in root:
        nombrePlato = food.find("name").text
        precioPlato = food.find("price").text
        print("Nombre: " + nombrePlato + " // Precio: " + precioPlato)

def insertarDictNombrePrecio(root):
    listaPlatosPrecio = {food.find("name").text : food.find("price").text for food in root}
    return listaPlatosPrecio

### CASOS TEST###

# Caso Test 1

imprimirNombrePrecio(root) #Deberia mostrar en pantalla el nombre y el precio del menu

# Caso Test 2

print(insertarDictNombrePrecio(root)) #Deberia mostrar en pantalla el diccionario creado en la funcion