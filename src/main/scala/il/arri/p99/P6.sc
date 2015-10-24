import scala.collection.immutable.List

/**
 * Find out whether a list is a palindrome
 */

val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

/**
 * Finds out whether a list is a palindrome.
 *
 * @param xs a list
 * @tparam T list type
 * @return
 */
def isPalindrome[T](xs: List[T]): Boolean =
  xs match {
    case x :: tail
      if x == tail.last => isPalindrome(tail.init)
    case Nil => true
    case _ => false
  }


// Test Cases

assert(isPalindrome(1 :: 2 :: 2 :: 1 :: Nil))
assert(isPalindrome(Nil))

assert(!isPalindrome(1 :: 2 :: 3 :: 4 :: Nil))
assert(!isPalindrome(1 :: 2 :: 3 :: Nil))
assert(!isPalindrome(null))
