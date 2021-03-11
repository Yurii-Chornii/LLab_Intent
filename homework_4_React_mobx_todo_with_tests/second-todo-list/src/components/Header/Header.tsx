import "./Header.scss"
import {observer} from "mobx-react-lite";
import MainStore from "../../stores/MainStore";
import {Link} from "react-router-dom";


const Header = observer(() => {


    return (
        <div className="header">
            {MainStore.isSignedIn ? (
                <div>
                    <b>{MainStore.getLoginedUserName() + " "}</b>
                    <button onClick={() => {
                        MainStore.signOut();
                        MainStore.setIsSignedIn(false);
                    }}>
                        sign out
                    </button>
                </div>

            ) : (
                <Link to="/signIn"><button>sign in</button></Link>
            )}
        </div>
    );
})
export default Header;
