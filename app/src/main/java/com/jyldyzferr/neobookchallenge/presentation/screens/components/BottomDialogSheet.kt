package com.jyldyzferr.neobookchallenge.presentation.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jyldyzferr.neobookchallenge.R
import com.jyldyzferr.neobookchallenge.ui.theme.MyGreen


@Composable
fun CustomDialog(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Dialog(
        onDismissRequest = {
            onDismiss()
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        Card(
            elevation = 5.dp,
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .border(2.dp, color = MyGreen, shape = RoundedCornerShape(15.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalArrangement = Arrangement.spacedBy(25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.network),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .clip(RoundedCornerShape(15.dp))
                )
                Text(
                    text = stringResource(id = R.string.network),
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.network_1),
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
