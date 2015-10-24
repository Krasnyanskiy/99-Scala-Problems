
/**
 * Find the Kth element of a list
 */

val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

/**
 * Finds the Kth element of a list.
 *
 * @param n Kth element index
 * @param xs given collection
 * @tparam T collection type
 * @return Kth element
 */
def nth[T](n: Int, xs: List[T]) =
  if (xs.length > n && n >= 0) xs(n)
  else throw new NoSuchElementException(s"Wrong index of element [$n]")


// Test

assert(nth(3, list) == 4)