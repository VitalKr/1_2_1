fun main(args: Array<String>) {
    println("За переводы с любых карт комиссия 0.75%, минимум 35 рублей.")
    println("Введите сумму перевода:")
    println("Введите рубли:")
    val rub = readln()
    println("Введите копейки:")
    val kop = readln()
    var amount_rub = 0
    var amount_kop = 0
    var amount = 0
    try {
        amount_rub = rub.toInt()
        amount_kop = kop.toInt()
        amount = amount_rub * 100 + amount_kop
        print("Сумма перевода равна:")
        println("  " + amount_rub + " руб. " + amount_kop + " коп.")
    } catch (e: Exception) {
        println("Вы ввели не число")
    }
    if ((35_00 < amount) && (amount < 15000_00)) {
        var procent = (amount * 0.75 / 100)
        if (procent < 35_00) {
            procent = 35_00.0
        }
        val perevod = (amount + (procent)) / 100
        procent /= 100
        println("Всего списано за перевод: $perevod")
        println("Сумма комиссии за перевод: $procent")
    } else {
        println("Введенная сумма меньше 35 руб и более 15000 руб. перевод невозможен")
    }
}