// Посчитайте число единиц в битовой записи числа, считанного с клавиатуры, и выведите на экран.
import scala.io.StdIn

object Main {
  def main(args: Array[String]) {
    val x = scala.io.StdIn.readLine().toInt
    val y = x.toBinaryString

    var count = 0
    for (c <- y) {
      if (c == '1') {
        count += 1
      }
    }
    println(count)
  }
}