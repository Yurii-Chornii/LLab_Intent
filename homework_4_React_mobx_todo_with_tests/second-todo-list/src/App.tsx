import {BrowserRouter as Router, Route, Switch} from "react-router-dom";

import {IRoute} from "./interfaces/IRoute";
import './App.scss';
import TodoList from "./components/TodoList/TodoList";
import SignIn from "./components/SignIn/SignIn";
import SignUp from "./components/SignUp/SignUp";
import Header from "./components/Header/Header";


const routes: IRoute[] = [
    {
        id: 1,
        exact: true,
        path: '/',
        component: <TodoList/>
    },
    {
        id: 2,
        path: '/signIn',
        component: <SignIn/>
    },
    {
        id: 3,
        path: '/signUp',
        component: <SignUp/>
    }
];

const App = () => {


    return (
        <div>
            <Header/>

            <Router>
                <Switch>
                    {routes.map(el => (
                        <Route key={el.id} exact={el.exact || false} path={el.path}>
                            {el.component}
                        </Route>
                    ))}
                </Switch>
            </Router>
        </div>
    );
}

export default App;
