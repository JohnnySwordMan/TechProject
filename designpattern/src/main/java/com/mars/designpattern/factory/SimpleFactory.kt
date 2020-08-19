package com.mars.designpattern.factory

/**
 * @author: geyan
 * @date: 2020-08-19
 *
 * 简单工厂模式
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