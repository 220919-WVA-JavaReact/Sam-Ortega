import './home.css';

import TTAAL from '../ttaal/ttaal';
import {Link} from 'react-router-dom';

function Home(){
    return(
        <div className="home">
            <Link to='/'>
                <button className='home-bttn'>HOME</button>
            </Link>
            <Link to='/ttaal'>
                <button className='ttaal-bttn'>TTAAL</button>
            </Link>
            <h1 className='welcome'>Welcome to my about me!</h1>
            {/* <Link to='/about'>
                <button className='about-bttn'>ABOUT</button>
            </Link> */}

        </div>
    )
}

export default Home;
