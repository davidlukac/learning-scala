package com.davidlukac.learn.scala

import org.scalautils.Tolerance._
import org.scalautils.TripleEquals._

import scala.annotation.tailrec

/**
  * Created by davidlukac on 24/03/16.
  */
object MathFunctions {

  /**
    * Calculates square root of given number with accuracy to 15 digits and in max. 100k iterations.
    *
    * @param d
    *          Double to calculate square root for.
    * @return
    *         Tuple including the original number, it's root and number of iterations.
    */
  def sqrt(d: Double): (Double, Double, Int) = {

    /**
      * Checks square for given root. Accuracy is .000000000000001.
      *
      * @param o
      *         Original lumber.
      * @param r
      *         Guessed root.
      * @return
      *         True if r * r = o, else false.
      */
    def _checkSqr(o: Double, r: Double): Boolean = if ((r * r) === o +- .000000000000001) true else false
    def _quot(o: Double, a: Double): Double = o / a
    def _avrg(a: Double, b: Double): Double = (a + b) / 2

    /**
      * Internal SQRT function that keeps the original value.
      *
      * @param o
      *          Original number-requested for sqrt.
      * @param g
      *          Guessed sqrt.
      */
    @tailrec
    def _sqrt(o: Double, g: Double, q: Double, a: Double, c: Int): (Double, Int) = {
      // If we found the root, return it.
      if (_checkSqr(o, g)) {
        (g, c)
      }
      else {
        if (c > 999999) {
          println(s"... so many iterations to find square root of $o ... ending, this is close enough ...")
          return (g, c)
        }
        val _q = _quot(o, g)
        val _a = _avrg(a, _q)
        _sqrt(o, _a, _q, _a, c + 1)
      }
    }
    // Initial ("previous") average is the original number.
    // Initial ("previous") quotation is the original number as well.
    val res = _sqrt(d, 1, 1, 1, 1)
    new Tuple3[Double, Double, Int](d, res._1, res._2)
  }

  def niceSqrtPrint(res: (Double, Double, Int)) = {
    println(s"The root of ${res._1} is ${res._2} and was found in ${res._3} iterations.")
  }

  def main(args: Array[String]) {
    println(s"Running ${MathFunctions.getClass.getName}")

    val numbers: List[Double] = List(
      0.1, 0.008, 1.0, 2.0, 4.0, 7.0, 8.0, 16.0, 121.0, 961.0, 4096.0, 100000000.0, 16777216.0, 281474976710656.0,
      5238457023983475287.0
    )

    for (n <- numbers) niceSqrtPrint(sqrt(n))
    println()
  }

}
