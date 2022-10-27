import './truth2.css';
import {Link} from 'react-router-dom';




function Truth2(){
    return(
        <div>
            <div className='truth-two'>
                <Link to='/ttaal'>
                    <button className='try-again'>TRY AGAIN</button>
                </Link>
            THIS WAS A TRUTH!!!
            </div>
        </div>
    );
}


export default Truth2;
