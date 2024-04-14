import axios from 'axios';

class Services {
    getUsers() {
        return  axios.get("http://localhost:8080/api/getUsers");
    }
}

export default new Services();