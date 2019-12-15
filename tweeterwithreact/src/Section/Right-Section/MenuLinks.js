import React from 'react';
import Menu from "./Menu";

const MenuLinks = (props) => {
    var MenuList = [
        { text:'Tweets', count:0},
        { text:'Re Tweets', count:0},
        { text:'Followers', count:0},
        { text:'Likes', count:0},

    ]
    return (
        <div>
            <Menu links={MenuList}/>
        </div>
    )
}

export default MenuLinks
