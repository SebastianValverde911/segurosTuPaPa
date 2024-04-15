import axios from 'axios';

class Services {
    getUsers() {
        return  axios.get("http://localhost:8080/api/getUsers");
    }

    login(correo,contra) {
        return axios.post('http://localhost:8080/api/login', {
            "correo": correo,
            "contra": contra
          },{ headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
          }});
    }
}

export default new Services();