package com.imsosoft.kotlinintrotesting

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class Testing {

    @Test
    fun ` testing for even control ` () {
        val value = 11
        val isEven = value.isEven()

        assertThat(isEven).isTrue()

    }

}