package br.com.tata.appdatabaseinsert

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.tata.appdatabaseinsert.ui.theme.AppDatabaseInsertTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppDatabaseInsertTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }

    Column (
        Modifier
            .background(Color.White)
            .fillMaxWidth()
    ){
        Row (
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            Arrangement.Center
        ){
            Text(
                text = "App Database",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row (
            Modifier
                .padding(20.dp)
        ){
        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Nome:")}
            )
        }

        Row (
            Modifier
                .padding(30.dp)
        ){
        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = {Text(text = "Telefone:")}
            )
        }

        Row (
            Modifier
                .padding(30.dp)
        ){
        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}
@Preview
@Composable
fun AppPreview() {
    AppDatabaseInsertTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}