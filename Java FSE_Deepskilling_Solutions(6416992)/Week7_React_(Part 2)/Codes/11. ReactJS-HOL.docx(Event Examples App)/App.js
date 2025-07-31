import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 0,
    };
  }

  increment = () => {
    const newCount = this.state.count + 1;
    this.setState({ count: newCount }, () => {
      alert("hello member " + this.state.count);
    });
  };

  decrement = () => {
    const newCount = this.state.count - 1;
    this.setState({ count: newCount }, () => {
      alert("member decremented");
    });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h1>{this.state.count}</h1>
        <button onClick={this.increment}>Increment</button><br /><br />
        <button onClick={this.decrement}>Decrement</button><br /><br />
        <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button><br /><br />
        <button onClick={this.onPress}>Click on me</button><br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
