package com.example.tmdbarhitect.presentation.people

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbarhitect.R
import com.example.tmdbarhitect.databinding.ActivityPeopleBinding

class PeopleActivity : AppCompatActivity() {
   private lateinit var binding: ActivityPeopleBinding
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this, R.layout.activity_people)
   }
}