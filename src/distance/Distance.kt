package distance

sealed interface Distance{
    fun toKilometer()
    fun toCentimeter()
    fun toMillimeter()
    fun toMeter()
}