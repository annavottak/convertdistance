class Liter ( private val value:Float) :Volume
{
    override fun toLiter() {
        println("$value л")
    }

    override fun toMilliliter() {
        println("Это ${value*1000} мл")
    }
}