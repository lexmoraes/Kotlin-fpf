package com.example.bitacademy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bitacademy.ui.theme.BitAcademyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BitAcademyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ExemploTexto(mensagem: String) {
    Text(text = "Olá, $mensagem")
}

@Composable
fun ExemploBotão() {
    Button(onClick = {}) {
        Text(fontSize = 10.sp, text = "Login")
    }
}

@Composable
fun ExemploImagem() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "",
        modifier = Modifier
            .size(256.dp)
            .padding(10.dp)
    )
}

@Composable
fun ExemploTextField() {
    var texto by remember { mutableStateMapOf("") }
    TextField(
        value = texto,
        onValueChange = { texto = it }
        label = { Text(text = "") }
    )
}

@Composable
fun ExemploCard() {
    Card (
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Título do card", style = MaterialTheme.typography.headlineMedium)
            Text(text = "Conteúdo do card.")
        }
    }
}

@Composable
fun ExemploTopAppBar() {
    TopAppBar(
        title = { Text("Minha AppBar") },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon((Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Default.Search, contentDescription = "Buscar")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BitAcademyTheme {
        Greeting("Android")
    }
}