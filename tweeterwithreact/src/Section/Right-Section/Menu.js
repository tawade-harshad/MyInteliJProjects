import React from 'react';

const Menu = (props) => {
    return (
        <div>
            <ul>
                {
                    props.links.map((eachItem,index) => {
                        return(
                            <li key={index}> {eachItem.text} : {/*{eachItem.count}*/} {props.data.tweetCount} </li>
                        )
                    })
                }
            </ul>
        </div>
    )
}

export default Menu
