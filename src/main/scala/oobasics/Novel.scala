package oobasics

class Novel (val name: String, val yearOfRelease: Int, val author: Writer){

  def getAuthorAge : Int = yearOfRelease - author.year
  def isWrittenBy(author: Writer): Boolean = this.author.equals(author)
  def copy(newYearOfRelease: Int): Novel = new Novel(name,newYearOfRelease,author)

  override def toString = s"oobasics.Novel($name, $yearOfRelease, $author)"
}
