package projeto.interdisciplinar.appdsm.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface PessoaDao {

    @Upsert
    fun upsertPessoa(pessoa: Pessoa)

    @Delete
    fun deletePessoa(pessoa: Pessoa)

    @Query("SELECT * FROM pessoa")
    fun getAllPessoas(): List<Pessoa>
}