package com.mars.designpattern.factory

import com.mars.designpattern.log

/**
 * @description: 产品的抽象类
 * @author: geyan
 * @date: 2020-08-19
 */
abstract class LoggerProduct {

    abstract fun writeLog()
}

// 文件日志
class FileLoggerProduct: LoggerProduct() {

    init {
        log("create FileLoggerProduct")
    }

    override fun writeLog() {
        log("FileLoggerProduct---writeLog")
    }

}

// 数据库日志
class DatabaseLoggerProduct: LoggerProduct() {

    init {
        log("create DatabaseLoggerProduct")
    }

    override fun writeLog() {
        log("DatabaseLoggerProduct---writeLog")
    }

}