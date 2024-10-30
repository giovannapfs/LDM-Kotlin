package projeto.interdisciplinar.appdsm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import projeto.interdisciplinar.appdsm.roomDB.Pessoa

class PessoaViewModel(private val repository : Repository):ViewModel() {

    fun getPessoa() = repository.getAllPessoas().asLiveData(viewModelScope.coroutineContext)

    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }

    fun deletePessoa(pessoa : Pessoa) {
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}


