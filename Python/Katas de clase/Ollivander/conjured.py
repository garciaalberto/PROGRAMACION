from clases import *
class Conjured(NormalItem):

    def __init__(self, name, sell_in, quality):
        Item.__init__(self, name, sell_in, quality)

    def setQuality(self, valor):

        NormalItem.setQuality(self, valor)

    def update_quality(self):
        self.sell_in = self.sell_in - 1
        if self.sell_in >= 0:
            self.setQuality(-2)
        elif self.sell_in < 0:
            self.setQuality(-4)