package service

import org.example.MyService
import org.junit.jupiter.api.BeforeAll
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class MyServiceTest {

    @Test
    fun test1() {
        val testService: MyService = mock()
        whenever(testService.foo()).thenReturn(4)
        val service = MyService()

        assertEquals(4, testService.foo())
    }
}