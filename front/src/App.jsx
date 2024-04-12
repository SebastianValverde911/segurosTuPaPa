import './App.css';
import Login from './components/Login/Login';
import SignUp from './components/SignUp/SignUp';
import Home from './components/HomeTuPapa/HomeTuPapa';
import Facturas from './components/Facturas/Facturas';
import Nosotros from './components/Nosotros/Nosotros';

// Bootstrap CSS
import "bootstrap/dist/css/bootstrap.min.css";
// Bootstrap Bundle JS
import "bootstrap/dist/js/bootstrap.bundle.min";
import {BrowserRouter,Route,Routes} from "react-router-dom";
import Copyright from './components/Copyright/Copyright';

function App() {
    return (
        <BrowserRouter>
            <div className="App">
                <header className="App-header">
                    <Routes>
                        <Route path="/" element={<Login />} />
                        <Route path="/registrarte" element={<SignUp />} />
                        <Route path="/home" element={<Home />} />
                        <Route path="/facturas" element={<Facturas />} />
                        <Route path="/nosotros" element={<Nosotros />} />
                    </Routes>
                </header>
                <Copyright />
            </div>
        </BrowserRouter>
    );
}

export default App;