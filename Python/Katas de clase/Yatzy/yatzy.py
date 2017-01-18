class Yatzy:

    @staticmethod
    def chance(*dice):
        score = 0
        for die in dice:
            score += die
        return score

    @staticmethod
    def yatzy(*dice):
        YATZYSCORE = 50
        if dice.count(dice[0]) == len(dice):
            return YATZYSCORE
        return 0
   
    @staticmethod
    def ones(*dice):
        ONE = 1
        score = dice.count(ONE) * ONE
        return score    

    @staticmethod
    def twos(*dice):
        TWO = 2
        score = dice.count(TWO) * TWO
        return score

    @staticmethod
    def threes(*dice):
        THREE = 3
        score = dice.count(THREE) * THREE
        return score

    def __init__(self, *dice):
        self.dice = dice
    
    def fours(self):
        FOUR = 4
        score = self.dice.count(FOUR) * FOUR
        return score
    

    def fives(self):
        FIVE = 5
        score = self.dice.count(FIVE) * FIVE
        return score

    def sixes(self):
        SIX = 6
        score = self.dice.count(SIX) * SIX
        return score

    @staticmethod
    def pair(*dice):
        for number in range(6, 0, -1):
            if dice.count(number) >= 2:
                return number * 2
        return 0
    
    @staticmethod
    def two_pair(*dice):
        score = 0
        number_of_pairs = 0
        for number in range(6, 0, -1):
            if dice.count(number) >= 2:
                score += number * 2
                number_of_pairs += 1
        if number_of_pairs >= 2:
            return score
        return 0

    @staticmethod
    def three_of_a_kind(*dice):
        score = 0
        for number in range(1, 7):
            if dice.count(number) >= 3:
                score += number * 3
                return score
        return 0

    @staticmethod
    def four_of_a_kind(*dice):
        score = 0
        for number in range(1, 7):
            if dice.count(number) >= 4:
                score += number * 4
                return score
        return 0

    @staticmethod
    def small_straight(*dice):
        straight = 0
        for number in range(1, 6):
            if dice.count(number) == 1:
                straight += 1

        if straight == 5:
            return 15
        else:
            return 0

    @staticmethod
    def large_straight(*dice):
        straight = 0
        for number in range(2, 7):
            if dice.count(number) == 1:
                straight += 1

        if straight == 5:
            return 20
        else:
            return 0

    @staticmethod
    def full_house(*dice):
        score = 0
        for number in range(1, 7):
            if dice.count(number) > 4 or dice.count(number) == 1:
                return 0
            elif dice.count(number) == 3:
                score += number * 3
            elif dice.count(number) == 2:
                score += number * 2
        return score