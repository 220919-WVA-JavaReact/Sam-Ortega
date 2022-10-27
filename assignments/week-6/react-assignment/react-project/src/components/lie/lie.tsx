import './lie.css';
import {Link} from 'react-router-dom';




function Lie(){
    return(
        <div>
            <div className='the-lie'>
                <Link to='/ttaal'>
                    <button className='go-back'>GO BACK</button>
                </Link>
            THIS WAS THE LIE! HAHAHAH!!!
            </div>
        </div>
    );
}


export default Lie;
