fun main() {
    var level = 0
    println("Добро пожаловать в Подземелье!")
    while(level < 5) {
        println("\nВы на уровне $level.")
        println("Выберите действие: [1] Вперед | [2] Осмотреться | [0] Сдаться")
        val input = readLine()
        when (input) {
            "1" -> {
                level++
                println("Вы переходите на уровень $level")
            }
            "2" -> {
                println("Вы осматриваетесь. Тут ничего интересного.")
                continue
            }
            "0" -> {
                println("Вы сдались. Игра окончена.")
                break
            }
            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }
        }
        if (level == 5)
            println("Поздравляем! Вы выбрались из подземелья!")
    }
}