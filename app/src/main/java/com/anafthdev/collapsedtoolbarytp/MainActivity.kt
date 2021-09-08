package com.anafthdev.collapsedtoolbarytp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
		setContentView(R.layout.activity_main)
		setSupportActionBar(findViewById<MaterialToolbar>(R.id.toolbar))
		
		findViewById<AppBarLayout>(R.id.appBar).setExpanded(false, false)
		findViewById<CollapsingToolbarLayout>(R.id.collapseToolbarLayout).apply {
			title = "Collapsed Toolbar"
			setCollapsedTitleTextColor(Color.WHITE)
			setExpandedTitleColor(Color.WHITE)
		}
	}
}