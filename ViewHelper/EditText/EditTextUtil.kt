package com.sothink.jancodereader

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.app.Activity
import android.view.View
import android.widget.EditText

fun Activity.hideKeyboard(editText: EditText) {
    editText.isCursorVisible = false
    hideKeyboard(if (currentFocus == null) editText else currentFocus)
    editText.isFocusable = false
    editText.isFocusableInTouchMode = true
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

fun Activity.showKeyboard(editText: EditText) {
// Dont forget to add `android:windowSoftInputMode="stateVisible"` to <activity> in Manifest file
    editText.requestFocus()
    editText.isCursorVisible = true
    val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(editText, InputMethod.SHOW_FORCED)
}
