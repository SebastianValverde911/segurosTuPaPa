import React from 'react';
import './Copyright.css';

function Copyright() {
  return (
    <footer>
    <div className='contenedor-copy'>
      <div className='contenedor-texto-copy'>
        <p className='opcion-terms'>Terms</p>
        <p className='opcion-privacy'>Privacidad</p>
        <p className='opcion-seguridad'>Seguridad</p>
        <p className='opcion-estado'>Estado</p>
        <p className='opcion-contacto'>Contacto</p>
        <p className='opcion-cockies'>Cookies</p>
      </div>
    </div>
    </footer>
  );
}

export default Copyright;