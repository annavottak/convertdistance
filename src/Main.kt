sealed interface Distance{
    fun toKilometer()
    fun toCentimeter()
    fun toMillimeter()
    fun toMeter()
}
sealed interface Volume{
    fun toLiter()
    fun toMilliliter()
}

fun main() {
    print("Введите число в метрах:")
    try {
        val meterEnter = readln().toFloat()
        val convertMeter:Distance=Meter(meterEnter)
        convertMeter.toKilometer()
        convertMeter.toCentimeter()
        convertMeter.toMillimeter()
    } catch (e: Exception) {
        println("Неверные вводные данные")
    }
    print("Введите объем в милилитрах:")
    try {
        val volume=readln().toFloat()
        val convertMilliliter:Volume=Milliliter(volume)
        convertMilliliter.toLiter()

    } catch (e: Exception) {
        println("Неверные вводные данные")
    }
}