class Course(val _name :String, val _price: Double) {
  var name: String = _name
  var price: Double = _price

  override def toString: String = "Course name = \"" + name + "\" and price = R" + price
}

object CourseConversion {
  implicit def courseToCourseId(course: Course) = new CourseId(course)
}

class CourseId(course: Course) {
  def courseId = println(course.name + ", " + course.name.hashCode())
}

object RunCourse {

  import CourseConversion._

  def main(args: Array[String]): Unit = {
    val course1 = new Course("ICE362S Elective, FT", 40000)
    val course2 = new Course("ICE262S Elective, FT", 35000)
    val course3 = new Course("ICF152S Elective, FT", 30000)

    println(course1.courseId)
    println(course2.courseId)
    println(course3.courseId)
  }
}