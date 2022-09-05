export class Employee{
    constructor(private employeeId:number, private emplyeeName:string, private salary:number, private joinDate:Date){  }

    printEmployee():void{
        console.log(this)
    }

}

