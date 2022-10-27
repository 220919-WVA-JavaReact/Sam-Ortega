import './ttaal.css';
import {Link} from 'react-router-dom';





function TTAAL(){
    return(
        <div className="TTAAl">
            <Link to='/truth1' className='t1'>
                <button className='first'>I worked for a lady that sold exotic animals, and I had to clean up / feed them.</button>
            </Link>
            <Link to='/lie' className='l'>
                <button className='second'>I once accidentally gave my aunt "holy water" when she was thirsty.</button>
            </Link>
            <Link to='/truth2' className='t2'>
                <button className='third'>I drove through a hurricane with my friends to go eat chinese food.</button>
            </Link>
        </div>
    );
};


export default TTAAL;
