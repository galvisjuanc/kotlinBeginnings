package trycatch
fun main(args: Array<String>) {
    var nombre : String? = null
    try {
        throw NullPointerException("Ha ocurrido un error nuevo. Referencia nula")
        //nombre!!.length
    } catch (exception : NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicación")
    }

    val primerValor = 10
    val segundoValor = 0

    val resultado : Int = try { primerValor / segundoValor } catch (exception: ArithmeticException) { 0 }
    println("resultado errado -> " + resultado)

}