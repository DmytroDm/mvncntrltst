package com.mvntst.auto.auto.testmavencentral

import com.mvntst.auto.auto.mvncntrltst.BaseEcho

class CustomEcho: BaseEcho() {

    fun secureEcho() {
        super.echo()
    }
}