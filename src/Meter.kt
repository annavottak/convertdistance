class Meter( private val value:Float) :Distance{
    override fun toKilometer() {
        println("Это ${value/1000} км")
    }

    override fun toMeter() {
        println("$value м")
    }

    override fun toCentimeter() {
        println("Это ${value*100} см")
    }

    override fun toMillimeter() {
        println("Это ${value*1000} мм")
    }
}