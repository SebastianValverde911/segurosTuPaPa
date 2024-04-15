import './SignUp.css'
import React, { useState } from 'react';

function SignUp() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            // Enviar datos al backend
            const response = await fetch('/registrarse', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ email, password })
            });

            // Manejar la respuesta del backend
            if (response.ok) {
                console.log('Usuario registrado correctamente');
                // Limpiar los campos después de enviar los datos al backend
                setEmail('');
                setPassword('');
            } else {
                console.error('Error al registrar el usuario:', response.statusText);
            }
        } catch (error) {
            console.error('Error al enviar los datos:', error);
        }
    };

    return (
        <div>
            <h3>Registrarse</h3>
            <div className="log">
                <form onSubmit={handleSubmit}>
                    <div className="mb-3">
                        <label htmlFor="exampleInputEmail1" className="form-label">Correo</label>
                        <input
                            type="email"
                            className="form-control"
                            id="exampleInputEmail1"
                            aria-describedby="emailHelp"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
                        />
                    </div>
                    <div className="mb-3">
                        <label htmlFor="exampleInputPassword1" className="form-label">Contraseña</label>
                        <input
                            type="password"
                            className="form-control"
                            id="exampleInputPassword1"
                            value={password}
                            onChange={(e) => setPassword(e.target.value)}
                        />
                    </div>
                    <button type="submit" className="btn btn-primary">Registrarse</button>
                </form>
            </div>
        </div>
    );
}

export default SignUp;
