import React from 'react';

const TweeterHandle = (props) => {
    return (
        <div className="tweet-handle">
            <div>
                <h5></h5>
            </div>
            <ul>
                <li>Name:{props.user.name}</li>
                <li>Age:{props.user.age}</li>
                <li>Handle:{props.user.thandler}</li>
            </ul>
        </div>
    )
}

export default TweeterHandle
