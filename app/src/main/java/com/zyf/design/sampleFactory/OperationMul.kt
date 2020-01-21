package com.zyf.design.sampleFactory

/**
 * Created by zyf on 2020/1/20.
 */
class OperationMul: Operation() {
    override val result: Double
        get() = numberA * numberB
}