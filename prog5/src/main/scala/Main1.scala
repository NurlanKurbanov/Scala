//Ваша задача - определить, является ли переданная строка input
// записанной в snake-case стиле.
//
//Требовая snake-case к строке:
//
//Должна содержать только строчные латинские буквы и символ подчёркивания
//Символ подчёркивания не должен стоять в начале и в конце строки
//Два символа подчёркивания не могут стоять рядом
//Считайте из стандартного потока ввода строку и напечатайте true,
// если она удовлетворяет требованиям выше, false иначе.
import scala.io.StdIn


object Main1 {
  def main(args: Array[String]) {
    val s = StdIn.readLine()
    val pattern = "^[a-z_]+$"

    if ((s(0) == '_') || (s(s.length-1) == '_')){
      println("false")
    } else if (!s.matches(pattern)) {
      println("false")
    } else if (!hasNoDoubleUnderscore(s)){
      println("false")
    } else {
      println("true")
    }
  }

  def hasNoDoubleUnderscore(s: String): Boolean = {
    var prevChar = s(0)
    for (i <- 1 until s.length) {
      val currentChar = s(i)
      if ((currentChar == '_') && (prevChar == '_')) {
        return false
      }
      prevChar = currentChar
    }
    return true
  }
}