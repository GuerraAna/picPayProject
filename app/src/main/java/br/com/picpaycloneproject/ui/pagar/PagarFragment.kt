package br.com.picpaycloneproject.ui.pagar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.picpaycloneproject.R
import br.com.picpaycloneproject.data.transacao.Usuario
import kotlinx.android.synthetic.main.fragment_dashboard.*
import org.koin.android.viewmodel.ext.android.viewModel

class PagarFragment : Fragment() {

    private val pagarViewModel: PagarViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configurarRecyclerView()
    }

    private fun configurarRecyclerView() {
        val listOf = listOf(
                Usuario(login = "Ana", nomeCompleto = "Ana Clara Guerra"),
                Usuario(login = "Felipe", nomeCompleto = "Felipe Guerra")
        )
        recyclerView.adapter = PagarAdapter(listOf) {

        }
    }
}