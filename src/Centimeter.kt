
class Centimeter( private val value:Float) :Distance{
    override fun toKilometer() {
        println("Это ${value/100000} км")
    }

    override fun toMeter() {
        println("Это ${value/100} м")
    }

    override fun toCentimeter() {
        println("$value см")
    }

    override fun toMillimeter() {
        println("Это ${value*10} мм")
    }
}