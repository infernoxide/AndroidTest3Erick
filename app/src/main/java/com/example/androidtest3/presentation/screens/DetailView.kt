package com.example.androidtest3.presentation.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidtest3.domain.model.Result
import com.example.androidtest3.presentation.composables.MainTopBar
import com.example.androidtest3.presentation.viewmodel.MainViewModel
import com.example.androidtest3.presentation.composables.ShowImage

@Composable
fun DetailView(character: Result?, navController: NavController){

//    Scaffold(
//        topBar = {
//            MainTopBar(
//                title = character?.name.toString(),
//                showBackButton = true
//            ) {
//                navController.popBackStack()
//            }
//        }
//    ) {
//        paddingValues ->
//    }

}