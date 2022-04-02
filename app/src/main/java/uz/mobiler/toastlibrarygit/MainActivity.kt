package uz.mobiler.toastlibrarygit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import androidx.core.widget.addTextChangedListener
import uz.mobiler.toastlibrarygit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edit.addTextChangedListener {
            
        }
    }

}