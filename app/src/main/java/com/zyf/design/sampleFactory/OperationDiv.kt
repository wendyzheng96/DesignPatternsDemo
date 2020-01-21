package com.zyf.design.sampleFactory

import android.util.Log

/**
 * Created by zyf on 2020/1/20.
 */
class OperationDiv : Operation() {

    override val result: Double
        get() {
            if (numberB.toInt() == 0) {
                Log.e(TAG, "getResult: 除数不能为0。")
            }
            return numberA / numberB
        }

    companion object {
        private const val TAG = "OperationDiv"
    }
}