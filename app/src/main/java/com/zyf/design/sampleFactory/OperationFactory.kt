package com.zyf.design.sampleFactory

/**
 * Created by zyf on 2020/1/20.
 */
object OperationFactory {

    fun createOperate(operate: String?): Operation? {
        when (operate) {
            "+" -> return OperationAdd()
            "-" -> return OperationSub()
            "*" -> return OperationMul()
            "/" -> return OperationDiv()
        }
        return null
    }
}