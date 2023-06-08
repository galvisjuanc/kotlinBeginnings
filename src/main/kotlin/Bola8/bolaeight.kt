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

    val valorIngresado = readLine()

    when(valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }

}

fun realizarPregunta(){

}

fun mostrarRespuestas(){

}

fun salir(){

}

fun mostrarError () {

}