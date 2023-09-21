import scala.io.StdIn.readLine

object read_print {
  def main(args: Array[String]): Unit = {
    println("Hello, enter line")
    val line = readLine()
    print("you entered:")
    println(line)
  }
}
