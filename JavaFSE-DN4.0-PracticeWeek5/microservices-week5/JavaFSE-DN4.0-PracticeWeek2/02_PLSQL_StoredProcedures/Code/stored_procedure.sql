
CREATE TABLE employees (
  emp_id NUMBER,
  emp_name VARCHAR2(100),
  salary NUMBER
);


CREATE OR REPLACE PROCEDURE insert_employee (
  p_id IN NUMBER,
  p_name IN VARCHAR2,
  p_salary IN NUMBER
) AS
BEGIN
  INSERT INTO employees VALUES (p_id, p_name, p_salary);
  DBMS_OUTPUT.PUT_LINE('Employee inserted successfully.');
END;
/

BEGIN
  insert_employee(101, 'Harini', 50000);
END;
/
