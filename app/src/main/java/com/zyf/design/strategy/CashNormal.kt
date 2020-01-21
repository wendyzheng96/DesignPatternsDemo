package com.zyf.design.strategy

/**
 * 正常收费子类
 * Created by zyf on 2020/1/20.
 */
class CashNormal : CashSuper() {

    override fun acceptCash(money: Double): Double = money
}