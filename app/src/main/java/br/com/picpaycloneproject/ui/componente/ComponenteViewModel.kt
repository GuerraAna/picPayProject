package br.com.picpaycloneproject.ui.componente

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComponenteViewModel: ViewModel(){

    private val _componentes = MutableLiveData<Componente>().also {
        it.value = temComponente
    }
    val componente: LiveData<Componente> = _componentes

    var temComponente = Componente()
    set(value) {
        field = value
        _componentes.value
    }
}

data class Componente(
        val bottomNavigation: Boolean = false
)