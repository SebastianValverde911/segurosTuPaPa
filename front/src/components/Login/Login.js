import './Login.css'
function Login() {

    function capturarNombreContranseña(e) {
        e.preventDefault();
        const usuario = e.target.usuario.value;
        const contraseña = e.target.contraseña.value;

        console.log(usuario);
        console.log(contraseña);

        e.target.usuario.value = "";
        e.target.contraseña.value = "";

    }

    return(
        <div>
            <h3>Login</h3>
            <div className ="log">
                <form onSubmit={capturarNombreContranseña}>
                    <p>Usuario</p>
                    <p>
                        <input className="input" name="usuario"></input>
                    </p>
                    <p>Contraseña</p>
                    <p>
                        <input className="input" name="contraseña"></input>
                    </p>
                    <button className="btnSingIn">Iniciar sesion</button>
                </form>
            </div>
        </div>
    );
}

export default Login;