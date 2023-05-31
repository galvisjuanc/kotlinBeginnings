package MapsK

fun main(args: Array<String>) {
    val edadDeSuperheroes = mapOf(
        "Ironman" to 34,
        "Spiderman" to 23,
        "Capitan America" to 29
    )
    println(edadDeSuperheroes)

    // Mapa Mutable

    val edadSuperheroesMutable = mutableMapOf(
        "Dr Strange" to 56,
        "Thor" to 1200
    )
    println(edadSuperheroesMutable)

    edadSuperheroesMutable.put("Wolverine", 79)
    println(edadSuperheroesMutable)

    edadSuperheroesMutable["Storm"] = 30
    println(edadSuperheroesMutable)

    val edadIronman = edadDeSuperheroes["Ironman"]
    println(edadIronman)

    edadSuperheroesMutable.remove("Wolverine")
    println(edadSuperheroesMutable)
    println(edadSuperheroesMutable.keys)
    println(edadSuperheroesMutable.values)

}