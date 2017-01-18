def crearTablero():
    negro = "1"
    blanco = "0"
    tablero = []
    counter = 1
    for i in range (1, 9):
        for i in range (1, 9):
            if counter % 2 == 0:
                tablero.append(negro)
                counter = counter + 1
            else:
                tablero.append(blanco)
                counter = counter + 1
        print(tablero)
        tablero = []
        counter = counter + 1

crearTablero()