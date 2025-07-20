SET SERVEROUTPUT ON;

DECLARE
  v_counter NUMBER := 1;
BEGIN
  WHILE v_counter <= 5 LOOP
    IF MOD(v_counter, 2) = 0 THEN
      DBMS_OUTPUT.PUT_LINE(v_counter || ' is Even');
    ELSE
      DBMS_OUTPUT.PUT_LINE(v_counter || ' is Odd');
    END IF;
    v_counter := v_counter + 1;
  END LOOP;
END;
/
