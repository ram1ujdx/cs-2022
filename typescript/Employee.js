"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(employeeId, emplyeeName, salary, joinDate) {
        this.employeeId = employeeId;
        this.emplyeeName = emplyeeName;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    Employee.prototype.printEmployee = function () {
        console.log(this);
    };
    return Employee;
}());
exports.Employee = Employee;
