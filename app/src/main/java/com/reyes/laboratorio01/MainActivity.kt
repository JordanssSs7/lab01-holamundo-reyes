package com.reyes.laboratorio01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.reyes.laboratorio01.ui.theme.Laboratorio01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Jordan Reyes",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        Text(
            text = "Hola, soy  $name!",
            modifier = modifier
        )
        Text(
            text = "Curso: Programacion en Moviles"
        )
        Text(
            text = "Correo: jordan.reyes@tecsup.edu.pe"
        )

        Text(
            text = "Carrera: Diseño y desarrollo de software"
        )

        Button(onClick = { }) {
            Text("Presióname")
        }

    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio01Theme {
        Greeting("Android")
    }
}