package com.hasanfadiloglu.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanfadiloglu.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null                    //girilecek sayıları en başta bir kez tanımla
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)       //view binding ile
        val view = binding.root                                     //görünümleri bağla
        setContentView(view)
    }

    fun sum(view : View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull() //girilen sayıları double'a çevir ya da null göster
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){ //kullanıcı sayı girerse yapılacak işlemler yazıldı
            val result = number1!! + number2!!
            binding.resultText.text = "RESULT: ${result}"
        }else{
            binding.resultText.text = "Enter The Number !!"  //kullanıcı sayı girmezse uyarı mesajı göster
        }


    }
    fun minus(view : View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            val result = number1!! - number2!!
            binding.resultText.text = "RESULT: ${result}"
        }else{
            binding.resultText.text = "Enter The Number !!"
        }


    }
    fun multiple(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            val result = number1!! * number2!!
            binding.resultText.text = "RESULT: ${result}"
        }else{
            binding.resultText.text = "Enter The Number !!"
        }


    }
    fun divide(view: View){
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            val result = number1!! / number2!!
            binding.resultText.text = "RESULT: ${result}"
        }else{
            binding.resultText.text = "Enter The Number !!"
        }


    }
}