import './Login.css';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import services from '../../services/services';
import Notification from '../Notification/Notification';
import { useState } from 'react';

function Login() {
    localStorage.removeItem("token");
    const navigate = useNavigate()
    const [showNotification, setShowNotification] = useState(false);
    function capturarNombreContranseña(e) {
        e.preventDefault();
        const usuario = e.target.correo.value;
        const contraseña = e.target.contraseña.value;

        console.log(usuario);
        console.log(contraseña);

        services.login(usuario,contraseña).then(response =>{
            console.log(response);
            if(response.data[0].data) {
                var tokenSession = response.data[0].tokenSession;
                localStorage.setItem("token", tokenSession);
                localStorage.setItem("usuarioCorreo", usuario);
                //localStorage.getItem("token");
                
                navigate('/home');
            } else {
                console.log(response.data[0].errorMessage);
                setShowNotification(true);
            }
        });

        e.target.correo.value = "";
        e.target.contraseña.value = "";
        setTimeout(() => {
            setShowNotification(false);
        }, 2000);
    }

    return(
        <div>
            <h3>Login</h3>
            <div className ="log">
                <form onSubmit={capturarNombreContranseña}>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Correo</label>
                        <input type="email" class="form-control" id="correo" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" id="contraseña"></input>
                    </div>
                    <div className='mb-3 sign-up'>
                        ¿No tienes cuenta? <Link className={'link'} to={'/registrarte'}>Registrate</Link>
                    </div>
                    <button type="submit" class="btn btn-primary">Iniciar sesión</button>
                    </form>
            </div>
            {showNotification ? <Notification data={{status:'warning',message:'No existe el usuario.'}} />:<></>}
        </div>
    );
}

export default Login;