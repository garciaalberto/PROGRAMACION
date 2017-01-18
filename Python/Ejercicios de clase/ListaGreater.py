# Define a procedure, greatest,
# that takes as input a list
# of positive numbers, and
# returns the greatest number
# in that list. If the input
# list is empty, the output
# should be 0.
# Alberto García

def greatest(lista):
    contador = 0
    for numero in lista:
        if contador < numero:
            contador = numero
    return contador

print(greatest([4,23,1]))
#>>> 23
print(greatest([]))
#>>> 0