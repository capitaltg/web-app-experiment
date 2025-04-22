import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';

function App() {
  const [message, setMessage] = useState<string>('');

  const fetchMessage = async () => {
    try {
      const response = await fetch(`${process.env.REACT_APP_API_URL}/hello`);
      const data = await response.text();
      setMessage(data);
    } catch (error) {
      setMessage('Error fetching message');
      console.error(error);
    }
  };
  
  return (
    <div className="App">
      <h1>Web App</h1>
      <button onClick={fetchMessage}>Get Message from Backend</button>
      <Hello message={message} />
    </div>
  );
}

export default App;
