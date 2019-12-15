import React from 'react';

class TextArea1 extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            tweetValue: '',
        };
    }

    handleChange = e => {
        this.setState({tweetValue: e.target.tweetValue})
    }

    render() {
        return (
                <div className="tweet-area">
                    <textarea rows="5" cols="30" id={'txtTweetArea'} value={this.state.tweetValue} onChange={this.handleChange}/>
                </div>
        );
    }
}

TextArea1.propTypes = {};

export default TextArea1;
