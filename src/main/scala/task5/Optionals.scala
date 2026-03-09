package task5

// overall module
object Optionals:

  // type "public" definition, exposing structure
  enum OptionalInt:
    case Just(value: Int)
    case Empty()

  // operations (/algorithms)
  object OptionalInt:

    def isEmpty(opt: OptionalInt): Boolean = opt match
      case Empty() => true
      case _       => false

    def orElse(opt: OptionalInt, orElse: Int): Int = opt match
      case Just(a) => a
      case _       => orElse

    def mapInt(optionalInt: OptionalInt)(transform: Int => Int):OptionalInt = optionalInt match
      case Just(value) => Just(transform(value))
      case _ => Empty()

    def filter(optionalInt: OptionalInt)(filter: Int => Boolean): OptionalInt = {
      def filterJust(just: OptionalInt.Just):OptionalInt = just match
        case Just(value) if filter(value) => just
        case _ => OptionalInt.Empty()
      optionalInt match
        case Just(value) => filterJust(Just(value))
        case _ => Empty()
    }

@main def tryOptionals(): Unit =
  import Optionals.* // to work with Optionals (to see OptionalInt type)
  import OptionalInt.* // to directly access algorithms

  val s1: OptionalInt = Just(1)
  val s2: OptionalInt = Empty()

  println(s1) // Some(1)
  println(isEmpty(s1)) // false
  println(orElse(s1, 0)) // 1
  println(orElse(s2, 0)) // 0
