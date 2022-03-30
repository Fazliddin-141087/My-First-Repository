package uz.mobiler.mylibrary

import android.content.Context
import android.widget.Toast

object ToastMassage {
    fun show(context: Context,message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}