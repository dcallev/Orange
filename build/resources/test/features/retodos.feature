@Regression
Feature: Web Automation OrangeHRM Demo
  As a web user
   wants to access menu PIM
  To register a employee and visualize the new employee



Scenario: Access the page and registered
    Given that Juan needs to create an employee at the OrageHR
    When he makes the registration entry in the application
      #|first_name|middle_name|last_name|location|other_id|date_of_birth|marital_status|gender|nationality|drives_license_number|license_expiry_date|nick_name|military_service|smoker|blood_group|hobbies|effective_from|region|fte|temporary_department|
      |Juan|Jose|Rodríguez|Australian Regional HQ|1111|1996-19-10|Married|Male|Albanian|123456789|2020-25-05|Liche|987654321|YES|AB|Soccer, Movies|2019-11-09|Region-1|0.5|Sub unit-1|
    Then he visualizes the new employee in the application