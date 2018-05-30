# View Flow

Android has `Back` hard-button and `Back` soft-button. Don't forget to override it all

### Present
In default, show next `Activity` or back to previous `Activity` will use `iOS Present` like animation (but faster)
### Push/Pop

**Push**

To use `iOS Push` like animation, you must to create a custom animation
1. Create animation xml file in `res/anim` (you can copy it in `anim` folder)
2. `overridePendingTransition` to change the animation. Be sure you call it `AFTER` `startActivity`

```
fun Activity.show(cls: Class<*>) {
    val intent = Intent(this, cls)
    startActivity(intent)
    this.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left)
}
```

**Pop**

To control `Pop` like action, you must rewrite the tap action

1. Get `back` action by override `onOptionsItemSelected`
2. Check itemId = `home` id, change `pendingTransition`.

*You can create the RootActivity and extend it*

*In RootActivity, don't forget the `open` keyword. Without it, you can't extend*
```
open class RootActivity: AppCompatActivity() {
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        hideKeyboard(this.currentFocus)
        this.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right)
    }
}
```

### Back to previous view

Show `Back button`
```
 supportActionBar?.setDisplayHomeAsUpEnabled(true)
```

*You should hide the back button in the fist view by*
```
 supportActionBar?.setDisplayHomeAsUpEnabled(false)
```

When tap to `Back button`, it will auto back to previous view
