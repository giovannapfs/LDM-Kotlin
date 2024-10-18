package projeto.interdisciplinar.appdsm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import projeto.interdisciplinar.appdsm.ui.theme.AppDSMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDSMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Row(
            Modifier
                .padding(10.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                "App Database",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )

        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column(
                Modifier
                    .fillMaxWidth(0.2f)
            ) {
                Text(
                    "Nome:",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Column(
                Modifier
                    .fillMaxWidth(0.8f)
            ){
                TextField(
                    value = " ",
                    onValueChange = {},
                    label = { },
                    modifier = Modifier.height(15.dp)
                )
            }
        }
        Row(
            Modifier
                .padding(10.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column(
                Modifier
                    .fillMaxWidth(0.2f)
            ) {
                Text(
                    "Telefone:",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Column(
                Modifier
                    .fillMaxWidth(0.8f)
            ){
                TextField(
                    value = " ",
                    onValueChange = {},
                    label = { },
                    modifier = Modifier.height(15.dp)
                )
            }
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(
                onClick = {}
            ) {
                Text(
                    "Cadastrar",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    AppDSMTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            App()
        }
    }
}