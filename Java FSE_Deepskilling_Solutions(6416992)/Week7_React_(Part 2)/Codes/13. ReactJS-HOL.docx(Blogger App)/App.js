import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [showBook, setShowBook] = useState(true);
  const [activeComponent, setActiveComponent] = useState("book"); // 'book' | 'blog' | 'course'

  // Conditional rendering using element variables
  let displayComponent;
  if (activeComponent === "book") {
    displayComponent = <BookDetails />;
  } else if (activeComponent === "blog") {
    displayComponent = <BlogDetails />;
  } else {
    displayComponent = <CourseDetails />;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>📘 Blogger App</h1>

      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => setActiveComponent("book")}>Show Book</button>{" "}
        <button onClick={() => setActiveComponent("blog")}>Show Blog</button>{" "}
        <button onClick={() => setActiveComponent("course")}>Show Course</button>
      </div>

      {/* Conditional rendering using element variable */}
      {displayComponent}

      <hr />

      {/* Conditional rendering using ternary operator */}
      <h2>Book Visibility (Using Ternary)</h2>
      <button onClick={() => setShowBook(!showBook)}>
        {showBook ? "Hide" : "Show"} Book Component
      </button>

      {showBook ? <BookDetails /> : <p>Book component is hidden.</p>}
    </div>
  );
}

export default App;
