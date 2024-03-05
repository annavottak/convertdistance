class Milliliter ( private val value:Float) :Volume
{
    override fun toLiter() {
        println("Это ${value/1000} л")
    }

    override fun toMilliliter() {
        println("$value мл")
    }
}