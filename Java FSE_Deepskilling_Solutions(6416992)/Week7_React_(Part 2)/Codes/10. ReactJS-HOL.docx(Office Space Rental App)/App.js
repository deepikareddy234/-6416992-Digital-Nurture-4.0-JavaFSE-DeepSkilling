import React from "react";

function App() {
  const heading = <h1>Office Space Rental App</h1>;

  const imageStyle = {
    width: "400px",
    height: "250px",
    borderRadius: "8px",
    marginBottom: "20px"
  };

  const office1 = {
    name: "Prestige Tech Park",
    rent: 75000,
    address: "Outer Ring Road, Bangalore"
  };

  const officeList = [
    {
      name: "WeWork BKC",
      rent: 95000,
      address: "Bandra Kurla Complex, Mumbai"
    },
    {
      name: "T-Hub",
      rent: 55000,
      address: "Hitech City, Hyderabad"
    },
    {
      name: "Regus Sector 62",
      rent: 60000,
      address: "Noida, Delhi NCR"
    }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}

      <img
        src="https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg"
        alt="Office Space"
        style={imageStyle}
      />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office1.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office1.rent < 60000 ? "red" : "green" }}>
          ₹{office1.rent}
        </span>
      </p>
      <p><strong>Address:</strong> {office1.address}</p>

      <h2>Available Offices</h2>
      {officeList.map((office, index) => (
        <div key={index} style={{ marginBottom: "20px" }}>
          <p><strong>Name:</strong> {office.name}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
              ₹{office.rent}
            </span>
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
