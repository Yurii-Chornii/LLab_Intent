import Input from "../input/Input";
import {useState} from "react";
import Button from "../button/Button";
import TodoItem from "../todoItem/TodoItem";
import "./TodoList.scss"
import {ITodo} from "../../interfaces";



export default function TodoList() {
    const [todos, setTodos] = useState([
        {
            id: 1,
            task: "buy a bread"
        },
        {
            id: 2,
            task: "buy a Coca"
        },
        {
            id: 3,
            task: "buy a chicken"
        }
    ]);

    const [inputValue, setInputValue] = useState('buy smth');
    const handleInputState = (value: string): void => {
        setInputValue(value);
    }
    const addNewTodo = (): void => {
        setTodos((prevState: ITodo[]) => {
            const newId = prevState.length + 1;
            return [...prevState, {id: newId, task: inputValue}]
        })
    }



    return (
        <div className="todo-list">
            <div className="todo-list__form-wrapper">
                <form onSubmit={(e) => {e.preventDefault()}}>
                    <Input handleInputState={handleInputState} defaultValue={inputValue}/>
                    <Button addNewTodo={addNewTodo}/>
                </form>
            </div>
            <div>
                {todos.map(todo => (<TodoItem key={todo.id} todo={todo}/>))}
            </div>
        </div>
    );
}
