package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerInterface()
                }
            }
        }
    }
}


@Composable
fun TaskManagerInterface() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(24.dp)
        ) {

            // L'image
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed), // Remplacez par votre ressource d'image
                contentDescription = "Image du gestionnaire de tâches",
                modifier = Modifier
                    .size(128.dp)
                    .padding(top = 16.dp),
            )


            // Premier Text
            Text(
                text = "Task Manager",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )

            // Deuxième Text
            Text(
                text = "Nice work!",
                fontSize = 16.sp
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskManagerInterface() {
    TaskManagerInterface()
}

