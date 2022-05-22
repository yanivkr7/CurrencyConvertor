package yanivk.app.currencyconvertor.ui.todo_list

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import yanivk.app.currencyconvertor.data.TodoRepository
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    val todos = repository.getTodos()
}