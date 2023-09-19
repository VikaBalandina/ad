package com.example.ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ex1.ui.theme.Ex1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ex1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    User1(stringResource(R.string.userfirst), stringResource(R.string.usf),stringResource(R.string.text))
                    User2(stringResource(R.string.text1),stringResource(R.string.text2))
                    VoiceMessage()
                    Mess(stringResource(R.string.text3),stringResource(R.string.text4))
                }
            }
        }
    }
}

@Composable
fun User1(userfirst: String,usf: String,text: String,modifier: Modifier = Modifier) {
        Column (modifier = Modifier
                .padding(10.dp)){
            Spacer(modifier = modifier.weight(0.02f))
            Text(
                text = userfirst,
                fontSize = 40.sp,
                lineHeight = 50.sp,
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(end = 5.dp, start = 5.dp)
            )
            Spacer(modifier = modifier.weight(0.05f))
            Text(
                text = usf,
                fontSize = 40.sp,
                lineHeight = 50.sp,
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(end = 5.dp, start = 5.dp)
            )
            Spacer(modifier = modifier.weight(0.7f))
            Text(
                text = text,
                fontSize = 40.sp,
                lineHeight = 50.sp,
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(end = 5.dp, start = 5.dp)
            )
            Spacer(modifier = modifier.weight(1f))
    }
}

@Composable
fun User2(text1: String,text2: String,modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.End, modifier = Modifier
        .padding(10.dp)) {
        Spacer(modifier = modifier.weight(0.4f))
        Text(
            text = text1,
            fontSize = 40.sp,
            lineHeight = 50.sp,
            modifier = Modifier
                .background(color = Color.Cyan)
                .padding(end = 5.dp, start = 5.dp)
        )
        Spacer(modifier = modifier.weight(0.1f))
        Text(
            text = text2,
            fontSize = 40.sp,
            lineHeight = 50.sp,
            modifier = Modifier
                .background(color = Color.Cyan)
                .padding(end = 5.dp, start = 5.dp)
        )
        Spacer(modifier = modifier.weight(1f))
    }
}

@Composable
fun VoiceMessage(modifier: Modifier = Modifier){
    Column (modifier = Modifier
        .padding(10.dp)){
        Spacer(modifier = modifier.weight(9f))
        Row(modifier = Modifier
            .background(color = Color.Magenta)
//            .height(35.dp)
            )
        {
            Icon(imageVector = Icons.Filled.PlayCircle, contentDescription = null,
                Modifier
                    .padding(start = 5.dp)
//                .width(50.dp)
            )
            Icon(imageVector = Icons.Filled.BarChart, contentDescription = null,
                Modifier
                    .padding(end = 5.dp)
//                    .width(40.dp)
            )
        }
        Spacer(modifier = modifier.weight(2f))
    }
}
@Composable
fun Mess(text3: String,text4: String,modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.End, modifier = Modifier
        .padding(10.dp)) {
        Spacer(modifier = modifier.weight(2.5f))
        Text(
            text = text3,
            fontSize = 40.sp,
            lineHeight = 50.sp,
                    modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(end = 5.dp, start = 5.dp)
        )
        Spacer(modifier = modifier.weight(0.6f))
        Text(
            text = text4,
            fontSize = 40.sp,
            lineHeight = 50.sp,
                    modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(end = 5.dp, start = 5.dp)
        )
        Spacer(modifier = modifier.weight(0.2f))

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ex1Theme {
        User1("1", "2","3")
        User2("1","2")
        VoiceMessage()
        Mess("3", "4")
    }
}

