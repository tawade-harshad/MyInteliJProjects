import React from 'react';
import ButtonPanel from "../Right-Section/Button";
import TextArea from "../Right-Section/TextArea";
import MenuLinks from "../Right-Section/MenuLinks";
import Menu from "../Right-Section/Menu";
import TweetForm from "../Right-Section/TweetForm";

class TweeterControl extends React.Component {
    tweetArray = [];

    constructor(props) {
        super(props);

        this.state = {
            tweetCount: 0,
            retweetCount: 0,
            followerCount: 0,
            likeCount: 0,
            tweetValue: '',
            tweetsToDisplay: ''
        };
    }

    // Code Added from another component.
    handleChange = (event) => {
        let name = event.target.name;
        let value = event.target.value;
        console.log(name + " " + value);

        /*  this.setState((state, props) => (
              {tweetStore: this.state.tweetValue.concat(value)}));
          console.log(this.state.tweetStore)
  */
        this.setState((state, props) => (
            {tweetValue: value}));
        console.log(this.state.tweetValue)
    }

    displayTweet = (event) => {
        console.log("This is from Display Function" + this.tweetArray);
        this.setState({tweetsToDisplay: this.tweetArray});
    }

    //Code from another component ends here.
    handletweetClick = () => {
        console.log("Handle Tweet Called");
        this.tweetArray.push(this.state.tweetValue);
        this.setState({tweetCount: this.state.tweetCount + 1});
        this.setState({tweetValue: ''});
        console.log(this.tweetArray);
    }

    handleReTweetClick = () => {
        console.log("Handle Re-Tweet Called");
        this.setState({reTweetCount: this.state.reTweetCount + 1});
    }

    handleFollowerClick = () => {
        console.log("Handle Follower Called");
        this.setState({followerCount: this.state.followerCount + 1});
    }

    handleLikeClick = () => {
        console.log("Handle Like Called");
        this.setState({likeCount: this.state.likeCount + 1});
    }

    render() {
        /*this.tweetArray.push(this.state.tweetValue);
        console.log("This is from Tweet Array" + this.tweetArray);*/
        let info = {
            handleLike: this.handleLikeClick,
            handleFollower: this.handleFollowerClick,
            handleRetweet: this.handleReTweetClick,
            handleTweet: this.handletweetClick,
            likeCount: this.state.likeCount,
            followerCount: this.state.followerCount,
            retweetCount: this.state.retweetCount,
            tweetCount: this.state.tweetCount,
            tweetsToDisplay: this.state.tweetsToDisplay
        }

        return (
            <div>
                {/*<form onSubmit={this.handleSubmit}>*/}
                <div className="menu">
                    <span>Tweets : {info.tweetCount}</span>
                    <span>ReTweet : {info.retweetCount}</span>
                    <span>Followers : {info.followerCount}</span>
                    <span>Like : {info.likeCount}</span>
                </div>
                <div className="tweet-area">
                        <textarea rows="5" cols="30" name={'txtTweetArea'} value={this.state.tweetValue}
                                  onChange={this.handleChange}/>
                </div>
                <div className="button-panel">
                    <div className="btn-tweet">
                        <button onClick={info.handleTweet}>{'Tweet'}</button>
                    </div>
                    <div className="btn-view-tweet">
                        <button onClick={this.displayTweet}>{'View Tweet'}</button>
                    </div>
                </div>
                <div>
                    <span>{info.tweetsToDisplay}</span>
                </div>
                {/* </form>*/}


            </div>
        );
    }
}

TweeterControl.propTypes = {};

export default TweeterControl;
