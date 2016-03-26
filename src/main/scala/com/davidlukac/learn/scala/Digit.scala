package com.davidlukac.learn.scala

/**
  * Created by davidlukac on 26/03/16.
  */
sealed abstract class Digit {
  def value: Int
}

case object One extends Digit {
  override val value = 1
}

case object Two extends Digit {
  override val value = 2
}
