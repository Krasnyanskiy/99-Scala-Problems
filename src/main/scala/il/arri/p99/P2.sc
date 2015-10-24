
/**
 * Find the last but one element of a list
 */

val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

/**
 * Finds a penultimate element in the given collection.
 *
 * @param xs collection
 * @tparam T element type
 * @return penultimate element
 */
def penultimate[T](xs: List[T]): T = xs match {
  case x :: y :: Nil => x
  case x :: y :: tail => penultimate(tail)
  case _ => throw new NoSuchElementException
}


// Test

assert(penultimate(list) == 9)
assert(penultimate(1 :: 2 :: Nil) == 1)













