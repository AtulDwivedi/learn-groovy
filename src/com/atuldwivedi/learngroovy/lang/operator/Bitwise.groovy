package com.atuldwivedi.learngroovy.lang.operator

/**
 * Bitwise operators
 * 
 * Bitwise operators can be applied on a byte or an int and return an int
 * 
 * &: bitwise "and"
 * |: bitwise "or"
 * ^: bitwise "xor" (exclusive "or")
 * ~: bitwise negation
 */
int a = 0b00101010
assert a==42
int b = 0b00001000
assert b==8
assert (a & a) == a //bitwise and
assert (a & b) == b //bitwise and returns common bits
assert (a | a) == a //bitwise or
assert (a | b) == a //bitwise or returns all '1' bits

int mask = 0b11111111 //setting a mask to check only the last 8 bits
assert ((a ^ a) & mask) == 0b00000000 //bitwise exclusive or on self returns 0
assert ((a ^ b) & mask) == 0b00100010 //bitwise exclusive or
assert ((~a) & mask)    == 0b11010101 //bitwise negation
