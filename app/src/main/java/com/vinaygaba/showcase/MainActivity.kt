package com.vinaygaba.showcase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
//import com.vinaygaba.annotation.Showcase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
//                Greeting("Android")
                Column {
                    val list: List<Unit> = listOf( DefaultPreview() , DefaultPreview() )
                    list.forEach {
                        it
                    }
                }
                
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Showcase(name = "Test Name", apiLevel = 24, group = "Text", fontScale = 1f)
@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android")
    }
}
