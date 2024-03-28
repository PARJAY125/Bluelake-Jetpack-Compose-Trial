package com.example.jetpackcomposebluelake.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun inOutTransaction(){
Column(
    modifier = Modifier
        .fillMaxWidth()
) {

}
}
@Preview(showBackground = true)
@Composable
fun inOutTransactionPreview() {
    JetpackComposeBluelakeTheme {
        inOutTransaction()

    }
}