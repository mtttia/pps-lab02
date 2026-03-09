package task5

import it.unibo.pps.u02.Part3.power
import org.junit.Test
import org.junit.Assert.assertEquals

class Part3Test {
  @Test def testPower(): Unit = {
    val base: Double = 2
    val exp: Int = 3
    val result: Double = 8
    val delta: Double = 0.001
    assertEquals(result, power(base,exp), delta)
  }
}
