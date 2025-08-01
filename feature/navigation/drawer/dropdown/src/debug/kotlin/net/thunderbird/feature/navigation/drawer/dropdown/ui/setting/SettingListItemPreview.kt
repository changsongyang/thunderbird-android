package net.thunderbird.feature.navigation.drawer.dropdown.ui.setting

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.designsystem.PreviewWithThemes
import app.k9mail.core.ui.compose.designsystem.atom.icon.Icons

@Composable
@Preview(showBackground = true)
internal fun SettingListItemPreview() {
    PreviewWithThemes {
        SettingListItem(
            label = "Settings",
            onClick = {},
            icon = Icons.Outlined.Settings,
        )
    }
}
