import {observer} from "mobx-react-lite";
import MainStore from "../../stores/MainStore";
import "./TodoList.scss"
import Todo from "../Todo/Todo";
import {ChangeEvent, useState} from "react";

const TodoList = observer(() => {
    const [inputValue, setInputValue] = useState("");
    const isSignedIn = MainStore.isSignedIn;

    const inputHendler = (e: ChangeEvent<HTMLInputElement>) => {
        setInputValue(e.target.value);
    }

    if (!isSignedIn) {
        return (
            <h2>You need to sign in</h2>
        )
    }

    return (
        <div>
            {MainStore.todos.map(value => <Todo key={value.id} todo={value}/>)}
            <div className="todo">
                <form className="todo__form" onSubmit={(e) => {
                    e.preventDefault();
                    MainStore.addNewTodo(inputValue);
                    setInputValue("")
                }}>
                    <input type="text" value={inputValue} onChange={inputHendler}/>
                    <button>add new task</button>
                </form>
            </div>
        </div>
    );
})

export default TodoList;
