package setsNo

fun main(args: Array<String>) {
    val vocalesRepetidas = setOf("a", "a", "e", "a", "e", "u", "o", "i")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4,5)
    println(numerosFavoritos)
    numerosFavoritos.add(9)
    println(numerosFavoritos)

    numerosFavoritos.remove(2)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull{numero -> numero > 2}
    println(valorDelSet)

}