
/**
 * Find the number of elements of a list
 */

val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

/**
 * Finds the number of elements of a list.
 *
 * @param xs a collection
 * @tparam T collection type
 * @return collection length
 */
def length[T](xs: List[T]) = xs.length


// Test

assert(length(list) == 10)

