package com.farrellw.hwe.exercises

import org.scalatest.FunSpec

class RomanNumeralTests extends FunSpec {
  describe("[Option Practice] Converts roman numerals to integers"){
    it("Converts a single roman numeral to int"){
      val input = "X"
      val expected = Some(10)
      val actual = RomanNumeral.convertRomanToInt(input)

      assert(actual === expected)
    }

    it("Returns None if the roman numeral is invalid"){
      val input = "R"
      val expected = None
      val actual = RomanNumeral.convertRomanToInt(input)

      assert(actual === expected)
    }

    it("Converts a multi-letter roman numeral to a numeral"){
      val input = "CXX"
      val expected = Some(120)
      val actual = RomanNumeral.convertRomanToInt(input)

      assert(actual === expected)
    }

    it("Returns None if the roman numeral is invalid"){
      val input = "AXV"
      val expected = None
      val actual = RomanNumeral.convertRomanToInt(input)

      assert(actual === expected)
    }
  }

  describe("[Either Practice] Converts a roman numeral to an integer"){
    it("Returns a Right[Int] when a valid roman numeral is passed in"){
      val input = "XV"
      val expected = Right(15)
      val actual = RomanNumeral.convertRomanToIntEither(input)

      assert(actual.isRight)
      assert(actual === expected)

    }

    it("Returns a Left[Exception] when an invalid roman numeral is passed in"){
      val input = "CXA"
      val actual = RomanNumeral.convertRomanToIntEither(input)

      assert(actual.isLeft)
    }
  }

  /*
    Given a complete roman numeral ( e.g. CCX ), returns the numerical equivalent ( e.g. 210 ).
    If the roman numeral contains any invalid roman numerals, return an exception
   */
  def convertRomanToIntLeftRight(s: String): Either[Exception, Int] = ???

  /*
    Given a number, return the roman numeral equivalent
   */
  def convertIntToRoman(i: Int): Option[String] = ???

}