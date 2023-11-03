fun main() {
    val likes = 21
    val strEnd = when {
       likes % 100 == 11 -> "людям"
       likes.toString().endsWith("1") -> "человеку"
       else -> "людям"
    }

    println("Понравилось $likes $strEnd")
}