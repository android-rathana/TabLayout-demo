package com.example.ratha.tablayouttest.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.ratha.tablayouttest.base.BaseFragment
import com.example.ratha.tablayouttest.R
import android.widget.Toast


import com.shashank.sony.fancydialoglib.Animation
import com.shashank.sony.fancydialoglib.FancyAlertDialog
import com.shashank.sony.fancydialoglib.Icon


class SettingFragment : BaseFragment() {

    private lateinit var btnAlertDialog: Button
    override fun setLayout(): Int = R.layout.setting_fragment_layout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnAlertDialog=view.findViewById(R.id.dialog)
        btnAlertDialog.setOnClickListener({
            FancyAlertDialog.Builder(activity)
                    .setTitle("Rate us if you like the app")
                    .setBackgroundColor(Color.parseColor("#303F9F"))  //Don't pass R.color.colorvalue
                    .setMessage("Do you really want to Exit ?")
                    .setNegativeBtnText("Cancel")
                    .setPositiveBtnBackground(Color.parseColor("#FF4081"))  //Don't pass R.color.colorvalue
                    .setPositiveBtnText("Rate")
                    .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                    .setAnimation(Animation.POP)
                    .isCancellable(true)
                    .setIcon(R.drawable.ic_star_border_black_24dp, Icon.Visible)
                    .OnPositiveClicked { Toast.makeText(activity, "Rate", Toast.LENGTH_SHORT).show() }
                    .OnNegativeClicked { Toast.makeText(activity, "Cancel", Toast.LENGTH_SHORT).show() }
                    .build()
        })
    }
}