import pytest
from yatzy import Yatzy

@pytest.fixture
def inyector():
    tirada = Yatzy(1, 2, 3, 4, 5)
    return tirada

def test_ones():
    assert 0 == Yatzy.ones(3, 3, 3, 4, 5)

def test_twos():
    assert 4 == Yatzy.twos(2, 3, 2, 5, 1)

def test_threes():
    assert 3 == Yatzy.threes(2, 3, 2, 5, 1)

def test_fours(inyector):
    valorEsperado = 4
    assert valorEsperado == inyector.fours()

def test_fives(inyector):
    valorEsperado = 5
    assert valorEsperado == inyector.fives()

def test_sixes(inyector):
    valorEsperado = 0
    assert valorEsperado == inyector.sixes()

def test_pair():
    assert 8 == Yatzy.pair(3, 3, 3, 4, 4)
    assert 12 == Yatzy.pair(1, 1, 6, 2, 6)
    assert 6 == Yatzy.pair(3, 3, 3, 4, 1)
    assert 6 == Yatzy.pair(3, 3, 3, 3, 1)

def test_two_pair():
    assert 8 == Yatzy.two_pair(1, 1, 2, 3, 3)
    assert 0 == Yatzy.two_pair(1, 1, 2, 3, 4)
    assert 6 == Yatzy.two_pair(1, 1, 2, 2, 2)

def test_three_of_a_kind():
    assert 9 == Yatzy.three_of_a_kind(3, 3, 3, 4, 5)
    assert 0 == Yatzy.three_of_a_kind(3, 3, 4, 5, 6)
    assert 9 == Yatzy.three_of_a_kind(3, 3, 3, 3, 1)

def test_four_of_a_kind():
    assert 8 == Yatzy.four_of_a_kind(2, 2, 2, 2, 5)
    assert 0 == Yatzy.four_of_a_kind(2, 2, 2, 5, 5)
    assert 8 == Yatzy.four_of_a_kind(2, 2, 2, 2, 2)

def test_small_straight():
    assert 15 == Yatzy.small_straight(2, 1, 3, 5, 4)
    assert 0 == Yatzy.small_straight(2, 4, 3, 5, 6)

def test_large_straight():
    assert 20 == Yatzy.large_straight(2, 6, 3, 5, 4)
    assert 0 == Yatzy.large_straight(2, 4, 3, 5, 1)

def test_full_house():
    assert 8 == Yatzy.full_house(1, 1, 2, 2, 2)
    assert 0 == Yatzy.full_house(2, 2, 3, 3, 4)
    assert 0 == Yatzy.full_house(4, 4, 4, 4, 4)

def test_yatzy():
    assert 50 == Yatzy.yatzy(2, 2, 2, 2, 2)
    assert 0 == Yatzy.yatzy(1, 2, 1, 1, 1)

def test_chance():
    assert 30 == Yatzy.chance(6, 6, 6, 6, 6)
    assert 5 == Yatzy.chance(1, 1, 1, 1, 1)