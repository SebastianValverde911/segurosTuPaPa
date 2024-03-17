import React from 'react';
import './Menu.css';

function Menu() {
  return (
    <div className='contenedor-menu'>
      <div className='contenedor-texto-menu'>
        <p className='opcion-inicio'>
          Inicio</p>
        <p className='opcion-facturas'>
          Facturas</p>
        <p className='opcion-nosotros'>
          Nosotros</p>
        
        <p className='opcion-cuenta'>Cuenta</p>
      </div>
    </div>
  );
}

export default Menu;
