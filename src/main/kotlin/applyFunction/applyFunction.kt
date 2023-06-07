package applyFunction

fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .apply {
            removeIf { movil -> movil.contains("Google")}
        }

    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo", "Verde")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}