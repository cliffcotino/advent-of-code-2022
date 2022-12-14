
import org.junit.jupiter.api.Disabled
import kotlin.test.Test
import kotlin.test.assertEquals

@Disabled
class Day04Test {

    private val day = Day04()

    @Test
    fun `test1 sample`() {
        val actual = day.test1("sample")
        assertEquals(2, actual)
    }

    @Test
    fun `test2 sample`() {
        val actual = day.test2("sample")
        assertEquals(4, actual)
    }

    @Test
    fun `test1 actual`() {
        val actual = day.test1("input")
        assertEquals(500, actual)
    }

    @Test
    fun `test2 actual`() {
        val actual = day.test2("input")
        assertEquals(815, actual)
    }
}