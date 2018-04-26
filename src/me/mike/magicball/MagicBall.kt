package me.mike.magicball

import java.util.*

fun main(args: Array<String>) {
            val answers = arrayOf(
                    "It is certain",
                    "It is decidedly so",
                    "Without a doubt",
                    "Yes, definitely",
                    "You may rely on it",
                    "As I see it, yes",
                    "Most likely",
                    "Outlook good",
                    "Yes",
                    "Signs point to yes",
                    "Reply hazy try again",
                    "Ask again later",
                    "Better not tell you now",
                    "Cannot predict now",
                    "Concentrate and ask again",
                    "Don't count on it",
                    "My reply is no",
                    "My sources say no",
                    "Outlook not so good",
                    "Very doubtful"
            )
            val random = Random()
            val scanner = Scanner(System.`in`)
            var running = true

            while (running) {
                println("Please type a question!")
                val question = scanner.nextLine()
                if (question.equals("exit"))
                    running = false
                else {
                    println(answers[random.nextInt(answers.size)] + "\n")
                }
            }
            scanner.close()
        }


