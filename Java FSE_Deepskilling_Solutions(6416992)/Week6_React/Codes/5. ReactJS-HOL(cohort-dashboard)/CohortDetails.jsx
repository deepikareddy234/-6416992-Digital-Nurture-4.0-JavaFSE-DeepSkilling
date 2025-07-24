import React from "react";
import styles from "./CohortDetails.module.css";

const CohortDetails = ({ cohort }) => {
  const { name, startDate, status, coach, trainer } = cohort;

  // Green for "Ongoing", Blue for everything else
  const headingColor = status.toLowerCase() === "ongoing" ? "green" : "blue";

  return (
    <div className={styles.box}>
      <h3 style={{ color: headingColor }}>{name}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{startDate}</dd>

        <dt>Current Status</dt>
        <dd>{status}</dd>

        <dt>Coach</dt>
        <dd>{coach}</dd>

        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
