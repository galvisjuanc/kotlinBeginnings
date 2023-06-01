package functions

import java.util.*

fun main(args: Array<String>) {
    val fraseAleatoria = "Nunca pararé de aprender"
    val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)
    imprimirFrase(fraseOrdenadaAleatoriamente)

    val frase2 = "Si puedes imaginarlo, puedes programarlo".randomCaseExtension()
    imprimirFrase(frase2)
}

fun randomCase(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
         frase.uppercase(Locale.getDefault())
    } else {
        frase.lowercase(Locale.getDefault())
    }
}

fun imprimirFrase(frase : String) {
    println("Tu frase es: $frase")
}

fun String.randomCaseExtension() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
        this.uppercase(Locale.getDefault())
    } else {
        this.lowercase(Locale.getDefault())
    }
}