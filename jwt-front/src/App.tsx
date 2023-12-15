import './App.css';
import Index from './pages/Index';

function App() {
  return (
    <div className="App">
      <h1 className="text-3xl font-bold underline">
        Hello world!
      </h1>
      <button className="py-2 px-4 rounded-lg shadow-md text-white bg-blue-500">click me!!</button>
      <Index />
    </div>
  );
}

export default App;
