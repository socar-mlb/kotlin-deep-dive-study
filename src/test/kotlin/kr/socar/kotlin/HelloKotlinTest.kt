package kr.socar.kotlin

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertEquals

class HelloKotlinTest {

    @Test
    fun mainTest() {
        assertEquals("Hello Kotlin", HelloKotlin().helloKotlin())
        assertThat("Hello Kotlin").isEqualTo(HelloKotlin().helloKotlin())
    }
}
