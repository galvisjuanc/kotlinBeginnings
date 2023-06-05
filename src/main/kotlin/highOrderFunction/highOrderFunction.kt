package highOrderFunction

fun main(args: Array<String>) {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!", block = {valor ->
        valor.length
    })
    println(largoDelValorInicial)

    val lambda: () -> String = funcionInception("JuanCamilo")
    val valorLambda : String = lambda()
    println(valorLambda)
}

fun superFuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}