package com.tiara.kalkulatorsederhanamvp

class KalkulatorPresenter (var main : KalkulatorView) {

    fun calculator (input1 : String, input2 :String, operator : String){

       if (valid(input1,input2)){
           calculate(input1,input2,operator)
       }
    }

    private fun calculate(input1: String, input2: String, operator: String) {
        val a = input1.toDouble()
        val b = input2.toDouble()

        when(operator){
            "+" -> main.hasil((a+b).toString())
            "-" -> main.hasil((a-b).toString())
            "/" -> main.hasil((a*b).toString())
            "x" -> main.hasil((a/b).toString())

        }
    }

    private fun valid(input1: String, input2: String): Boolean { // method yang digunakan untuk mengenalkan edit text
        return input1 != "" && input2 != ""
    }
}