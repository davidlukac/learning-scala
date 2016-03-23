package com.davidlukac.learn.scala

/**
  * Created by davidlukac on 22/03/16.
  */
object LogicalFunctions {

  /**
    * Definition of logical `AND` and `OR` functions leveraging Call-by-name in the second argument.
    * @param x
    *          Argument 1.
    * @param y
    *          Argument 2.
    * @return
    *         True or false.
    */
  def and(x: Boolean, y: => Boolean) = if (x) y else false
  def or(x: Boolean, y: => Boolean) = if (x) true else y

  def main(args: Array[String]) {

    // Arbitrary definitions of `true` and `false`.
    val f = 0 > 1
    val t = 1 > 0

    println(s"Eval: ($f && $f) = ${this.and(f, f)}.")
    println(s"Eval: ($t && $f) = ${this.and(t, f)}.")
    println(s"Eval: ($f && $t) = ${this.and(f, t)}.")
    println(s"Eval: ($t && $t) = ${this.and(t, t)}.")
    println()
    println(s"Eval: ($f && $f) = ${this.or(f, f)}.")
    println(s"Eval: ($t && $f) = ${this.or(t, f)}.")
    println(s"Eval: ($f && $t) = ${this.or(f, t)}.")
    println(s"Eval: ($t && $t) = ${this.or(t, t)}.")
  }

}
