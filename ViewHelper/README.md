# View Helper

### 1. ImageView
- [ImageView with ratio 1:1](./ImageView/SquareImageView.kt)

### 2. Rounded Button with ripple effect
- [Rounded Button](./Button/selected_rounded_shape.xml)
- [Rounded Button with ripple effect](./Button/rounded_shape.xml)
- [Support 2 state button](./Button/corner_button_selector.xml)
```
<Button
    android:background="@drawable/corner_button_selector"
/>
```

### 3. EditText

**Android manage cursor and keyboard discretely**

- Turn off text suggestion /check spell (underline below text when typing)

```
android:inputType="textVisiblePassword"
```
- [Show/Hide keyboard (cursor too)](./EditText/EditTextUtil.kt)

*If you want to auto show keyboard, don't forget to add `android:windowSoftInputMode="stateVisible"` to <activity> in Manifest file*

*Don't forget to hide keyboard when tap to `Enter` key, or show cursor when click to editText*

```
// hide keyboard and cursor (hideKeyboard function declare above)
editText.setOnKeyListener { _, keyCode, _ ->
    if (keyCode == KeyEvent.KEYCODE_ENTER) {
        hideKeyboard(editText)
    }
    false
}

// Show cursor when click on edittext
editText.setOnClickListener {
    (it as EditText).isCursorVisible = true
}
```

- When keyboard show, and you tap to DOWN button (bottom BACK button). If you want to hide the cursor, using [this file](./EditText/CustomEditText.kt)
