package letFunction

fun main(args: Array<String>) {
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es nulo, es $valor")
    }
    nombre = "Juan"
    nombre?.let {
        valor -> println("EL nombre no es nulo, es $valor")
    }
}