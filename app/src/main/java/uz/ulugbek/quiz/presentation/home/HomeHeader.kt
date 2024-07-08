package uz.ulugbek.quiz.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ulugbek.quiz.R

@Preview
@Composable
fun HomeHeader() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(
                color = colorResource(id = R.color.teal_700),
                shape = RoundedCornerShape(
                    bottomStart = 40.dp,
                    bottomEnd = 40.dp
                )
            )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top= 75.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {

            Icon(
                imageVector = Icons.Rounded.Menu,
                contentDescription ="Menu",
                modifier = Modifier
                    .weight(1f)
                    .size(30.dp),
                tint = colorResource(id = R.color.black)
            )

            Text(
                text = "Quiz App",
                style = MaterialTheme.typography.titleMedium,
                fontSize = 28.sp,
                modifier = Modifier.weight(3.5f),
                textAlign = TextAlign.Center
                )

            Icon(
                imageVector = Icons.Rounded.AccountCircle ,
                contentDescription = "Profile",
                modifier = Modifier
                    .weight(1f)
                    .size(30.dp),
                tint = colorResource(id = R.color.black)
            )
        }

    }
}