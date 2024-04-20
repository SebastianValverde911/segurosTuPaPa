import Services from '../../services/services';
import './Users.css';
import React, {useEffect, useState} from 'react';
import Menu from '../Menu/Menu';

function Users() {

    const [usuarios, setUsuarios] = useState([]);

    useEffect(()=>{
        Services.getUsers().then(response => {
            setUsuarios(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    },[]);

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
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    );
}

export default Users;