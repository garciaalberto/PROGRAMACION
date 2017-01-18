from clases import *

if __name__ == '__main__':

    item = NormalItem("Elixir of the Mongoose", 5, 7)
    print(item)
    for dia in range(1, 10):
        item.update_quality()
        print(item)

    itemInterfaz = Interfaz()
itemInterfaz.update_quality()