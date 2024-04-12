import './HomeTuPapa.css';
import Menu from '../Menu/Menu';

function HomeTuPapa() {
    return(
        <div>
            <Menu />
            <h3>Inicio</h3>
            <div className='container-safe'>
                <div class="card">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR35hiKNUwXKSwFcp3flDA7eWtkPbEFrhmf_-Qb3UzC_ve1GD_6YwDGl3eZG4RAsRoF6qo&usqp=CAU" class="card-img-top" alt="..." />
                    <div class="card-body">
                        <h5 class="card-title">Seguro #1</h5>
                        <p class="card-text">Este seguro es el mejor que tenemos.</p>
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>
                <div class="card">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR35hiKNUwXKSwFcp3flDA7eWtkPbEFrhmf_-Qb3UzC_ve1GD_6YwDGl3eZG4RAsRoF6qo&usqp=CAU" class="card-img-top" alt="..." />
                    <div class="card-body">
                        <h5 class="card-title">Seguro #2</h5>
                        <p class="card-text">Este seguro es el mejor que tenemos.</p>
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>
                <div class="card">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR35hiKNUwXKSwFcp3flDA7eWtkPbEFrhmf_-Qb3UzC_ve1GD_6YwDGl3eZG4RAsRoF6qo&usqp=CAU" class="card-img-top" alt="..." />
                    <div class="card-body">
                        <h5 class="card-title">Seguro #3</h5>
                        <p class="card-text">Este seguro es el mejor que tenemos.</p>
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default HomeTuPapa;