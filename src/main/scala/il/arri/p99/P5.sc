import scala.collection.immutable.{Nil, List}

/**
 * Reverse a list
 */
val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
/**
 * Reverses a list.
 *
 * @param xs a list
 * @tparam T list type
 * @return reversed list
 */
def reverse[T](xs: List[T]): List[T] = {
  xs.reverse
}
/**
 * Reverses a list recursively.
 */
def reverseRecursive[T](xs: List[T]): List[T] = xs match {
  case x :: tail => reverseRecursive(tail) :+ x
  case Nil => Nil
}
// Test
assert(reverse(1 :: 2 :: 3 :: Nil) == 3 :: 2 :: 1 :: Nil)
// Test (recursive)
assert(reverseRecursive(0 :: 0 :: 7 :: Nil) == 7 :: 0 :: 0 :: Nil)