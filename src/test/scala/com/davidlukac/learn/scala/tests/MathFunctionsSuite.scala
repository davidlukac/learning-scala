package com.davidlukac.learn.scala.tests

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import com.davidlukac.learn.scala.MathFunctions._

/**
  * Created by davidlukac on 24/03/16.
  */
@RunWith(classOf[JUnitRunner])
class MathFunctionsSuite extends FunSuite {

  test("Check if results of square roots are correct") {

    assertResult(2) {
      sqrt(4)._2
    }

    assertResult(11) {
      sqrt(121)._2
    }

    assertResult(1) {
      sqrt(1)._2
    }

    assertResult(1.414213562373095) {
      sqrt(2)._2
    }

    assertResult(2.82842712474619) {
      sqrt(8)._2
    }

  }

  test("There are 0 number containing twos between 0 and 0") {
    assertResult(0) {
      numberOfTwos(0, 0)
    }
  }

  test("There are 10 number containing twos between 20 and 30") {
    assertResult(10) {
      numberOfTwos(20, 30)
    }
  }

  test("There are 10 number containing twos between -20 and -30") {
    assertResult(10) {
      numberOfTwos(-20, -30)
    }
  }

  test("There is 1 number containing two between 2 and 0") {
    assertResult(1) {
      numberOfTwos(2, 0)
    }
  }

  test("There is 1 number containing two between 22 and 22") {
    assertResult(1) {
      numberOfTwos(22, 22)
    }
  }

  test("There is 1 number containing two between -222 and -222") {
    assertResult(1) {
      numberOfTwos(-222, -222)
    }
  }

  test("There are 2 number containing two between -2222 and -2223") {
    assertResult(2) {
      numberOfTwos(-2222, -2223)
    }
  }

  test("There are 2 number containing two between -222 and -223") {
    assertResult(2) {
      numberOfTwos(-222, -223)
    }
  }

}
