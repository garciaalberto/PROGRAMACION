
def accesoCasosTexttest(matrizCasosTest, rutaAccesoFichero):

    fichero = open(rutaAccesoFichero, 'r')

    matrizCasosTest = []

    for linea in fichero:
        if linea.find("day") != -1:
            casosTestDia = []
        elif linea == "\n":
            matrizCasosTest.append(casosTestDia)
        elif linea.find("sellIn") != -1:
            pass
        else:
            item = linea.rsplit(',', 2)
            item[2] = item[2][1:-1]
            item[1] = item[1][1:]
            casosTestDia.append(item)

    return matrizCasosTest


if __name__ == "__main__":

    rutaAccesoFichero = "inventario_ollivander.gr"

    matrizCasosTest = []

    matrizCasosTest = accesoCasosTexttest(matrizCasosTest, rutaAccesoFichero)

    for (offset, casosTestDia) in enumerate(matrizCasosTest):
        print('-' * 5 + " Dia %d: " % offset + '-' * 5)
        for item in casosTestDia:
            print(item)

    stdout = open("casos_test.txt", 'w')
    for (offset, casosTestDia) in enumerate(matrizCasosTest):
        stdout.write('-' * 5 + " Dia %d: " % offset + '-' * 5 + '\n')
        for item in casosTestDia:

            stdout.write(','.join(item) + '\n')