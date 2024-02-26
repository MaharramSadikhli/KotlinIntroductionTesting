package com.imsosoft.kotlinintrotesting

class Weird {

    // if N is odd -> Weird
    // if N is even -> Not Weird
    // if N is even and in the inclusive range of 2 to 5 -> Not Weird
    // if N is even and in the inclusive range of 6 to 20 -> Weird

    fun weirdOrNotWeird(n: Int) {

        if (n.isEven()) {

            when (n) {
                in 2..5 -> println("Not Weird")
                in 6..20 -> println("Weird")
                else -> println("Not Weird")
            }

        } else {
            println("Weird")
        }

    }

}