import "./Header.scss";

export default function Header (){
    const title: string = "Todo list"
    return (
        <header className="header">
            <h1 className="header__title">{title}</h1>
        </header>
    );
}
