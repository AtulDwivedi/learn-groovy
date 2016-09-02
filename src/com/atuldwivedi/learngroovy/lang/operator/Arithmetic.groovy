package com.atuldwivedi.learngroovy.lang.operator

/**
 * Arithmetic operators
 * 1. Binary arithmetic
 * 2. Unary arithmetic
 * 3. Assignment arithmetic
 */

/**
 * 1. Binary arithmetic operators
 */
assert 1 + 2 == 3 //addition
assert 4 - 3 == 1 //subtraction
assert 3 * 5 == 15 //multiplication
assert 3 / 2 == 1.5 //division
assert 10 % 3 == 1 //remainder
assert 2 ** 3 == 8 //power

/**
 *  Unary operators
 */
assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

/**
 *  2. Unary arithmetics operators
 *  
 *  ++(increment) and --(decrement) are available for both 
 *  prefix(eg. ++var or --var) and 
 *  postfix(eg. var++ or var--) notations
 */

//postfix increment notation
def a = 2
def b = a++ * 3 //use current value of a(i.e. 2) in expression and then increment it by 1(i.e. 3)
assert a == 3 && b == 6

//postfix decrement notation
def c = 3
def d = c-- * 2 //use current value of c(i.e. 3) in expression and then decrement it by 1(i.e. 2)
assert c == 2 && d == 6

//prefix increment notation
def e = 1
def f = ++e + 3 //increment and use the value of e(i.e. 2)
assert e == 2 && f == 5

//prefix decrement notation
def g = 4
def h = --g + 1 //decrement and use the value if g(i.e. 3)
assert g == 3 && h == 4

/**
 * 3. Assignment arithmetic operators
 */
def i = 4
i += 3 //i = i + 3
assert i == 7

def j = 5
j -= 3 //j = j - 3
assert j == 2

def k = 5
k *= 3 //k = k * 3
assert k == 15

def l = 10
l /= 2 //l = l / 2
assert l == 5

def m = 10
m %= 3 //m = m % s
assert m == 1

def n = 3
n **= 2 //n = n ** 2
assert n == 9
