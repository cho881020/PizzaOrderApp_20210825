package com.neppplus.pizzaorderapp_20210825

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_20210825.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as StoreData

        nameTxt.text = mStoreData.name
        phoneNumTxt.text = mStoreData.phoneNum

        Glide.with(mContext).load(mStoreData.logoURL).into(logoImg)


    }

}