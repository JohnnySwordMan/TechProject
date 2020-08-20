package com.mars.designpattern.factory


object FactoryManager {

    // 简单工厂
    fun startSimpleFactory() {
        val product = SimpleFactory.createLoggerProduct("file")
        product?.writeLog()
    }

    // 工厂模式
    fun startNormalFactory() {
        val factory = FileLoggerNormalFactory()
        val fileLoggerProduct = factory.createProduct()
        fileLoggerProduct.writeLog()
    }

    // 工厂模式-优化
    fun startNormalPlusFactory() {
        val factory = DatabaseNormalPlusFactory()
        factory.writeLog()
    }
}