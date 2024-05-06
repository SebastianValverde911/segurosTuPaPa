import './SignUp.css'
import services from '../../services/services';
import { useNavigate } from 'react-router-dom';
import Notification from '../Notification/Notification';
import { useState } from 'react';

function SignUp() {
    const navigate = useNavigate();
    const [showNotification, setShowNotification] = useState(false);

    function capturarNombreContranseña(e) {
        e.preventDefault();
        const nombre = e.target.nombre.value;
        const apellido = e.target.apellido.value;
        const telefono = e.target.telefono.value;
        const correo = e.target.correo.value;
        const contraseña = e.target.contraseña.value;

        services.registry(nombre,apellido,correo,telefono,contraseña).then(response =>{
            console.log(response);
            if(response.status === 200) {
                setShowNotification(true);
                setTimeout(() => {
                    setShowNotification(false);
                    navigate('/');
                }, 2000);
            } else {
                console.log(response.data[0].errorMessage);
                /* setShowNotification(true); */
            }
        });

         e.target.nombre.value = "";
         e.target.apellido.value = "";
         e.target.telefono.value = "";
         e.target.contraseña.value = "";
         e.target.correo.value = "";
    }

    return(
        <div>
            <h3>Registrarse</h3>
            <div className ="log">
                <form onSubmit={capturarNombreContranseña}>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">correo</label>
                        <input type="email" class="form-control" id="correo" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Telefono</label>
                        <input type="text" class="form-control" id="telefono" aria-describedby="emailHelp"></input>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" id="contraseña"></input>
                    </div>
                    <button type="submit" class="btn btn-primary">Registrarse</button>
                    </form>
            </div>
            {showNotification ? <Notification data={{status:'success',message:'El usuario se registro exitosamente.'}} />:<></>}
        </div>
    );
}

    export default SignUp;