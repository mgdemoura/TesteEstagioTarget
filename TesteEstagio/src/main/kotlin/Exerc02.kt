fun main (){
    var n = 21
    var f1 = 0
    var f2 = 1
    var f3 = 0

    while (n > f3){
        f3 = f1 + f2
        f1 = f2
        f2 = f3
    }
    if(n == 0 || n == 1 || n == f3){
        println("$n - Pertence a sequência de Fibonacci")
    }else println("$n - Não pertence a sequência de Fibonacci")
}