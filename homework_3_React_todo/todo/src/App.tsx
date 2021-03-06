import Header from "./Components/header/Header";
import TodoList from "./Components/todoList/TodoList";


export default function App() {

    return (
        <div>
            <Header/>
            <section>
                <TodoList/>
            </section>
        </div>
    );
}
