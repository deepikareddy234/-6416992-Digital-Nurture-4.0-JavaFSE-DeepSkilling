import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      euroAmount: ""
    };
  }

  handleChange = (e) => {
    this.setState({ euroAmount: e.target.value });
  };

  handleSubmit = () => {
    const { euroAmount } = this.state;
    const rupees = parseFloat(euroAmount) * 80; // Euro → Rupees
    alert("Converting to Euro Amount is " + rupees);
  };

  render() {
    return (
      <div>
        <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
        <label>Amount:</label><br />
        <input
          type="number"
          value={this.state.euroAmount}
          onChange={this.handleChange}
        /><br /><br />
        <label>Currency:</label><br />
        <input type="text" value="Euro" readOnly /><br /><br />
        <button onClick={this.handleSubmit}>Submit</button>
      </div>
    );
  }
}

export default CurrencyConvertor;
