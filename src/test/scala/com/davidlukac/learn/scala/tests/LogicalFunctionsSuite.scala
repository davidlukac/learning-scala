package com.davidlukac.learn.scala.tests

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.davidlukac.learn.scala.LogicalFunctions._

/**
  * Created by davidlukac on 23/03/16.
  */
@RunWith(classOf[JUnitRunner])
class LogicalFunctionsSuite extends FunSuite {

  def TRUE = 1 > 0
  def FALSE = 0 > 1
  def loop: Boolean = fail("An infinite loop was called!")

  // AND tests.

  test("FALSE && 'e' should be always FALSE") {
    assertResult(false) {
      and(FALSE, FALSE)
    }

    assertResult(false) {
      and(FALSE, TRUE)
    }

    assertResult(false) {
      and(FALSE, loop)
    }
  }

  test("TRUE && 'e' yields 'e'") {
    var e = true
    assert(and(TRUE, e) == e)
    e = false
    assert(and(TRUE, e) == e)
    e = 1 > 0
    assert(and(TRUE, e) == e)
    e = 0 > 1
    assert(and(TRUE, e) == e)
  }

  test("TRUE && TRUE yields TRUE") {
    assertResult(true) {
      and(TRUE, TRUE)
    }
  }

  // OR tests.

  test("TRUE || 'e' should be always TRUE") {
    assertResult(true) {
      or(TRUE, FALSE)
    }

    assertResult(true) {
      or(TRUE, TRUE)
    }

    assertResult(true) {
      or(TRUE, loop)
    }
  }

  test("FALSE || 'e' yields 'e'") {
    var e = true
    assert(or(FALSE, e) == e)
    e = false
    assert(or(FALSE, e) == e)
    e = 1 > 0
    assert(or(FALSE, e) == e)
    e = 0 > 1
    assert(or(FALSE, e) == e)
  }

  test("TRUE || TRUE always yields TRUE") {
    assertResult(true) {
      or(TRUE, TRUE)
    }
  }

}
