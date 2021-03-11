import {makeAutoObservable} from "mobx";
import {ITodo} from "../interfaces/ITodo";

const idGenerator = (): number => new Date().getTime();

class MainStore{
    todos: ITodo[] = [
        {
            id: 1,
            task: "Buy a bread",
        },
        {
            id: 2,
            task: "Buy a cola",
        },
        {
            id: 3,
            task: "Buy a chips",
        },
    ];

    constructor() {
        makeAutoObservable(this);
    }

    addNewTodo(task: string): void {
        this.todos.push({
            id: idGenerator(),
            task
        })
    }


}

export default new MainStore();
