package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .background(color = Color(0x3500B0FF))
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(R.drawable.android_logo_business_card)
            Image(
                painter = image, contentDescription = null, modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .background(color = Color(0xFF083355))
            )
            Text(
                text = stringResource(R.string.name),
                textAlign = TextAlign.Center,
                fontSize = 42.sp
            )
            Text(
                text = stringResource(R.string.work_does_or_position_held),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E821E)
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 4.dp
                    ),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    Icons.Rounded.Phone, contentDescription = "Phone", modifier = Modifier
                        .padding(
                            start = 42.dp,
                            end = 20.dp
                        )
                        .size(30.dp),
                    tint = Color(0xFF1E821E)
                )
                Text(
                    text = stringResource(R.string.phone),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 3.dp,
                        bottom = 4.dp
                    ),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    Icons.Rounded.Email, contentDescription = "Email", modifier = Modifier
                        .padding(
                            start = 42.dp,
                            end = 20.dp
                        )
                        .size(30.dp),
                    tint = Color(0xFF1E821E)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 3.dp
                    ),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    Icons.Rounded.Share, contentDescription = "Share", modifier = Modifier
                        .padding(
                            start = 42.dp,
                            end = 20.dp
                        )
                        .size(30.dp),
                    tint = Color(0xFF1E821E)
                )
                Text(
                    text = stringResource(R.string.share),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}