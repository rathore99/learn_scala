package oobasics

class Writer(val firstName: String,val lastName: String ,val year: Int) {
      def getFullName :String = s"$firstName  $lastName"

      override def toString = s"oobasics.Writer($firstName, $lastName, $year)"
}
