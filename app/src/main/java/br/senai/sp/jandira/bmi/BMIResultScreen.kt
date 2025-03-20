import android.provider.CalendarContract.Colors
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BmiResultScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xE9001C73),
                        Color(0xE9000000),
                    )
                )
            ),

        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Your BMI Result",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(24.dp)
        )

        Card(
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(770.dp)
                .padding(top = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .size(110.dp)
                        .background(Color(0xFFFFC107), shape = CircleShape),
                   shape = CircleShape,
                    border = BorderStroke(
                        width = 5.dp,
                        color = Color.Black

                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column (
                        modifier = Modifier
                        .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "30,6",
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }


                Text(
                    text = "You have Class I Obesity.",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(20.dp)
                )


                Card(
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEDE7F6)),
                    modifier = Modifier
                        .fillMaxWidth(),

                ) {
                        Row (
                            modifier = Modifier
                                .height(60.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){
                                Text(
                                    text = " Age"
                                )
                                Text(
                                    text = "50"
                                )
                            }
                            VerticalDivider()
                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = "Weight"
                                )
                                Text(
                                    text = " 97 Kg"
                                )
                            }
                            VerticalDivider()
                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = "High"
                                )
                                Text(
                                    text = "178 cm"
                                )
                            }
                        }
                }

                HorizontalDivider(
                    modifier = Modifier
                        .padding(top = 360.dp)
                )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000F3F)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .width(700.dp)
                        .height(70.dp)




                ) {
                    Text(text = "New Calc", color = Color.White, fontSize = 25.sp)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BmiResultScreenPreview() {
    BmiResultScreen()
}
