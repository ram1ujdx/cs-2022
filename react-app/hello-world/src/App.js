import logo from './logo.svg';
import './App.css';
import Profile from './components/profile/Profile';
import {Message} from './components/message/Message';

function App() {
  return (
    <>
      <h1>Hello World</h1>
      <p>This is our first React App</p>
      <Profile username={'Tushar'}></Profile>
      <Message content={'Angular is a Framework and React is a Library'}></Message>
    </>
    
  );
}

export default App;
