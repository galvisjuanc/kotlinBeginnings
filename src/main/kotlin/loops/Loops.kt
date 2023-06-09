package loops

fun main(args: Array<String>) {
    var contador = 10;
    while (contador > 0 ) {
        println("El valor del contador es $contador")
        contador--
    }

    do {
        println("Generando número aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while(numeroAleatorio > 30);

    println("")
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno", "Limon", "Uva", "Ciruela", "Banano")
    for (fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")

    println("")
    listaDeFrutas.forEach {fruta -> println("Mañana voy a comerme cada fruta llamada $fruta")}

    //convertir la lista a map
    println("")
    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    println("")
    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    print(listaFiltrada)
}