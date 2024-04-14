import React from 'react';
import './Menu.css';
import { Link } from 'react-router-dom';

function Menu() {
  return (
    <div className='contenedor-menu'>
      <div className='contenedor-texto-menu'>
      
        <p className='opcion-inicio'>
          <Link className={'link'} to={'/home'}>Inicio</Link>
        </p>
        <p className='opcion-facturas'>
          <Link className={'link'} to={'/facturas'}>Facturas</Link>
        </p>
        <p className='opcion-nosotros'>
          <Link className={'link'} to={'/nosotros'}>Nosotros</Link>
        </p>
        <p className='opcion-usuarios'>
          <Link className={'link'} to={'/usuarios'}>Usuarios</Link>
        </p>
        
        <p className='opcion-cuenta'>Cuenta</p>
      </div>
    </div>
  );
}

export default Menu;
