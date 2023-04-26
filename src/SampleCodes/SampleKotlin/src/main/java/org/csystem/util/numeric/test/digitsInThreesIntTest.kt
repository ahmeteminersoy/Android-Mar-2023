package org.csystem.util.numeric.test

import org.csystem.util.array.kotlin.write
import org.csystem.util.console.kotlin.readInt
import org.csystem.util.numeric.digitsInThrees
import kotlin.random.Random

fun main() = runDigitsInThreesIntTest()

fun runDigitsInThreesIntTest()
{
    val count = readInt("Bir sayı giriniz:")

    for (i in 1..count) {
        val value = Random.nextInt();
        print("$value -> ")
        write(digitsInThrees(value))
    }

    println("Tekrar yapıyor musunuz?")
}