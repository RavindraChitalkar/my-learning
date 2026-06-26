//Data Structure

// Tuples

// Immutable list

val captainStuff = ("Picard", "Enterprise - D", "NCC-170-D")

println(captainStuff)

//Refer to individual fields with one based Index

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardShip = "Picard" -> "Enterprise - D"
println(picardShip._2)

val aBunchOfStuff = ("Kick", 1964 , true)

// List
// Like a tuple, but more functionality
// Must be of same type

val shipList = List("AB","BC","CD","DE")

println(shipList(1))
//  Zero-based

println(shipList.head)
println(shipList.tail)

for (ship <- shipList){
  print(" "+ship)
}

val backWardShip = shipList.map( (ship: String) => {
  ship.reverse
})

for (ship <- backWardShip) { println(ship) }

// reduce () to combine together all the items in the collection using some function

val numberList = List(1,2,3,4,5)
val  sum = numberList.reduce( (x: Int, y: Int) => x + y)
println(sum)

// Filter remove stuff

val iHateFives = numberList.filter((x: Int) => x !=5)
println(iHateFives)

//Shorthand expression of filter

val iHateThree = numberList.filter(_ !=3)
println(iHateThree)

//Concatenate list

val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers

println(lotsOfNumbers)

val reversed = numberList.reverse

//Sorting
val sorted = reversed.sorted

val lotsOfDuplicates = numberList ++ numberList
print(lotsOfDuplicates)

val distinctValues = lotsOfDuplicates.distinct
print(distinctValues)

val maxValue = numberList.max
print(maxValue)

val minValue = numberList.min
print(minValue)

val total = numberList.sum
print(total)

val hasThree = iHateThree.contains(3)
print(hasThree)

// MAPS
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise - D", "Sisko" -> "Deep space nine")
println(shipMap("Picard"))

println(shipMap.contains("Archer"))

val archerShip = util.Try(shipMap("Archer")) getOrElse()