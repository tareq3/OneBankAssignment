package com.labib.onebankassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.OBL.OKwallet.recharge_offer.RechargeOfferBottomFragment

class OfferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)
        findViewById<TextView>(R.id.tv_recharge_offer_btn).setOnClickListener(View.OnClickListener {
            RechargeOfferBottomFragment().show(
                supportFragmentManager,
                "BottomSheetDialog"
            )
        })
    }
}