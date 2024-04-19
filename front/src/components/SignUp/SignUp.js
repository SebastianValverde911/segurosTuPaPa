import './SignUp.css'
function SignUp() {

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
            <h3>Registrarse</h3>
            <div className ="log">
                <form>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Correo</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" id="exampleInputPassword1"></input>
                    </div>
                    <button type="submit" class="btn btn-primary">Registrarse</button>
                    </form>
            </div>
        </div>
    );
}

export default SignUp;