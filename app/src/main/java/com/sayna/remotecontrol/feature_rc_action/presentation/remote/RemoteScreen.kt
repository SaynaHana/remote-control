package com.sayna.remotecontrol.feature_rc_action.presentation.remote

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sayna.remotecontrol.feature_rc_action.domain.model.RCAction
import com.sayna.remotecontrol.feature_rc_action.presentation.remote.components.DefaultButton

@Composable
fun RemoteScreen(
    viewModel: RemoteViewModel = hiltViewModel()
) {

    val state = viewModel.state.value
    var testData: MutableList<RCAction> = mutableListOf(
        RCAction(
            title = "aloo",
            code = "aloo",
            color = Color.White.toArgb(),
        ),
        RCAction(
            title = "aloo2",
            code = "aloo2",
            color = Color.White.toArgb(),
        ),
        RCAction(
            title = "aloo3",
            code = "aloo3",
            color = Color.White.toArgb(),
        ),
        RCAction(
            title = "aloo4",
            code = "aloo4",
            color = Color.White.toArgb(),
        ),
    )

    Scaffold(
    )
    {
        Box(
            modifier = Modifier.padding(16.dp)
        ) {
            // grid that has buttons for each RC action
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(it),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(testData) {rcAction ->
                    DefaultButton(
                        rcAction = rcAction
                    )
                }
            }
        }
    }

}