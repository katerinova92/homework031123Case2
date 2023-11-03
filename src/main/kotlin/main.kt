fun main() {
    val likes = 127
    val strEnd = if (likes.toString().endsWith("1")) "человеку" else "людям"

    println("Понравилось $likes $strEnd")
}