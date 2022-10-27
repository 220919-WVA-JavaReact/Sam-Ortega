import './truth1.css';
import {Link} from 'react-router-dom';




function Truth1(){
    return(
        <div className='truth-one'>
            <Link to='/ttaal' className='try-again-a'>
                <button className='try-again'>TRY AGAIN</button>
            </Link>
            THIS WAS A TRUTH!!!
        </div>
    );
}


export default Truth1;
