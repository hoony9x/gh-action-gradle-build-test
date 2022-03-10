package dev.hoony9x.demo

import org.assertj.core.api.BDDAssertions
import org.junit.jupiter.api.Test
import kotlin.random.Random

class SampleTest {
    @Test
    fun sample() {
        val sample = Random.nextInt().toString()
        BDDAssertions.then(sample).isEqualTo(sample)
    }
}