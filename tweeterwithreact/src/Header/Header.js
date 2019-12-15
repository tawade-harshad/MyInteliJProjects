import React from 'react';

const Heading = (props) => {
    return(
        <div>
            <h1 className={'centerText'}>{props.majHeading}</h1>
        </div>
    );
}

export default Heading
