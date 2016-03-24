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

}
