package ru.tech.prokitchen.presentation.app.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import ru.tech.prokitchen.R
import ru.tech.prokitchen.presentation.ui.utils.provider.LocalDialogController
import ru.tech.prokitchen.presentation.ui.utils.provider.close
import ru.tech.prokitchen.presentation.ui.utils.provider.currentDialog


@Composable
fun AboutAppDialog() {
    val dialogController = LocalDialogController.current
    val context = LocalContext.current

    AlertDialog(
        title = { Text(stringResource(R.string.about_app)) },
        text = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Plank(
                    context = context,
                    url = "https://github.com/T8RIN",
                    image = "https://avatars.githubusercontent.com/u/52178347?v=4",
                    text = "T8RIN - mobile app developer"
                )
                Spacer(Modifier.height(20.dp))
                Plank(
                    context = context,
                    url = "https://github.com/Tannec",
                    image = "https://avatars.githubusercontent.com/u/74925839?v=4",
                    text = "Tannec - website and api developer"
                )
            }
        },
        onDismissRequest = { dialogController.close() },
        icon = { Icon(dialogController.currentDialog.icon, null) },
        confirmButton = {
            TextButton(onClick = { dialogController.close() }) {
                Text(stringResource(R.string.okk))
            }
        },
    )
}

@Composable
private fun Plank(context: Context, url: String, image: String, text: String) {
    Row(
        Modifier
            .clip(CircleShape)
            .clickable {
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(url)
                    )
                )
            }, verticalAlignment = Alignment.CenterVertically
    ) {
        var shimmerVisible by rememberSaveable { mutableStateOf(true) }

        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .shimmer(shimmerVisible),
            onSuccess = { shimmerVisible = false }
        )

        Spacer(Modifier.weight(1f))
        Text(text, textAlign = TextAlign.Center, modifier = Modifier.padding(end = 10.dp))
    }
}