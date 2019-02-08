# Switcher (Java Version)

Original library is coded in kotlin by [Alexander Kolpakov](https://github.com/bitvale/Switcher)

<img src="/art/preview.gif" alt="sample" title="sample" width="260" height="390" align="right" vspace="52" />

Created this cool [switch animation](https://dribbble.com/shots/5429846-Switcher-XLIV) from [Oleg Frolov](https://dribbble.com/Volorf) as an android library.

USAGE
-----

Just add Switcher view in your layout XML and Switcher library in your project via Gradle:

```gradle
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
    ...
  }
}
dependencies {
  implementation 'com.github.sigma1326:NiceSwitch:1.0'
}
```

XML
-----

```xml
<com.sigma.niceswitch.NiceSwitch // or NiceSwitchRound
    android:id="@+id/switcher"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:switcher_on_color="@color/on_color"
    app:switcher_off_color="@color/off_color"
    app:switcher_icon_color="@color/icon_color" />
```

You must use the following properties in your XML to change your Switcher.


##### Properties:

* `android:checked`                 (boolean)   -> default  true
* `app:switcher_on_color`           (color)     -> default  #48ea8b
* `app:switcher_off_color`          (color)     -> default  #ff4651
* `app:switcher_icon_color`         (color)     -> default  white

Java
-----

```java
 niceSwitch.setOnCheckedChangedListener(checked -> {
     if(checked) {
         action()
     }
 });
```