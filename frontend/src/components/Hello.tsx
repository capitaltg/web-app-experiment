import React from 'react';

interface HelloProps {
  message: string;
}

const Hello: React.FC<HelloProps> = ({ message }) => {
  return (
    <div>
      <h2>Backend Response:</h2>
      <p>{message || 'Click the button to fetch a message!'}</p>
    </div>
  );
};

export default Hello;