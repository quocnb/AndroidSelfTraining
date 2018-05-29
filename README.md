# From SWIFT to KOTLIN

### Why I wrote it?
When have nothing to do, I tried to convert my apps to Android (for learning purpose only).

In the future, I will forget all that I've learned today. So I decided to memo it for help myself when I have free time again :D

## Start
|Swift|Kotlin|
|--|--|
|AppDelegate|`AndroidManifest.xml`|
|ViewController| [`Activity`](https://developer.android.com/reference/android/app/Activity)|
|Xib|xml file in `res/layout`|
|Assets|`res/drawable`|
|Constant file|`res/value` (style, color, string)|
|Extension|fun like `Ext.func()`|
## 1. View
|Swift|Kotlin|
|--|--|
|UITableView|`RecyclerView`|
|UICollectionView|`GridView`|
|UILabel|`TextView`|
|UIButton|`Button` / `ImageButton`|
|UITextField|`EditText`|
|UIImageView|`ImageView`|

#### [View Helper](./ViewHelper)

## 2. ViewFlow
|Swift|Kotlin|
|--|--|
|Present|Default|
|Push|Custom animation|
|Back|Set `parentActivityName` in `Manifest`|

#### [View Flow](./ViewFlow)
