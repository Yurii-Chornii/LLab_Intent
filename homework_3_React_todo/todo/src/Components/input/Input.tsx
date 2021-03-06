import {useState} from "react";
import {IInput} from "../../interfaces";

export default function Input(props: IInput) {
    const {handleInputState, defaultValue} = props;

    const [inputValue, setInputValue] = useState(defaultValue);

    const inputHendler = (e: React.ChangeEvent<HTMLInputElement>) => {
        const newValue: string = e.target.value;
        setInputValue(newValue);
        handleInputState(newValue);
    }


    return (
        <input type="text" defaultValue={inputValue} onChange={inputHendler}/>
    );
}
