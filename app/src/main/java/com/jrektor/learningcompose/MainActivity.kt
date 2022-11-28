package com.jrektor.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jrektor.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposeTheme {
                // A surface container using the 'background' color from the theme
                ElementApp()
            }
        }
    }
}

@Composable
fun ElementApp() {
    //panggil data dari fun loadElement
    ElementList(elementList = Datalist().loadElement())
}

@Composable
fun ElementList(elementList: List<Element>, modifier: Modifier = Modifier) {
    //tampilkan list menggunakan LazyColumn
    //import yang items(list->lazy)
    LazyColumn { 
        items(elementList) {item -> ElementCard(item) }
    }
}

@Composable
fun ElementCard(item: Element, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(item.icon),
                contentDescription = stringResource(id = item.name),
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp), contentScale = ContentScale.Crop)

            Text(text = LocalContext.current.getString(item.name), modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.h5)
            Text(text = LocalContext.current.getString(item.major), modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.h6)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementCardPreview(){
    ElementCard(item = Element(R.string.name1,R.string.major1,R.drawable.ic_launcher_foreground))
    ElementCard(item = Element(R.string.name2,R.string.major2,R.drawable.ic_launcher_background))
}

