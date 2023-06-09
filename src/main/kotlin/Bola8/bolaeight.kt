package Bola8

// Our responses
const val RESPUESTA_AFIRMATIVA = "✓"
const val RESPUESTA_NEGATIVA = "X"
const val RESPUESTA_DUDOSA = "?"

//Unified the answers with the values
val respuestas = mapOf(
    "Si" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte ahora" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "Quizás" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA
)

fun main(args: Array<String>) {
    println("Hola, soy tu bola 8 mágica creada en Kotlin! Cuál de estas opciones deseas realizar= ")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    print("Valor a elegir -> ")

    val valorIngresado = readLine()

    when(valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }

}

fun realizarPregunta(){
    println("Qué pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta a eso es: ")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}

fun mostrarRespuestas(){
    println("Selecciona una opcion: ")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudosas")
    println("4. Revisar solo las respuestas negativas")

    val opcionIngresada = readLine()
    when (opcionIngresada) {
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
        "4" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        else -> println("Respuesta no valida. Adios!")
    }
}

fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS") {
    when(tipoDeRespuesta) {
        "TODOS" -> respuestas.keys.forEach{ respuesta -> println(respuesta) }

        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }

    }
}

fun salir(){
    println("Hasta luego!")
}

fun mostrarError () {
    println("Parece que has elegido una opción no válida")
}