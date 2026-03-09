package task5

import it.unibo.pps.u02.Part2
import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

class Part2Test :
  @Test def testPositiveOnPositiveNumber(): Unit = {
    val positiveNumber: Int = 5
    val positiveString: String = "Positive"
    assertEquals(positiveString, Part2.positive(positiveNumber))
  }

  @Test def testPositiveOnNegativeNumber(): Unit = {
    val negativeNumber: Int = -1
    val negativeString: String = "Negative"
    assertEquals(negativeString, Part2.positive(negativeNumber))
  }

  @Test def testPositiveOnZero(): Unit = {
    val zeroNumber: Int = 0
    val positiveString: String = "Positive"
    assertEquals(positiveString, Part2.positive(zeroNumber))
  }
