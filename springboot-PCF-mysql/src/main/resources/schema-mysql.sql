DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  empId VARCHAR(10) NOT NULL,
  empName VARCHAR(100) NOT NULL
);

INSERT INTO employee(empId,empName)values("emp0011","emp1");
INSERT INTO employee(empId,empName)values("emp0021","emp2");
INSERT INTO employee(empId,empName)values("emp0033","emp3");
