import React from "react";

const IndianPlayers = () => {
  const oddPlayers = ["Kohli", "Gill", "Rahul", "Ashwin", "Shami"];
  const evenPlayers = ["Rohit", "Surya", "Pant", "Bumrah", "Jadeja"];

  // Destructuring oddPlayers
  const [player1, player2, player3, ...others] = oddPlayers;

  // Merge T20 + Ranji
  const T20Players = ["Virat", "Surya", "Gill"];
  const RanjiPlayers = ["Jaiswal", "Sarfaraz", "Sundar"];
  const merged = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players (Destructured)</h2>
      <p>Player 1: {player1}</p>
      <p>Player 2: {player2}</p>
      <p>Player 3: {player3}</p>
      <p>Others: {others.join(", ")}</p>

      <h2>Even Team Players</h2>
      <ul>
        {evenPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Merged T20 + Ranji Players</h2>
      <ul>
        {merged.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
