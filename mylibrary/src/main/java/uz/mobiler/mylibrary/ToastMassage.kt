package uz.mobiler.mylibrary

import android.widget.EditText
import com.google.android.material.resources.MaterialResources.getDrawable

object ToastMassage {
    fun show(message:String,editText: EditText,count:Int){
         if (message.length>=count){
             editText.error = "error"
         }
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}