import './Notification.css';
import React from 'react';

function Notification({data}) {
    const status = data.status;
    const message = data.message;
    return(
            <div className='container-notification'>
                <div class="toast-container position-static bottom-0 end-0 p-3">
                    <div id="liveToast" class="toast show" role="alert" aria-live="assertive" aria-atomic="true">
                        <div class="toast-header">
                            <div class="rounded me-2 text-bg-warning p-3"></div>
                            <strong class="me-auto">{status}</strong>
                            <small>Justo ahora</small>
                            {/* <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button> */}
                        </div>
                        <div class="toast-body">
                            {message}
                        </div>
                    </div>
                </div>
            </div>
    );
}

export default Notification;