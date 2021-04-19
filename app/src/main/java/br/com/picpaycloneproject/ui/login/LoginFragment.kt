package br.com.picpaycloneproject.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.picpaycloneproject.R
import br.com.picpaycloneproject.data.transacao.Usuario
import br.com.picpaycloneproject.data.transacao.UsuarioLogado
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View?{
            return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLogin.setOnClickListener {
            UsuarioLogado.usuario = Usuario("joaovf")
            vaiParaHome()
        }
    }

    private fun vaiParaHome() {
        val direcao =
            LoginFragmentDirections.actionLoginFragmentToNavigationHome()
        val controlador = findNavController()
        controlador.navigate(direcao)
    }
}