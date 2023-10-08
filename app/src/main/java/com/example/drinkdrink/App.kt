package com.example.drinkdrink

import android.app.Application
import com.example.drinkwith.model.UsersService

class App : Application() {
    val usersService = UsersService()
}