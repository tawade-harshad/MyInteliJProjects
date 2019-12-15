import React from 'react';

const ButtonPanel = (props) => {
    return (
        <div className="button-panel">
            <div className="btn-tweet">
                <button onClick={props.data.handleTweet}>{'Tweet'}</button>
            </div>
            {/*<div className="btn-view-tweet">
                <button>{'View Tweet'}</button>
            </div>*/}
        </div>
    )
}
{/*onClick={props.state.tweetValue}*/}
export default ButtonPanel
