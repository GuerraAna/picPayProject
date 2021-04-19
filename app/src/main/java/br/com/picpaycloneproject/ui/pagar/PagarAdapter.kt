package br.com.picpaycloneproject.ui.pagar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.picpaycloneproject.R
import br.com.picpaycloneproject.data.transacao.Usuario
import kotlinx.android.synthetic.main.item_contato.view.*

class PagarAdapter(private val usuarios: List<Usuario>, private val onClick: () -> Unit): RecyclerView.Adapter<PagarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contato, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = usuarios.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val usuario = usuarios[position]
        holder.bind(usuario)
    }

    inner class ViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {
        fun bind(usuario: Usuario) {
            with(itemView){
                textViewLogin.text = usuario.login
                textViewNomeCompleto.text = usuario.nomeCompleto
                setOnClickListener{
                    onClick()
                }
            }
        }

    }
}