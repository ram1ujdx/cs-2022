import { Employee } from "./Employee";

let x : number;
x = 10;
console.log(x)

// any
// number
// boolean
// Date
// never
// null
// undefined
// tuple
// arrays


let numbers:number[] = [10,20,30];

let values:Array<number> = [];

let emp:Employee = new Employee(1001,'Rohit',56200,new Date('2020,10,10'));

emp.printEmployee()