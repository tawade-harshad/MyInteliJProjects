import React from 'react';

class TweetForm extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            newTweet :{
                tweetValue:'',
            }
        };
    }

    handleChange =(event) =>{
        let name = event.target.name;
        let value = event.target.value;

        console.log(name + " "  + value);

        this.setState((state,props)=>(
            {newTweet:{...this.state.newTweet,[name]:value}})
        );
    }

    handleSubmit =(event) =>{
        event.preventDefault();
        console.log(this.state.newTweet);
    }

    handleReset=(data) =>{
        console.log(data);
        this.setState({newTweet:{
                tweetValue:'',
            }})
    }

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <div>
                        {/*<input type="text" name={"loanAmount"} value={this.state.newLoan.loanAmount} onChange={this.handleChange}/>*/}
                        <textarea rows="5" cols="30" name={'txtTweetArea'} value={this.state.tweetValue}
                                  onChange={this.handleChange}/>
                    </div>
                    <div className="btn-view-tweet">
                        <button>{'View Tweet'}</button>
                    </div>

                </form>
            </div>
        );
    }
}

TweetForm.propTypes = {};

export default TweetForm;
