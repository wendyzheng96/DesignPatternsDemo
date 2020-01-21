package com.zyf.design.strategy

/**
 * Created by zyf on 2020/1/20.
 */
class CashContext(type: String) {

    private var cs: CashSuper? = null

    init {
        when(type){
            "正常收费" -> cs = CashNormal()
            "满300返100" -> cs = CashReturn("300", "100")
            "打8折" -> cs = CashRebate("0.8");
        }
    }

    fun getResult(money: Double) = cs!!.acceptCash(money)

}