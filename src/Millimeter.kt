class Millimeter( private val value:Float) :Distance{
    override fun toKilometer() {
        println("Это ${value/1000000} км")
    }

    override fun toMeter() {
        println("Это ${value/1000} м")
    }

    override fun toCentimeter() {
        println("Это ${value/10} см")
    }

    override fun toMillimeter() {
        println("$value мм")
    }
}