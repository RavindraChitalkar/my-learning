//Flow control

//IF/else

if(1 > 3) println("Impossible ") else println("The world make sense !")

if(1 > 3 ){
  println("Impossible ")
  println("Really ? ")
}else{
  println("The world make sense !")
  println("Still ")
}

// Matching
val number  = 2

number match {
  case 1 => print("One")
  case 2 => print("Two")
  case 3 => print("Three")
  case _ => print("Something else")

}

//for loop

for(x <- 1 to 4){
  val squared = x*x
  println(squared)
}

//While loop
var x = 10
while (x >= 0){
  print( " "+ x)

  x -= 1
}

//do-while loop
//x = 0
//do { println(x); x+=1 } while( x <= 10 )