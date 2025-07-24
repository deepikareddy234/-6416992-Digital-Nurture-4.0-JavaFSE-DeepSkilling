import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Yerlam Sai Deepika"
        School="Montessori High School"
        total={276}
        goal={300}
      />
    </div>
  );
}

export default App;
