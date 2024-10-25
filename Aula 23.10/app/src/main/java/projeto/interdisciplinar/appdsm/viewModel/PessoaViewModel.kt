package projeto.interdisciplinar.appdsm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import projeto.interdisciplinar.appdsm.roomDB.Pessoa

class PessoaViewModel(private val repository:Repository): ViewModel() {
    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }
}

