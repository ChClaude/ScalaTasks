class Course(val _name :String, val _price: Double) {
  var name: String = _name
  var price: Double = _price

  override def toString: String = "Course name = \"" + name + "\" and price = R" + price
}

object CourseConversion {
  implicit def courseToCourseId(course: Course) = new CourseId(course)
}

class CourseId(course: Course) {
  def courseId = println(course.name + ", Course Price: R" + course.price)
}

object RunCourse {
  def main(args: Array[String]): Unit = {
    val appDevCourse = new Course("Application Development", 7500)

    println(appDevCourse.toString)
  }
}