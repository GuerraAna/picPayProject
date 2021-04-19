package br.com.picpaycloneproject.data.transacao

object UsuarioLogado {

    lateinit var usuario: Usuario

    fun isUsuarioLogado() = this::usuario.isInitialized

    fun isUsuarioNaoLogado() = !isUsuarioLogado()
}