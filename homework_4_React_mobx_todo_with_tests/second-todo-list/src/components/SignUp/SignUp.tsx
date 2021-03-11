import {Link, useHistory} from "react-router-dom";
import {observer} from "mobx-react-lite";
import MainStore from "../../stores/MainStore";
import "./SignUp.scss"

const SignUp = observer(() => {
    const history = useHistory();

    const formHendler = (e: any): void => {
        e.preventDefault();

        const login = e.target[0].value;
        const password = e.target[1].value;
        const password2 = e.target[2].value;

        if(login && password && password === password2){
            MainStore.signUp(login, password);
            history.push("./signIn");
        } else {
            alert("Login or password is not valid. Try again!")
        }
    }

    return (
        <div className="form-wrapper">
            <h3>Sign up</h3>
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
                <div>
                    <label htmlFor="repead-password">
                        Repead your password
                        <br/>
                        <input type="password" name="repead-password"/>
                    </label>
                </div>
                <button>Sign up</button>
            </form>
            <hr/>
            <div>
                Already have an account?
                <Link to="/signIn"><button>Sign in</button></Link>
            </div>
        </div>
    );
})

export default SignUp;
