import {ITodoItem} from "../../interfaces";
import "./TodoItem.scss";

export default function TodoItem(props: ITodoItem) {
    const {todo: {id, task}} = props;
    return (
        <div className="todo-item">
            <b>{id}. </b> <span>{task}</span>
        </div>
    );
}
