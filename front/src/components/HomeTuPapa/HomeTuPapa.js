import './HomeTuPapa.css';
import Menu from '../Menu/Menu';
import React, {useEffect, useState} from 'react';
import Services from '../../services/services';
import services from '../../services/services';
import Notification from '../Notification/Notification';



function HomeTuPapa() {
    const [polizas, setPolizas] = useState([]);
    const [showNotification, setShowNotification] = useState(false);
    useEffect(()=>{
        Services.getPolizas().then(response => {
            setPolizas(response.data);
            console.log(response.data);
            localStorage.setItem("seguros",JSON.stringify(response.data));
        }).catch(error => {
            console.log(error);
        })
    },[]);

    function onclickComprar(e,id) {
        const correo = localStorage.getItem('usuarioCorreo');
        const usuarios = JSON.parse(localStorage.getItem('usuarios'));
        const seguros = JSON.parse(localStorage.getItem('seguros'));
        const comprador = usuarios.find(e => e.correo === correo);
        const seguroComprado = seguros.find(e=> e.id === id);

        services.comprapoliza(comprador.id, comprador.nombre, comprador.correo, comprador.apellido, comprador.telefono, seguroComprado.cobertura, "total", "0" ).then(response => {
            console.log(response);
            if(response.status === 200) {
                setShowNotification(true);
                setTimeout(() => {
                    setShowNotification(false);
                }, 2000);
            } else {
                console.log(response.data[0].errorMessage);
                /* setShowNotification(true); */
            }
        });
    }

    return(
        <div>
            <Menu />
            <h3>Polizas</h3>
            <div className='container-safe'>
            {
                        polizas.map(polizas => 
                            <div class="card"  key={polizas.id}>
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR35hiKNUwXKSwFcp3flDA7eWtkPbEFrhmf_-Qb3UzC_ve1GD_6YwDGl3eZG4RAsRoF6qo&usqp=CAU" class="card-img-top" alt="..." />
                                <div class="card-body">
                                    <h5 class="card-title">{polizas.nombre}</h5>
                                    <p class="card-text description" title={polizas.descripcion}>{polizas.descripcion}</p>
                                    <p class="card-text">Valor: {polizas.valor}</p>
                                    <p class="card-text">Cobertura: {polizas.cobertura}</p>
                                    <button href="#" class="btn btn-primary" data-id={polizas.id} onClick={e => onclickComprar(e,polizas.id)}>Comprar</button>
                                </div>
                            </div>
                        )
                    }
            </div>
            {showNotification ? <Notification data={{status:'success',message:'Compra realizada con exito.'}}  />: <></>}
        </div>
    );
}

export default HomeTuPapa;