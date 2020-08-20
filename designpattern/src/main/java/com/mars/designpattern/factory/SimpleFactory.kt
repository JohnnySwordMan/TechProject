package com.mars.designpattern.factory

/**
 * @author: geyan
 * @date: 2020-08-19
 *
 * 简单工厂模式：
 * 封装Product对象的创建过程，在Client类中，只需要传入type，就可以创建对应的Product。
 *
 * 优点：
 * 1. 将多个产品收敛到工厂中，如果想要新加产品，只需要在静态工厂方法中新增type，构建对应的产品
 * 2. 尽量避免创建对象和使用对象都在Client类中，违背单一职责
 *
 * 缺点：
 * 随着产品越来越多，静态工厂方法就会越来越臃肿和复杂，很多的if-else判断
 *
 * 总结：
 * 针对产品种类不多的情况，可以直接使用这种方式。
 *
 * 一个工厂对应所有的产品
 */
class SimpleFactory {

    companion object {

        fun createLoggerProduct(type: String): LoggerProduct? {
            return when (type) {
                "file" -> FileLoggerProduct()
                "database" -> DatabaseLoggerProduct()
                else -> null
            }
        }
    }
}