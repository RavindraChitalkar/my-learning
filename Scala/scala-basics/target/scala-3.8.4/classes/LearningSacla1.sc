// Values are immutable constants
val hello : String = "Hola !"

// Variables are mutable

var helloThere: String = hello

helloThere = hello + " Ravindra"

print(helloThere)

val immutableHelloThere = hello + " There"
print(immutableHelloThere)

//Data type

val numberOne: Int = 1
val truth: Boolean = true


val age: Int = 25
val hexValue: Int = 0x1A

val population: Long = 8000000000L // Note the 'L' suffix

val smallNumber: Short = 32000

val binaryData: Byte = 127

val pi: Double = 3.14159
val e: Double = 2.71828d

val price: Float = 19.99f // Note the 'f' suffix

val grade: Char = 'A'
val unicodeChar: Char = '\u0041' // Also 'A'

val isScalaFun: Boolean = true
val HasPassed: Boolean = false

val printSomething: Unit = println("Hello, World!")

val greeting: String = "Hello, Scala!"

// Multi-line / Raw String
val speech: String = """To be,
                        or not to be."""

case class User(name: String, id: Int)
val user1: User = User("Alice", 101) // Custom Reference Type

val numbers: List[Int] = List(1, 2, 3) // Collection Reference Type

val nullableString: String = null // Allowed
// val wrong: Int = null         // Compile Error!

val count = 42          // Infers Int
val message = "Hi"      // Infers String
val dynamicList = List(1.0, 2.5) // Infers List[Double]