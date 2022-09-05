// console.log('Hello World')
// numbers boolean string date object

let value = true;

let username = 'rahul';


let date = new Date();

//console.log(date.toDateString())

let employee = {
    employeeId:1001,
    employeeName:'Rahul Dutta',
    salary:72500,
    joinDate:'2020-10-10',
    printEmployee(){
        console.log(this)
    }
}

employee.employeeId=2001;
employee.email='rahul@yahoo.com';

// employee.printEmployee()


let personList=[];

personList.push('Tushar')
personList.push('Suraj')
personList.push('Manish')
personList.push('Javed')
personList.push('Taniya')

personList.splice(1,1)



 //console.log(personList)

// for(let person of personList){
//     console.log(person)
// }

// personList.filter(person=>person.startsWith('T'))
//             .map(person=> person.toUpperCase())
//             .forEach(person=>console.log(person))


let add = function abc(a,b){
    return a+b;
}

//console.log(add(5,6))

// Pure Function
// Higher Order Function
// Callback Function

setTimeout(()=>console.log('Hello'),5000)
console.log('Hello World')
