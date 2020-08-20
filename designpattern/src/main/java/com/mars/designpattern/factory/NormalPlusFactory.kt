package com.mars.designpattern.factory

import com.mars.designpattern.log

/**
 * @description: 在NormalFactory基础上优化，对外隐藏createProduct方法
 * @author: geyan
 * @date: 2020-08-21
 */
abstract class AbsNormalPlusFactory {

    fun writeLog() {
        createProduct().writeLog()
    }

    abstract fun createProduct(): LoggerProduct
}

class FileNormalPlusFactory : AbsNormalPlusFactory() {

    init {
        log("create FileNormalPlusFactory")
    }

    override fun createProduct(): LoggerProduct {
        return FileLoggerProduct()
    }

}

class DatabaseNormalPlusFactory : AbsNormalPlusFactory() {

    init {
        log("create DatabaseNormalPlusFactory")
    }

    override fun createProduct(): LoggerProduct {
        return DatabaseLoggerProduct()
    }

}