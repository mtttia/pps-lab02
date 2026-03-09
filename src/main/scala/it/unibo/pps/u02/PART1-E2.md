# REPLIT 
### importing and using Currying
import Currying in sbt console with
```scala
import it.unibo.pps.u02.Currying
```
test of mult and curriedMult
```scala
scala> Currying.curriedMult(3)(4)
val res1: Double = 12.0

scala> Currying.mult(3,4)
val res2: Double = 12.0
```
Using CarriedMult for obtain a lambda that can be used to multiply every number for a decided number (in our case 3)
```scala
scala> val multiplyBy3 = Currying.curriedMult(3)
val multiplyBy3: Double => Double = Lambda/0x00000070023ff978@68b5a9db

scala> multiplyBy3(4)
val res3: Double = 12.0
```

### Defining divide and curriedDivide
Implementing functions divide and curriedDivide as mult and curriedMult
```shell
scala> def divide(x:Double, y:Double):Double = x/y
def divide(x: Double, y: Double): Double
                                                                                                                                                                                
scala> divide(10,2)
val res4: Double = 5.0
                                                                                                                                                                                
scala> def curriedDivide(x:Double)(y:Double):Double = x/y
def curriedDivide(x: Double)(y: Double): Double
                                                                                                                                                                                
scala> curriedDivide(10)(2)
val res5: Double = 5.0
```