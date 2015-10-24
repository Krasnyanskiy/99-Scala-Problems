
/**
 * Find the last element of a list
 */

val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

/**
 * Finds the last element of a list.
 *
 * @param xs given collection
 * @tparam T collection type
 * @return last element of the collection
 */
def last[T](xs: List[T]): T = xs.last


/**
 * Finds the last element of a list recursively.
 *
 * @param xs given collection
 * @tparam T collection type
 * @return last element of the collection
 */
def lastRecursive[T](xs: List[T]): Option[T] =
  xs match {
    case x :: Nil => Option(x)
    case x :: tail => lastRecursive(tail)
    case _ => None
  }


// Test

assert(last(list) == 8)
assert(last(list) != 100)


// Test recursive

assert(lastRecursive(list).get == 8)
assert(lastRecursive(1 :: 2 :: Nil).get == 2)