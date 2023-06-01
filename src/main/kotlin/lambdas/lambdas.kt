package lambdas

fun main(args: Array<String>) {
    val myLambda : (String) -> Int = {valor -> valor.length }
    val lambdaEjecutada: Int = myLambda("Hola Bebé")
    println(myLambda)
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Konichiwa", "Salut")
    val longitudDeSaludos = saludos.map(myLambda)

    println(longitudDeSaludos)
}