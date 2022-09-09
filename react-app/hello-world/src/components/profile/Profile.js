import React from 'react'

function Profile(props) {
  return (
    <div>
      <h2>Profile Information</h2>
      <p>Username : {props.username}</p>
      <button onClick={showMe}>Click Me</button>
    </div>
  )
}

function showMe(){
  alert('Button Clicked')
}

export default Profile
