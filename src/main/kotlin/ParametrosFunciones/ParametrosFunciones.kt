package ParametrosFunciones

fun main(args: Array<String>) {
    imprimirNombre(nombre = "Juan ", apellido = "Galvis ")
    println("")
    imprimirNombreCompleto(nombre = "Maria", apellido = "Gordis")

}

fun imprimirNombre(nombre: String, apellido: String) {
    println("Mi nombre es $nombre y mi apellido es $apellido")
}

fun imprimirNombreCompleto(nombre: String, segundoNombre : String = "", apellido: String) {
    println("Mi nombre es $nombre $segundoNombre y mi apellido es $apellido")
}