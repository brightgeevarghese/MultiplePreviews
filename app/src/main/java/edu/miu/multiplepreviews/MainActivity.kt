package edu.miu.multiplepreviews

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.miu.multiplepreviews.ui.theme.MultiplePreviewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultiplePreviewsTheme {
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

@Preview(
    name = "Light Mode",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun GreetingPreview1() {
    MultiplePreviewsTheme {
        Scaffold { innerPadding ->
            Greeting(
                "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
fun GreetingPreview2() {
    MultiplePreviewsTheme {
        Scaffold { innerPadding ->
            Greeting("Android", modifier = Modifier.padding(innerPadding))
        }
    }
}