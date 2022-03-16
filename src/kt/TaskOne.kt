package kt

fun main() {

    printString(5, arrayListOf("ASDF", "TTFF", "SGGS", "TGDT", "SASA", "SFGH"))

}


fun printString(number: Int, strings: ArrayList<String>) {

    val trimmedStrings = strings.take(number)

    for(i in trimmedStrings) {
        if ((i.length > 4) || (i.length < 4))  {
            println("Неверный формат данных")
            break
        }
        val strSorted = i.toCharArray().sorted().joinToString("")

        if (strSorted[0] == strSorted[1] && strSorted[2] == strSorted[3]) {
            println("$i Yes")
        }
        else
            println("$i No")
    }
}