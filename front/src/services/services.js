import axios from 'axios';

class Services {
    getUsers() {
        return axios.get("http://localhost:8090/api/getUsers");
    }

    login(correo, contra) {
        return axios.post('http://localhost:8090/api/login', {
            "correo": correo,
            "contraseña": contra
        });
    }

    registry(nombre, apellido, contrasena, correo, telefono) {
        return axios.post('http://localhost:8090/api/registry', {
            "nombre": nombre,
            "apellido": apellido,
            "contraseña": contrasena,
            "correo": correo,
            "telefono": telefono
        });
    }
}

const servicesInstance = new Services();
export default servicesInstance;
