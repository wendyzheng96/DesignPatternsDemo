package com.zyf.design.strategy

/**
 * 打折收费子类
 * Created by zyf on 2020/1/20.
 */
class CashRebate(private val moneyRebate: String) : CashSuper() {

    override fun acceptCash(money: Double): Double = money * moneyRebate.toDouble()

}