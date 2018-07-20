package com.tiara.kalkulatorsederhanamvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), KalkulatorView {

    var presenter : KalkulatorPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = KalkulatorPresenter(this)

        btnTambah.setOnClickListener {
            presenter?.calculator(edt1.text.toString(),edt2.text.toString(),operator = "+")

        }
    }

    override fun error(error: String) {
        //munculin toast
    }

    override fun hasil(hasil: String) {
        txthasil.text = hasil.toDouble().toString()

    }
}
