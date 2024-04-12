import './Login.css';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom'

function Login() {
    const naviagte = useNavigate()
    function capturarNombreContranseña(e) {
        e.preventDefault();
        const usuario = e.target.correo.value;
        const contraseña = e.target.contraseña.value;

        console.log(usuario);
        console.log(contraseña);

        e.target.correo.value = "";
        e.target.contraseña.value = "";

        naviagte('/home')
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
        </div>
    );
}

export default Login;