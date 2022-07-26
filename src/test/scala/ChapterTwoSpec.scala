import org.scalatest.flatspec.AnyFlatSpec

class ChapterTwoSpec extends AnyFlatSpec {

  def fib(n: Int): Int = {
    def go(n: Int, a: Int, b: Int): Int =
      if (n <= 0) a else go(n - 1, b, a + b)

    go(n, 0, 1)
  }

  "The eight Fibonacci number" should "be 21" in {
    assert(fib(8) == 21)
  }

}