package com.mars.designpattern.factory

import com.mars.designpattern.log


/**
 * @description: 抽象工厂模式，将多个产品当做零件，这样可以减少工厂模式的类
 * @author: geyan
 * @date: 2020-08-21
 *
 * 当然这里也可以优化成NormalPlusFactory的样式。
 *
 * 一般接口以I开头，抽象类以Abs开头
 */

interface IAbstractFactory {

    fun createFileLoggerProduct(): LoggerProduct

    fun createDatabaseLoggerProduct(): LoggerProduct
}

class CommonAbstractFactory : IAbstractFactory {

    init {
        log("create CommonAbstractFactory")
    }

    override fun createFileLoggerProduct(): LoggerProduct {
        return FileLoggerProduct()
    }

    override fun createDatabaseLoggerProduct(): LoggerProduct {
        return DatabaseLoggerProduct()
    }

}

class AdvancedAbstractFactory: IAbstractFactory {

    init {
        log("create AdvancedAbstractFactory")
    }

    override fun createFileLoggerProduct(): LoggerProduct {
       return AdvancedFileLoggerProduct()
    }

    override fun createDatabaseLoggerProduct(): LoggerProduct {
        return AdvancedDatabaseLoggerProduct()
    }

}