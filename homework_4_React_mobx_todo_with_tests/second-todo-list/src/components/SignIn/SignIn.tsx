import {Link, useHistory} from "react-router-dom";
import MainStore from "../../stores/MainStore";
import {observer} from "mobx-react-lite";


const SignIn = observer(() => {
    const history = useHistory();

    if (MainStore.isSignedIn) {
        history.push("/");
    }

    const formHendler = (e: any): void => {
        e.preventDefault();

        const login = e.target[0].value;
        const password = e.target[1].value;
        MainStore.signIn(login, password);
    }

    return (
        <div className="form-wrapper">
            <h3>Sign in</h3>
            <form onSubmit={formHendler}>
                <div>
                    <label htmlFor="login">
                        Login
                        <br/>
                        <input type="text" name="login"/>
                    </label>
                </div>
                <div>
                    <label htmlFor="password">
                        Password
                        <br/>
                        <input type="password" name="password"/>
                    </label>
                </div>
                <button>Sign in</button>
            </form>
            <hr/>
            <div>
                Don't have an account?
                <Link to="/signUp">
                    <button>Sign up</button>
                </Link>
            </div>

        </div>
    );
})

export default SignIn;
