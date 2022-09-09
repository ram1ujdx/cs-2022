import React, { Component } from 'react'

export class Message extends Component {

constructor(){
    super()
    this.state={
        senderName : 'Gaurav'
    }
}

message='Angular and React are Component Oriented'

  render(props) {
    //console.log(this.state.senderName)
    // setTimeout(()=>{
    //     this.state.senderName='Rohit'
    //     console.log(this.state.senderName)
    // },5000
    // );

    return (
      <div>
        <p>{this.props.content}</p>
        <p>Enter Sender's Name <input type={'text'} onChange={(event)=>this.changeName(event.target.value)} />
        
        <button>Enter</button>
        </p>

        <p>Sender : {this.state.senderName}</p>
      </div>
    )
  }

  changeName(senderName){
    this.setState({
        senderName:senderName
    })
  }

}

//export default Message
