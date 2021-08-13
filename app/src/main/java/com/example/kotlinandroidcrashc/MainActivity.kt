package com.example.kotlinandroidcrashc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.kotlinandroidcrashc.ui.theme.MyFontFamily
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text="Hello Kotlin Jetpack", fontSize = 30.sp)
//            Disp1()
//            Disp2("Sonam")
//            Disp3()
//            Disp4()
//            SimpleText()
//            LongText()
//            SelectableText()
//            PartiallySelectableText()
//            RowExample()
//            ColumnExample()
//            LazyRowExample()
//            LazyColumnExample()
//            BoxExample()
//            MaterialUIApp()
//            ImageAssetExample()
//            ImageNetworkExample()
//            IconExample()
//            CardExample()
//            StatefulExample()
//            HelloScreen()
//            ButtonsExample()
//            TextFieldExample()
            Registration()
        }
    }
}

@Composable
fun Disp1(){
    Text(text="Hello Compose", fontSize = 30.sp)
}

@Composable
fun Disp2(name:String){
    Text(text="Hello $name", fontSize = 30.sp)
}

@Composable
fun Disp3(){
    Column {
        Text(text = "Hello Sonam", fontSize = 30.sp)
        Text(text = "Hello Rahul", fontSize = 30.sp)
        Text(text = "Hello Sumit", fontSize = 30.sp)
        Text(text = "Hello Ali", fontSize = 30.sp)
    }
}

@Composable
fun Disp4(){
    val names = listOf<String>("Sonam", "Rahul", "Sumit", "Ali")
    Column {
        for (name in names){
            Text(text = "Hello $name", fontSize = 30.sp)
        }
    }
}

@Composable
fun SimpleText(){
    Text(
        text = "Hello Kotlin",
        fontSize = 30.sp,
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
//        fontFamily = MyFontFamily,
    textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Yellow)
            .width(410.dp)
    )
}

@Composable
fun LongText(){
    Text(text="Jetpack ".repeat(10), fontSize = 30.sp, maxLines = 2)
}

@Composable
fun SelectableText(){
    SelectionContainer {
        Text(text = "Hello This is Kotlin Jetpack Compose", fontSize = 30.sp)
    }
}

@Composable
fun PartiallySelectableText(){
    Column {
        SelectionContainer {
           Column {
               Text(text = "This is Selectable text", fontSize = 30.sp)
               DisableSelection {
                   Text(text = "This is Non Selectable text", fontSize = 30.sp)
               }
           }
        }
        Text(text = "This is Non Selectable text", fontSize = 30.sp)
    }
}

@Composable
fun RowExample(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.LightGray)
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Text(text = "First ", fontSize = 30.sp)
        for (i in 0..50){
            Text(text = "Item $i", fontSize = 30.sp)
        }
        Text(text = "Last ", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample(){
   Column(
       modifier = Modifier
           .fillMaxSize()
           .background(color = Color.LightGray)
           .verticalScroll(rememberScrollState()),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally,
   ) {
       Text(text = "First ", fontSize = 30.sp)
       for (i in 0..50){
           Text(text = "Item $i", fontSize = 30.sp)
       }
       Text(text = "Last ", fontSize = 30.sp)
   }
}

@Composable
fun LazyRowExample(){
    LazyRow(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
        contentPadding = PaddingValues(horizontal = 100.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(50.dp)
    ){
        //  Add a Single Item
        item { Text(text = " First Item ", fontSize = 30.sp) }

        //  Add a Multiple Items
        items(50) { i -> Text(text = " Item $i", fontSize = 30.sp) }

        //  Add a Single Item
        item { Text(text = " Last Item ", fontSize = 30.sp) }
    }
}

@Composable
fun LazyColumnExample(){
    LazyColumn(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 100.dp),
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ){
        //  Add a Single Item
        item { Text(text = " First Item ", fontSize = 30.sp) }

        //  Add a Multiple Items
        items(50) { i -> Text(text = " Item $i", fontSize = 30.sp) }

        //  Add a Single Item
        item { Text(text = " Last Item ", fontSize = 30.sp) }
    }
}

@Composable
fun BoxExample(){
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)
            .background(color = Color.Yellow)
    ){
        Text(text = "This is Outer Box.........")
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color.Blue)
        ) {
            Text(
                text = "This is Inner Box",
                color=Color.Red,
                modifier = Modifier.align(Alignment.Center),)
        }
        Text(
            text = "This is Box",
            color=Color.Red,
            modifier = Modifier.align(Alignment.Center),)
    }
}

@Composable
fun MaterialUIApp(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Material App")
                },
                actions = {
                    IconButton(
                        onClick = {
                            Log.d(
                                "ButtonClicked",
                                "Search Button Clicked")
                        }) {
                        Icon(Icons.Filled.Search, contentDescription = null)
                    }
                }
            )
        }
    ) {
        LazyColumnExample()
    }
}

@Composable
fun ImageAssetExample(){
    Image(
        painter = painterResource(id = R.drawable._3),
        contentDescription = "Profile Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .border(5.5.dp, Color.Red, CircleShape)
            .size(300.dp)
            .clip(shape = CircleShape)
    )
}

@Composable
fun ImageNetworkExample(){
    Image(
        painter = rememberImagePainter(
            data = "https://cdn.pixabay.com/photo/2018/01/29/17/01/woman-3116587_960_720.jpg"
        ),
        contentDescription = "Profile Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape)
            .border(5.5.dp, Color.Red, CircleShape)
    )
}

@Composable
fun IconExample(){
    Icon(
        Icons.Filled.Menu,
        contentDescription = "Menu",
        modifier = Modifier.size(50.dp),
        tint = Color.Red
    )
}

@Composable
fun CardExample() {
    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.Gray,
        border = BorderStroke(5.dp, Color.Red),
        contentColor = Color.White,
    ) {
        Column(modifier = Modifier.padding(40.dp)) {
            Text(
                text = "This is Card",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                )
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "Jetpack",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                )
        }
    }
}

@Composable
fun StatefulExample(){
    var name:String by remember { mutableStateOf("")}
    Column {
        OutlinedTextField(value = name, onValueChange = {name = it})
        Text(text = name, fontSize = 30.sp)
    }
}

// State Hoisting
@Composable
fun HelloScreen(){
    var name:String by remember { mutableStateOf("")}
    HelloContent(name = name, OnNameChange = {name = it})
}

@Composable
fun HelloContent(name:String, OnNameChange:(String) -> Unit){
    Column {
        OutlinedTextField(value = name, onValueChange = OnNameChange)
        Text(text = name, fontSize = 30.sp)
    }
}

@Composable
fun ButtonsExample(){
    Column {
        Button(
            onClick = {Log.d("Button", "Button Clicked")},
            modifier = Modifier.padding(30.dp),
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp,end = 40.dp, bottom = 20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            shape = CircleShape,
            border= BorderStroke(1.dp, Color.Blue),
        ) {
            Text(text = "Button", fontSize = 24.sp)
        }

        TextButton(
            onClick = { Log.d("TextButton", "Text Button Clicked") },
            modifier = Modifier.padding(30.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.Red)
        ) {
            Text(text = "Text Button", fontSize = 24.sp)
        }

        OutlinedButton(
            onClick = { Log.d("OutlineButton", "Outline Button Clicked") },
            modifier = Modifier.padding(30.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.Red),
            border= BorderStroke(1.dp, Color.Blue),
            shape = CircleShape,
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp),
        ) {
            Text(text = "Outlined Button", fontSize = 24.sp)
        }

        IconButton(
            onClick = { Log.d("IconButton", "Icon Button Clicked") },
            modifier = Modifier
                .padding(30.dp)
                .then(Modifier.size(50.dp))
                .border(1.dp, Color.Red, shape = CircleShape)
        ) {
            Icon(Icons.Default.Add, contentDescription = "icon Button", tint = Color.Red)
        }

        FloatingActionButton(
            onClick = { Log.d("FloatingActionButton", "Floating Action Button Clicked") },
            modifier = Modifier.padding(30.dp),
            backgroundColor = Color.Yellow,
        ) {
            Icon(
                Icons.Default.Add,
                contentDescription = "Floating Action Button",

                )
        }

    }
}

@Composable
fun TextFieldExample(){
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        item {
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Name")},
                placeholder = { Text(text = "Write your name")},
                textStyle = TextStyle(color=Color.Blue),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Green,
                    unfocusedIndicatorColor = Color.Transparent
                ),
//                readOnly = true,
//                singleLine = true,
            )
        }
        item{
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Email")},
                placeholder = { Text(text = "Write your email")},
                textStyle = TextStyle(color=Color.Blue) ,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    unfocusedIndicatorColor = Color.DarkGray
                ),
//                readOnly = true,
//                singleLine = true,
            )
        }
        item {
            OutlinedTextField(
                value = "Password",
                onValueChange = {},
                label = { Text(text = "Password")},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    unfocusedIndicatorColor = Color.DarkGray
                ),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
    }
}

@Composable
fun Registration(){
    var name:String by remember { mutableStateOf("") }
    var email:String by remember { mutableStateOf("") }
    var password:String by remember { mutableStateOf("") }

    LazyColumn(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp),
        verticalArrangement =  Arrangement.spacedBy(10.dp),
    ) {

        item {
            OutlinedTextField(
                value = name,
                onValueChange = {name = it},
                label = { Text(text = "Name")},
            )
        }

        item {
            OutlinedTextField(
                value = email,
                onValueChange = {email = it},
                label = { Text(text = "Email")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
        }
        item {
            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                label = { Text(text = "Password")},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
        item {
            Button(
                onClick = { Log.d("SubmitButton", "Name: $name Email $email Password: $password") },
                contentPadding = PaddingValues(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp),
                colors = ButtonDefaults.buttonColors(contentColor =  Color.White, backgroundColor = Color.DarkGray),
                shape = CircleShape,
            ) {
                Text(text = "Submit")
            }
        }
    }
}


