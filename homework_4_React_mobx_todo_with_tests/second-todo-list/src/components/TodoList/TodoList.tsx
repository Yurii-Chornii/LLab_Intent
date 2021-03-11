import {observer} from "mobx-react-lite";
import * as mobx from "mobx";
import MainStore from "../../stores/MainStore";
import "./TodoList.scss"



const TodoList = observer(() => {
    console.log(mobx.toJS(MainStore.todos));


    return (
        <div>
            {MainStore.todos.map(value => (<div>{value.task}</div>))}
        </div>
    );
})

export default TodoList;
