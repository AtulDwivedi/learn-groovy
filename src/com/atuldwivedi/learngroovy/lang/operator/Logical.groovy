package com.atuldwivedi.learngroovy.lang.operator

/**
 * Logical operators(!, &&, ||)
 * 1. Precedence
 * 2. Short-circuiting
 */
assert !false //logical not
assert true && true //logical and
assert true || false //logical or

/**
 * 1. Precedence
 * 1.1 The logical "not" has a higher priority than the logical "and"
 * 1.2 The logical "and" has a higher priority than the logical "or"
 * 
 * ! > && > ||
 */
assert (!false && false) == false
assert true || true && false

/**
 * 2. Short-circuiting
 * @return called: true always
 */
boolean checkIfCalled() {
	called = true
}

/**
 * The logical || operator supports short-circuiting: if the left operand is true, 
 * it knows that the result will be true in any case,
 * so it won’t evaluate the right operand. 
 * 
 * The right operand will be evaluated only if the left operand is false.
 */
called = false
true || checkIfCalled()
assert !called

called = false
false || checkIfCalled()
assert called

/**
 * Likewise for the logical && operator: if the left operand is false, 
 * it knows that the result will be false in any case, 
 * so it won’t evaluate the right operand. 
 * 
 * The right operand will be evaluated only if the left operand is true.
 */
called = false
false && checkIfCalled()
assert !called

called = false
true && checkIfCalled()
assert called