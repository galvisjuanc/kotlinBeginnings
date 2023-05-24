const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")

    var dinero = 10       // var dinero : Int = 10
    println(dinero)
    dinero = 5
    println(dinero)

    val nombre = "Maria"    // val nombre : String = "Maria"
    println(nombre)

    println(PI)

    val booleano = true             // val boolean: Boolean = true
    val numeroLargo = 3L            // val numeroLargo : Long = 3L
    val valordouble = 2.7182           // val valordouble : Double = 2.7182
    val flotante = 1.1f                // val

    print(booleano)
    println(numeroLargo)
    print(valordouble)
    println(flotante)

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)

    val apellido = "Galvis"
    val nombreCompleto = "Juan"
    val nombretotal = nombreCompleto + apellido
    val nombreEspacio = "$nombreCompleto $apellido"
    println(nombretotal)
    println(nombreEspacio)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}\n")

    //estructuras de control if else
    val nombremujer = "Ama"
    if (nombremujer.isNotEmpty()) println("El largo de nuestra variable nombremaria es ${nombremujer.length}") else
        println("Error, la variable está vacía")

    val mensajeTexto : String = if (nombremujer.length > 4) {
        "Tu nombre es largo!"
    } else if (nombremujer.isEmpty()) {
        "Nombre está vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensajeTexto)
}