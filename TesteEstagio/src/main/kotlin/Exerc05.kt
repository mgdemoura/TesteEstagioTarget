fun reverse(str: String): String {
    var novaPalavra = ""
    for(i in str.length - 1 downTo 0){
        novaPalavra += str[i]
    }
    return novaPalavra
}

fun main() {
    var palavra = "Teste"

    println(reverse(palavra))
}