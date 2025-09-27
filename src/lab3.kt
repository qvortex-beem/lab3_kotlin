import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
//    var number = 0
//    while (number < 10) {
//        number++
//        if (number == 3)
//            println("Останавливаемся на $number")
//        continue
//    }
//    println(number)

//    println("Напишите что-нибудь (для выхода введите 'выход'): ")
//
//    while (true) {
//        val input = readLine()
//        if (input == "выход") {
//            println("До свидания!")
//            break
//        }
//        println("Вы ввели: $input")
//    }

//    var letter = 'A'
//    while (letter <= 'Z') {
//        print(letter)
//        letter++
//    }

//    var number: Int
//    do {
//        print("Введите число больше 10: ")
//        number = readln().toInt()
//    } while (number <= 10)
//
//    println("Спасибо! Вы ввели $number.")

//    print("Введите пароль: ")
//    var password: String? = readln()
//
//    while (password != "qwerty") {
//        print("Введите пароль: ")
//        password = readln()
//    }
//    println("Доступ разрешен!")

//    var password: String?
//
//    do {
//        print("Введите пароль: ")
//        password = readln()
//    } while (password != "qwerty")
//    println("Доступ разрешен!")

//    for (i in 1..5) {
//        println("Шаг $i")
//    }

//    val fruits = listOf("apple", "banana", "chery")
//    for (fruit in fruits) {
//        println("Фрукт: $fruit")
//    }

//    val sentence = "Kotlin is awesome"
//    val words = sentence.split(" ")
//    println(words)

//    val data = "apple,banana,orange"
//    val fruits = data.split(",")
//    for (fruit in fruits) {
//        println(fruit)
//    }

//    val messy = "word1,word2;word3|word4"
//    val parts = messy.split(",",";","|")
//    println(parts)

//    val fullName = "Иванов Иван"
//    val parts = fullName.split(" ")
//    val lastName = parts[0]
//    val firstName = parts[1]
//    println("Фамилия: $lastName, Имя: $firstName")

//    print("Введите числа через пробел: ")
//    val input = readln()
//    val numbers = input.split(" ")
//    var sum = 0
//    for (number in numbers) {
//        sum += number.toInt()
//    }
//    println("Сумма чисел: $sum")

//    println(Random.nextInt(100))
//    println(Random.nextInt(1,100))
//    println(Random.nextLong(100))
//    println(Random.nextLong(1,100))
//    println(Random.nextDouble(5.0))
//    println(Random.nextDouble(0.0,5.0))

//    val target = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while (true) {
//        print("Введи число: ")
//        val input = readln().toInt()
//        when {
//            input < target -> println("Загаданное число больше.")
//            input > target -> println("Загаданное число меньше.")
//            else -> {
//                println("Поздравляю! Ты угадал число: $target")
//                break
//            }
//        }
//    }

//    val dice1 = Random.nextInt(1,7)
//    val dice2 = Random.nextInt(1,7)
//    val sum = dice1+dice2
//    println("Первый кубик: $dice1")
//    println("Второй кубик: $dice2")
//    println("Сумма: $sum")

//    val num1 = println(Random.nextDouble(0.0,10.0))
//    val num2 = println(Random.nextDouble(0.0,10.0))
//    val num3 = println(Random.nextDouble(0.0,10.0))
//    val average = (num1+num2+num3) / 3
//    println("Числа $num1, $num2, $num3")
//    println("Среднее: $average")
}