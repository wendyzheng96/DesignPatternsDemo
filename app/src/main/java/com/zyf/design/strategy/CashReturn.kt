package com.zyf.design.strategy

/**
 * 返利收费子类
 * Created by zyf on 2020/1/20.
 */
class CashReturn(private val moneyCondition: String, private val moneyReturn: String): CashSuper(){

    override fun acceptCash(money: Double): Double {
        if (money >= moneyCondition.toDouble()) {
            return money - moneyReturn.toDouble()
        }
        return money
    }
}