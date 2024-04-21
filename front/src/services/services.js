
import axios from 'axios';

class Services {
    getUsers() {
        return  axios.get("http://localhost:8090/api/getUsers");
    }

    getPolizas() {
        return  axios.get("http://localhost:8090/api/getPolizas");
    }

    getFacturas(id) {
        return  axios.get(`http://localhost:8090/api/getFacturas/${id}`);
    }

    login(correo,contra) {
        return axios.post('http://localhost:8090/api/login', {
            "correo": correo,
            "contraseña": contra
        });
    }

    registry(nombre,apellido,correo,telefono,contraseña) {
        return axios.post('http://localhost:8090/api/registry', {
            "nombre": nombre,
            "apellido": apellido,
            "correo": correo,
            "telefono": telefono,
            "contraseña": contraseña
        });
    }

    comprapoliza(iduser, nombre, correo, apellido, telefono, coberturapoliza, formadepago, numerodecuotas ) {
        return axios.post('http://localhost:8090/api/comprapoliza', {
            "iduser": iduser,
            "nombre": nombre,
            "correo": correo,
            "apellido": apellido,
            "telefono": telefono,
            "coberturapoliza": coberturapoliza,
            "formadepago": formadepago,
            "numerodecuotas": numerodecuotas,
        });
    }
}

export default new Services();