import axios from 'axios';

class Services {
    getUsers() {
        return  axios.get("http://localhost:8080/api/getUsers");
    }

    login(correo,contra) {
        return axios.post('http://localhost:8080/api/login', {
            "correo": correo,
            "contraseña": contra
          });
    }

    registry(nombre,apellido,correo,telefono,contraseña) {
      return axios.post('http://localhost:8080/api/registry', {
          "nombre": nombre,
          "apellido": apellido,
          "correo": correo,
          "telefono": telefono,
          "contraseña": contraseña
        });
  }
}

export default new Services();