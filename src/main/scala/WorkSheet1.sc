val age = (year: Int) => 2020 - year
val fullName = (firstName: String, lastName: String) =>
  firstName + " " + lastName
val average = (a: Int, b: Int, c: Int, d: Int) => (a + b + c + d) / 4
val volumeOfSquare = (side: Int) => side * side * side
val volumeOfCylinder = (radius: Int, height: Int) =>
  Math.PI * radius * radius * height

println(age(1999))
println(fullName("Claude", "Christ"))
println(average(6, 5, 3, 2))
println(volumeOfSquare(5))
println(volumeOfCylinder(5, 10))
