package com.imsosoft.kotlinintrotesting

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class Testing {

    // if V is V % 2 == 0 -> true
    // if V is V % 2 != 0 -> false
    @Test
    fun ` testing for even control ` () {
        val value = (0..10).random()
        val isEven = value.isEven()

        assertThat(isEven).isEqualTo(value % 2 == 0)


//        when (value.isEven()) {
//            true -> assertThat(value.isEven()).isEqualTo(true)
//            false -> assertThat(value.isEven()).isEqualTo(false)
//        }



    }

    // if N is odd -> Weird
    // if N is even -> Not Weird
    // if N is even and in the inclusive range of 2 to 5 -> Not Weird
    // if N is even and in the inclusive range of 6 to 20 -> Weird
    @Test
    fun ` testing for weird or not weird control ` () {
        val weird = Weird()
        val n = (1..100).random()

        val isWeird = weird.weirdOrNotWeird(n)



        if (n.isEven()) {
            when (n) {
                in 2..5 -> assertThat(isWeird).isEqualTo("Not Weird")
                in 6..20 -> assertThat(isWeird).isEqualTo("Weird")
                else -> assertThat(isWeird).isEqualTo("Not Weird")
            }
        } else {
            assertThat(isWeird).isEqualTo("Weird")
        }


    }

}