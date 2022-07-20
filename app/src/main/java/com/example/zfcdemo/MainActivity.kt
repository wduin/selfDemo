package com.example.zfcdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.ui.main.MainViewModel
import com.example.zfcdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ActivityMainBinding 对应 activity_main.xml
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        textView = binding.textview
        button = binding.button

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // 给ViewModel中数据设置监听，当数据改变时，自动回调该方法
        viewModel.name.observe(this, object : Observer<String> {
            override fun onChanged(input: String?) {
                textView.text = input
            }
        })

        //点击时改变数据
        button.setOnClickListener {
            viewModel.setVal()
        }
    }
}