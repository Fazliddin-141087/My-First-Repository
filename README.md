# EditText count error 

```bash
implementation 'com.github.Fazliddin-141087:My-First-Repository:1.0.1'
```

# Example code example xml

```bash
<EditText
        android:id="@+id/edit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toTopOf="parent" />
```

# Example code MainActivity.kt

```bash
 binding.edit.addTextChangedListener {
            ToastMassage.show(it.toString(),binding.edit,10)
   }
```


