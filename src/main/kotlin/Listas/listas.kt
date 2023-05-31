package Listas

fun main(args: Array<String>) {
    //Lista Inmutable
    val listaDeNombres = listOf("Juan", "Enrique", "Camila", "Ana", "Jose", "Maria")
    println(listaDeNombres)

    //Lista Mutable
    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Jota")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listaDeNombres.first()
    println(primerValor)

    //Si quiero imprimir un valor pero no estoy seguro si es vacio
    val segundoValor = listaDeNombres.firstOrNull()
    println(segundoValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Jotica")
    listaVacia.add("Mariana")
    listaVacia.add("Oso")
    listaVacia.add("Ronaldo")
    listaVacia.add("Juan")

    listaVacia.removeIf{ caracteres -> caracteres.length > 5}
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray")
    println("${myArray.toList()}")
}