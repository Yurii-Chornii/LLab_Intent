import {IButton} from "../../interfaces";
import "./Button.scss";



export default function Button (props: IButton){
    const {addNewTodo} = props;

    return (
        <button onClick={() => addNewTodo()}>Add new</button>
    );
}
