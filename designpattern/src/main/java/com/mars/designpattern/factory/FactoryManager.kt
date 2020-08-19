package com.mars.designpattern.factory


object FactoryManager {

    // 简单工厂
    fun startSimpleFactory() {
        val product = SimpleFactory.createLoggerProduct("file")
        product?.writeLog()
    }
}