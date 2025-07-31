import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 80 },
    { name: "Rohit", score: 90 },
    { name: "Gill", score: 65 },
    { name: "Surya", score: 72 },
    { name: "Rahul", score: 50 },
    { name: "Jadeja", score: 85 },
    { name: "Ashwin", score: 30 },
    { name: "Bumrah", score: 60 },
    { name: "Shami", score: 45 },
    { name: "Pant", score: 95 },
    { name: "Hardik", score: 70 }
  ];

  const filteredPlayers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All 11 Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - Score: {p.score}</li>
        ))}
      </ul>

      <h2>Players with Score &lt; 70</h2>
      <ul>
        {filteredPlayers.map((p, i) => (
          <li key={i}>{p.name} - Score: {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
