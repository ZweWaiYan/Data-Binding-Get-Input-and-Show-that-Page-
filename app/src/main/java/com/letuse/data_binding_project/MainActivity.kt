package com.letuse.data_binding_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.letuse.data_binding_project.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


//input ကနေပြီးသူ့အောက်မှာ output ပြန်ပြ

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        Comfirm_buttom.setOnClickListener {
            var person = Person(
                binding.inputUsername.text.toString() ,
                binding.inputOccupation.text.toString()
            )

            binding.person = person

        }
    }
}