from clases import *

class AgedBrie(NormalItem):

    def __init__(self, name, sell_in, quality):
        NormalItem.__init__(self, name, sell_in, quality)

    def update_quality(self):
        if (self.quality < 50 and self.sell_in > 0):
            self.quality = self.quality + 1
        elif (self.quality < 50 and self.sell_in <= 0):
            self.quality = self.quality + 2
        else:
            self.quality = 50

        self.sell_in = self.sell_in - 1