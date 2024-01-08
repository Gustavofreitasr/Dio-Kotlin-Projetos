enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na formação $nome.")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)
    
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))

    val usuario1 = Usuario()
    val usuario2 = Usuario()

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
}
