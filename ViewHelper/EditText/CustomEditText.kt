package com.sothink.jancodereader

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.widget.EditText

class CustomEditText: EditText {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)
    override fun onKeyPreIme(keyCode: Int, event: KeyEvent?): Boolean {
        if (event?.action == KeyEvent.ACTION_DOWN && event?.keyCode == KeyEvent.KEYCODE_BACK) {
            this.isCursorVisible = false
        }
        return super.onKeyPreIme(keyCode, event)
    }
}