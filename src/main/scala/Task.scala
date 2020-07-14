/**
 * Scala Assignment
 *
 * @author Claude De-Tchambila
 * @student_number: 217035027
 */

/*
* Task 1: This program creates a sequence from 50 to 100
*
* */
object Task1 extends App {
  val myRange = 50 to 100
  for (a <- myRange) println(a);
}

/*
* Task 2: Filtering data structures
*
* */
object Task2 extends App {
  val setOne: List[Int] = List(11, 13, 15, 20, 10)
  val setTwo: List[Int] = List(10, 7, 8, 19, 10)

  // Find common number(s) in setOne and setTwo
  println("Print number(s) that occur in the two data structures")
  setOne.foreach(num => {
    if (setTwo.contains(num)) print(num)
  })

  // Find number(s) that are not in setOne and setTwo
  println("\n\nPrint number(s) that don't occur in setTwo")
  setTwo.foreach(num => {
    if (!setOne.contains(num)) print(num + ", ")
  })

  println("\n\nand those that don't occur in setOne")
  setOne.foreach(num => {
    if (!setTwo.contains(num)) print(num + ", ")
  })
}

/*
 * Task 3: Find first, middle and last element of combined number sequence
 *
 */
object Task3 extends App {
  val numSequence1 = List(99, 10, 5, 5, 7, 10, 1)
  val numSequence2 = List(10, 30.0, 50, 4, 5)

  val numSequence3 = List.concat(numSequence1, numSequence2)

  val middleIndex = Math.ceil(numSequence3.length / 2).toInt

  println("First element " + numSequence3.head)
  println("Middle element " + numSequence3.apply(middleIndex))
  println("Last element " + numSequence3.last)
}