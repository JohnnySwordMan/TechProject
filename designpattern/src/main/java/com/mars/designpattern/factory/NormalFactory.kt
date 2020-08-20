package com.mars.designpattern.factory

import com.mars.designpattern.log

/**
 * @description: 一个工厂对应一个产品，想要创建产品，需要首先创建其工厂
 * @author: geyan
 * @date: 2020-08-21
 *
 * 如果需要新建产品，只需要新建工厂类，而不需要改动太多代码。
 * 我们的代码最好只新增，不在原代码上进行修改。
 */

interface INormalFactory {

    fun createProduct(): LoggerProduct
}

class FileLoggerNormalFactory : INormalFactory {

    init {
        log("create FileLoggerNormalFactory")
    }

    override fun createProduct(): LoggerProduct {
        return FileLoggerProduct()
    }

}

class DatabaseLoggerNormalFactory: INormalFactory {

    init {
        log("create DatabaseLoggerNormalFactory")
    }

    override fun createProduct(): LoggerProduct {
        return DatabaseLoggerProduct()
    }

}