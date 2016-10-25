package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    //(r)=(r-1)+(r-1)
    //(c)=(c)  +(c-1)
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceIter(leftCount: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) leftCount == 0
      else if (leftCount < 0) false
      else if (chars.head == '(') balanceIter(leftCount + 1, chars.tail)
      else if (chars.head == ')') balanceIter(leftCount - 1, chars.tail)
      else balanceIter(leftCount, chars.tail)
    }
    balanceIter(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money <= 0) 0
    else if (coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
