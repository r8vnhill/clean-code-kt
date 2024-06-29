package cl.ravenhill.cleancode

/**
 * Returns a list of integer arrays where the first element is 4.
 *
 * ## Note
 *
 * This function does not follow the principles of clean code. In particular, it uses unclear names like `getThem`, `theList`, and `list1`,
 * which do not convey the purpose or intent of the variables and the function. It is recommended to use more descriptive names for better readability
 * and maintainability.
 *
 * ## Usage:
 * This function takes a list of integer arrays and returns a new list containing only the arrays where the first element is 4.
 *
 * ### Example 1: Filtering Arrays
 * ```
 * val arrays = listOf(intArrayOf(4, 2, 3), intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
 * val result = getThem(arrays)
 * println(result) // Output: [[I@... [I@...]
 * ```
 * ### Example 2: Empty List
 * ```
 * val arrays = emptyList<IntArray>()
 * val result = getThem(arrays)
 * println(result) // Output: []
 * ```
 * @param theList The list of integer arrays to be filtered.
 * @return A list of integer arrays where the first element is 4.
 */
fun getThem(theList: List<IntArray>): List<IntArray> {
    val list1 = mutableListOf<IntArray>()
    for (x in theList) {
        if (x[0] == 4) {
            list1.add(x)
        }
    }
    return list1
}
