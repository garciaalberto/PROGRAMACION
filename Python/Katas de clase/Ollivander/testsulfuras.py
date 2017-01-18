from clases import *
from sulfuras import *

if __name__ == '__main__':

    item = Sulfuras("Sulfuras, hand of Ragnaros", 0, 80)
    print(item)
    for dia in range(1, 10):
        item.update_quality()
        print(item)

    itemInterfaz = Interfaz()
itemInterfaz.update_quality()