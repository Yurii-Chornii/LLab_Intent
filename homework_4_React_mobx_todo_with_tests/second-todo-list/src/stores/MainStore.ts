import {makeAutoObservable} from "mobx";
import {ITodo} from "../interfaces/ITodo";

const idGenerator = (): number => new Date().getTime();

class MainStore {
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
    isSignedIn: boolean = false;

    constructor() {
        makeAutoObservable(this);
    }

    addNewTodo(task: string): void {
        this.todos.push({
            id: idGenerator(),
            task
        })
    }

    deleteTodo(id: number): void {
        this.todos = this.todos.filter(value => value.id !== id);
    }

    signUp(login: string, password: string): void {
        let users = localStorage.getItem("users");
        const newUser = {id: idGenerator(), login, password};

        if (users === null || !Array.isArray(JSON.parse(users))) {
            localStorage.setItem("users", JSON.stringify([newUser]));
        } else if (Array.isArray(JSON.parse(users))) {
            if ([...JSON.parse(users)].findIndex(value => value.login === login) < 0) {
                localStorage.setItem("users", JSON.stringify([...JSON.parse(users), newUser]));
                alert("You have created your account! Please, sign in!")
            } else {
                alert("This Login already exists! Try another login!")
            }
        }
    }

    signIn(login: string, password: string): void {
        let users = localStorage.getItem("users");

        if (users === null || !Array.isArray(JSON.parse(users))) {
            alert("You need to create your account!")
        } else if (Array.isArray(JSON.parse(users))) {
            if ([...JSON.parse(users)].findIndex(value => value.login === login && value.password === password) >= 0) {
                localStorage.setItem("loginedUser", JSON.stringify({login, password}));
                this.isSignedIn = true;
            } else {
                alert("Wrong login or password");
            }
        }
    }

    signOut(): void {
        localStorage.removeItem("loginedUser");
    }

    setIsSignedIn(status: boolean): void {
        this.isSignedIn = status;
    }
    getLoginedUserName(): string {
        const login = localStorage.getItem("loginedUser");
        return login === null ? '' : JSON.parse(login).login;
    }
}

export default new MainStore();


// else if (Array.isArray(JSON.parse(users))){
//     if ([...JSON.parse(users)].findIndex(value => value.login === login) > 0){
//         alert("This login is not found!")
//     }else{
//         localStorage.setItem("loginedUser", JSON.stringify({login, password}))
//     }
// }
