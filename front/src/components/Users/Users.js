import Services from '../../services/services';
import './Users.css';
import React, {useEffect, useState} from 'react';
import Menu from '../Menu/Menu';

function Users() {

    const [usuarios, setUsuarios] = useState([]);
    const [facturas, setFacturas] = useState([]);

    useEffect(()=>{
        Services.getUsers().then(response => {
            setUsuarios(response.data);
            console.log(response.data);
            localStorage.setItem("usuarios",JSON.stringify(response.data));
        }).catch(error => {
            console.log(error);
        })
    },[]);

    function onclickVerFactura(e,id) {
        Services.getFacturas(id).then(response => {
            var a = [];
            a.push(response.data);
            setFacturas(a);
            console.log(a);
        }).catch(error => {
            console.log(error)
        })
    }

    return(
        <div className="container">
            <Menu />
            <h2 className="text-center">Listado de usuarios</h2>
            <table className="table table-bordered table-striped">
                <thead>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                </thead>
                <tbody>
                    {
                        usuarios.map(usuario => 
                            <tr key={usuario.id}>
                                <td>{usuario.id}</td>
                                <td>{usuario.nombre}</td>
                                <td>{usuario.apellido}</td>
                                <td>{usuario.correo}</td>
                                <td>{usuario.telefono}</td>
                                <td><button class="btn btn-primary" onClick={e => onclickVerFactura(e,usuario.id)}>Ver facturas</button></td>
                            </tr>
                        )
                    }
                </tbody>
            </table>

            {facturas.length > 0 ? <>
            <h2 className="text-center">Listado de facturas</h2>
            <table className="table table-bordered table-striped">
                <thead>
                    <th>Id user</th>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>Cobertura</th>
                    <th>Forma de pago</th>
                    <th>Numero de cuotas</th>
                </thead>
                <tbody>
                    {
                        facturas.map(factura => 
                            <tr key={factura.id}>
                                <td>{factura.id}</td>
                                <td>{factura.idUser}</td>
                                <td>{factura.nombre}</td>
                                <td>{factura.correo}</td>
                                <td>{factura.apellido}</td>
                                <td>{factura.telefono}</td>
                                <td>{factura.coberturapoliza}</td>
                                <td>{factura.formadepago}</td>
                                <td>{factura.numerodecuotas}</td>
                                
                            </tr>
                        )
                    }
                </tbody>
            </table></> :<></>}
        </div>
    );
}

export default Users;