package id.ergun.klikdoa.presentation.feature.base

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable

/**
 * @author erikgunawan
 * Created 29/12/22 at 16.04
 */
@Composable
fun BaseTopAppBar(
    navigateBack: () -> Unit,
    topAppBarAction: @Composable () -> Unit
) {
    TopAppBar (
        title = {},
        actions = {
            topAppBarAction()
//
        },
        navigationIcon = {
            IconButton(
                onClick = navigateBack
            ) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBack,
                    contentDescription = null,
                )
            }
        }
    )
}