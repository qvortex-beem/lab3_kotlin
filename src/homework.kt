import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    // задание 1
//    val target = Random.nextInt(1,50)
//    while (true) {
//        print("Введите число: ")
//        val input = readLine().toInt()
//        when {
//            input < target -> println("Загаданное число больше")
//            input > target -> println("Загаданное число меньше")
//            else -> {
//                println("Поздравляю! Ты угадал число: $target")
//                break
//            }
//        }
//    }

    // задание 2
//    print("Введите строку: ")
//    val str = readLine()
//    var count = 0
//    if (str != null) {
//        for (i in str) {
//            if (i in "аеёиоуыэюя") { count++ }
//        }
//    }
//    println("В этой строке $count гласных")

    // задание 3
//    print("Введите число N: ")
//    val N = readLine()?.toInt()
//    if (N != null) {
//        for (i in 0..N-1) {
//            println("${N-i}")
//        }
//    }

    // задание 4
//    val leng = Random.nextInt(8,16)
//    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
//    val specialchars = "!@#\\$%^&*"
//    var password = ""
//    repeat(leng) {
//        val randnum = Random.nextInt(1,4)
//        password += when (randnum) {
//            1 -> alphabet[Random.nextInt(alphabet.length)]
//            2 -> Random.nextInt(0,9).toString()
//            3 -> specialchars[Random.nextInt(specialchars.length)]
//            else -> ""
//        }
//    }
//    println(password)

    // задание 5
//    val otzivi = listOf("ты крутой", "хорошая работа", "молодчина", "так держать")
//    print("Введите имя: ")
//    val name = readln()
//    print("Введите ответ на первый простой вопрос: ")
//    val ans1 = readln()
//    print("Введите ответ на второй простой вопрос: ")
//    val ans2 = readln()
//    print("Введите ответ на третий простой вопрос: ")
//    val ans3 = readln()
//    println(name)
//    println(ans1)
//    println(ans2)
//    println(ans3)
//    println(otzivi[Random.nextInt(otzivi.size)])

    // задание 6
//    print("Введите N: ")
//    val N = readln().toInt()
//    var sum = 0
//    for (i in 1..N) {
//        sum += i
//    }
//    println(sum)

    // задание 7
//    repeat(10) {
//        println(Random.nextInt(1,7))
//    }

    // задание 8
//    val num1 = Random.nextInt(6)
//    val num2 = Random.nextInt(6)
//    val num3 = Random.nextInt(6)
//    println("$num1, $num2, $num3")
//    if (num1 == num2 && num2 == num3) {
//        println("Джекпот!")
//    }

    // задание 9
//    var sum = Random.nextInt(100,1001)
//    while (sum > 0) {
//        val trata = Random.nextInt(10,101)
//        sum -= trata
//        println("На счету осталось $sum")
//    }

    // задание 10
//    val days = listOf("понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье")
//    for (i in days) {
//        val temp = Random.nextInt(-10,31)
//        if (temp < 0) {
//            println(i)
//        }
//    }
}