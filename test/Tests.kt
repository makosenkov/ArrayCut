import org.junit.Assert.assertEquals
import org.junit.Test


class Tests {
    @Test
    fun find() {
        assertEquals(listOf(30), find(listOf(30, -5, -20, 1, 2, 3)))
        assertEquals(listOf(-2), find(listOf(-5, -2, -3, -50, -25, -4)))
        assertEquals(listOf(30, -5, 1, 2, 3, 4, 5, 5, 7), find(listOf(30, -5, 1, 2, 3, 4, 5, 5, 7)))
        assertEquals(listOf(39, 84, 92, 12), find(listOf(1, 4, 24, 54, -100, 39, 84, 92, 12)))
        assertEquals(listOf(76, 98, 56, 1, 2, -3, 2, 43, 91),
                find(listOf(8, -90, 76, 98, 56, 1, 2, -3, 2, 43, 91, -234, 23, 134, 22, 33, -123, 90)))
        assertEquals(listOf(-5), find(listOf(-5)))
        assertEquals(listOf(0), find(listOf(-5, 0)))

    }
}