import {ITodo} from "../../interfaces/ITodo";
import MainStore from "../../stores/MainStore";

interface ITodoProps {
    todo: ITodo;
}

const Todo = (props: ITodoProps) => {
    const {todo: {id, task}} = props;
    return (
        <div className="todo">
            {task}
            <button onClick={() => MainStore.deleteTodo(id)}>x</button>
        </div>
    );
}

export default Todo;
