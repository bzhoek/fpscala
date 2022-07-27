import org.scalatest.flatspec.AnyFlatSpec
import scala.annotation.tailrec

class ChapterTwoSpec extends AnyFlatSpec {

  def fib(n: Int): Int = {
    @tailrec
    def go(n: Int, a: Int, b: Int): Int =
      if (n <= 0) a else go(n - 1, b, a + b)

    go(n, 0, 1)
  }

  "The eight Fibonacci number" should "be 21" in {
    assert(fib(8) == 21)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def go(n: Int): Boolean =
      if n < as.length - 1 then
        if ordered(as(n), as(n + 1)) then go(n + 1) else false
      else true

    go(0)
  }

  "A, B, C" should "sorted" in {
    assert(isSorted(Array("A", "B", "C"), (a, b) => a < b))
  }

  "A, B, C, D" should "sorted" in {
    assert(isSorted(Array("A", "B", "C", "D"), (a, b) => a < b))
  }

  "A, C, B" should "not be sorted" in {
    assert(!isSorted(Array("A", "C", "B"), (a, b) => a < b))
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

}