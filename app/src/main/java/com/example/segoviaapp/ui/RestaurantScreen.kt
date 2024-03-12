package com.example.segoviaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segoviaapp.R
import com.example.segoviaapp.data.RecommendationDataProvider
import com.example.segoviaapp.model.Recommendation

@Composable
fun RestaurantScreen(
) {
    val recommendationsList = RecommendationDataProvider.getRecommendationRestaurant()
    var clicked by remember {
        mutableStateOf(false)
    }
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        items(recommendationsList) {
            RestaurantCard(it, clicked = clicked, onClickedRecommendation = { clicked = !clicked })
        }
    }
}


@Composable
fun RestaurantCard(rec: Recommendation, onClickedRecommendation: () -> Unit, clicked : Boolean) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .clickable { onClickedRecommendation() },
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors()
    ) {
        Row(Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = rec.iconRecommendation), contentDescription = "",
                Modifier
                    .size(50.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = stringResource(id = rec.titleRecommendationId),
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Preview
@Composable
fun RestaurantCardPreview() {
    RestaurantScreen()
}
