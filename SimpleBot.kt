import java.util.Scanner


val scanner = Scanner(System.`in`)

fun main() {
    greet("Edward", "2021")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("In what cases we should use variable of \"Paper\" type?")
    println("1. To enter the text.")
    println("2. To remove all text.")
    println("3. There is no such variable!!!")
    println("4. To read all data from a text file.")
    while (true) {
        val choice = scanner.nextInt()
        if (choice == 3) {
            break;
        } else {
            println("Please, try again.")
        }
    }

}

fun end() {
    println("Congratulations, have a nice day!")
}