package ru.normno.mycustomlazylayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import ru.normno.mycustomlazylayout.ui.theme.MyCustomLazyLayoutTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCustomLazyLayoutTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                ) { padding ->
                    val state = viewModel.state.collectAsState()
                    CustomLazyLayoutScreen(
                        state = state.value,
                        actions = viewModel,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                    )

                }
            }
        }
    }
}