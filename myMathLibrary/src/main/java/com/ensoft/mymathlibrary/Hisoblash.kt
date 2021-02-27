package com.ensoft.mymathlibrary

class Hisoblash {
    companion object{
        fun qoshish(qiymat1: Int, qiymat2:Int): Int{
            return qiymat1 + qiymat2
        }
        fun ayirish(qiymat1: Int, qiymat2:Int): Int{
            return qiymat1 - qiymat2
        }
        fun kopaytirish(qiymat1: Int, qiymat2:Int): Int{
            return qiymat1 * qiymat2
        }
        fun bolish(qiymat1: Int, qiymat2:Int): Int{
            if (qiymat1 == 0 || qiymat2 == 0){
                throw IllegalArgumentException("Raqam nolga bo'linmaydi")
            }
            else
                return qiymat1 / qiymat2
        }
    }
}