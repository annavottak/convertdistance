class Kilometer( private val value:Float) :Distance{
    override fun toKilometer() {
        println("$value км")
    }

    override fun toMeter() {
        println("Это ${value*1000} м")
    }

    override fun toCentimeter() {
        println("Это ${value*100000} см")
    }

    override fun toMillimeter() {
        println("Это ${value*100000000} мм")
    }
}