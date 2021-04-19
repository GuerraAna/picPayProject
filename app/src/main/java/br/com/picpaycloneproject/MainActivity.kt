package br.com.picpaycloneproject

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import br.com.picpaycloneproject.ui.componente.ComponenteViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val componenteViewModel: ComponenteViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        componenteViewModel.componente.observe(this, Observer {
            it?.let { temComponentes ->
                if (temComponentes.bottomNavigation){
                    navView.visibility = VISIBLE
                }else {
                    navView.visibility = GONE
                }
            }
        })
        navView.setupWithNavController(navController)
    }
}