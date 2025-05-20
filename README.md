# StudentManagementSystem.java
The **Student Management System** is a console-based Java application designed to facilitate the management of student records in an educational environment. This application provides a user-friendly interface for administrators or educators to perform various operations related to student data, including adding, updating, deleting, and displaying student information.

#### Key Features:

1. **Add Student Records**:
   - Users can input new student details, including a unique roll number (as a string), name, and age. The system stores this information in an array for temporary management during the program's execution.

2. **Update Student Records**:
   - The application allows users to update existing student records by searching for a student using their roll number. Users can modify the student's name and age as needed.

3. **Delete Student Records**:
   - Users can remove a student from the system by specifying their roll number. The application efficiently shifts the remaining records to maintain a continuous list.

4. **Display All Student Records**:
   - The system provides a structured output of all student records in a tabular format, displaying the roll number, name, and age. This feature allows users to easily view and verify the current student data.

5. **User -Friendly Interface**:
   - The console interface is straightforward, guiding users through each operation with clear prompts and feedback messages. This ensures that users can navigate the system with ease.

6. **Data Management**:
   - The application uses an array to temporarily store student data, making it efficient for small to medium-sized datasets. While the current implementation does not include permanent data storage, it can be extended to incorporate file handling for persistent data management.

#### Technical Details:

- **Programming Language**: Java
- **Data Structure**: Array
- **User  Input**: Utilizes the `Scanner` class for reading user input from the console.
- **Output Formatting**: The application formats the output in a structured manner using string formatting to ensure clarity and readability.

#### Use Cases:

- **Educational Institutions**: Schools, colleges, and universities can use this system to manage student records efficiently.
- **Administrative Tasks**: Administrators can quickly add or update student information, making it easier to maintain accurate records.
- **Learning Tool**: This application serves as a practical example for students learning Java programming, data structures, and console-based application development.

Overall, the Student Management System is a simple yet effective tool for managing student records, providing essential functionalities that can be expanded upon for more complex requirements in the future.
