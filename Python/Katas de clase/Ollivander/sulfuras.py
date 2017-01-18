from clases import *

class Sulfuras(NormalItem):

    def __init__(self, name, sell_in, quality):
        NormalItem.__init__(self, name, sell_in, quality)

    def update_quality(self):
            self.quality = 80
            self.sellIn = 0