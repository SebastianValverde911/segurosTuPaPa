import logo from './logo.svg';
import './App.css';
import Login from './components/Login/Login';
import Menu from './components/Menu/Menu';
import Copyright from './components/Copyright/Copyright';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <nav>
        <Menu/>
        </nav>
        <Login />
      </header>
        <Copyright/>
    </div>
  );
}

export default App;
