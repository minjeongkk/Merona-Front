package com.example.merona.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import com.example.merona.R
import kotlinx.android.synthetic.main.dialog_check.contentText

class ConfirmDialog(context: Context, text: String) : Dialog(context) {
    private var text: String? = null

    init {
        this.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_check)

        // 배경을 투명하게함
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        contentText.text = text

        window!!.attributes.y = 500
        window!!.attributes.gravity = Gravity.TOP + Gravity.CENTER_HORIZONTAL
    }

    fun createDialog() {
        this.show()
        this.window!!.setLayout(800, 450)
        this.setCancelable(false)

        findViewById<Button>(R.id.okBtn).setOnClickListener {
            this.cancel()
        }
    }
}