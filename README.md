# Objective
The goal of this project is to create FacultyEase, a desktop application that optimizes and arranges faculty office hour scheduling and administration. Common problems including conflicting appointments, ineffective time management, and misunderstandings between students and faculty are addressed by the program. It will give faculty an easy-to-use interface to enter courses, manage time slots, specify semester specifics, and keep track of student appointments. The system enables fundamental functions like search, edit, and reporting and guarantees data reliability through flat files.

## Table of Contents
- [Functional Requirement](#functional-requirement)
- [Built With](#built-with)
- [Architecture of Application](#architecture-of-application)
- [Setup and Installation](#setup-and-installation)

## Functional Requirement
#### Define Semester Office Hour
- Faculty shall input the year
- Facult shall select the semester(Spring, Summer, Fall, Winter)
- Faculty shall select the days.
- Faculty shall sumbit the data which are saved in corresponding .csv files so that application may use them throughout the pages.
#### Define Time Slot
- Faculty shall select the starting time and ending time.
- Faculty shall click on the "Add Time Slot" to display data in table view.
- Faculty shall submit the data.
#### Select the Course
- Faculty shall enter the course code, course name, and course number.
- Faculty shall submit the data.
#### Schedule the Office Hour
- Faculty shall enter the student name who wants to make appointment.
- Faculty shall select the calendar date.
- Faculty shall select the time slot in time slot lists that has been registed.
- Faculty shall select the course that has been registered.
- Faculty shall enter reason and comment which are optional.
- Faculty shall submit the data.
#### Search Office Hour Schedule
- Faculty shall be able to view all schedule in table view.
- Faculty shall be able to search the schedule by student name.
- Faculty shall be able to cancel the schedule by selecting the schedule.
- Faculty shall be able to change the schedule by editing the existing info.

All the submitted data are saved to corresponding .csv files that the application uses throughout all the pages.

## Built With
- [Java 23 (Zulu JDK 23.0.2)](https://www.azul.com/downloads/?package=jdk#zulu)
- [JavaFX 23.0.2](https://openjfx.io/)
- Libraries
  - javafx-controls
  - formsfx

## Architecture of Application  

The application follows the **Model–View–Controller (MVC)** design pattern, ensuring a clear separation of concerns while demonstrating core **Object-Oriented Programming (OOP)** principles, particularly **polymorphism**.  

Instead of using FXML files, the JavaFX user interface is built **programmatically inside controller classes**. Even with this approach, the responsibilities of each layer remain conceptually distinct.  

### Components  

#### **Model**  
- Encapsulates domain entities (e.g., schedules, courses, time slots).  
- Provides constructors, getters, and setters for controlled access to data.  
- Independent of both the UI and persistence logic, ensuring reusability.  

#### **View**  
- Constructed with **JavaFX components** (`TableView`, `TextField`, `ComboBox`, `Button`, etc.).  
- Defines how information is presented and how inputs are collected.  
- In this project, the **View is embedded in the controller classes** instead of separate FXML files.  

#### **Controller**  
- Connects the **View** with the **Model**.  
- Handles user interactions (form submissions, searches, edits, deletions).  
- Validates inputs, updates data models, and refreshes the UI accordingly.  

#### **DAO Layer (Polymorphism)**  
- Implements the **Data Access Object (DAO) pattern** to abstract persistence.  
- DAO **interfaces** define contracts for saving, loading, and checking schedules.  
- DAO **implementations** (e.g., `CSVScheduleDAO`) provide the actual storage mechanism.  
- Controllers depend on the **interface** type, not the implementation:  

  ```java
  ScheduleDAO dao = new CSVScheduleDAO();
  dao.save(schedule);

### Implementation Highlights  
- **MVC Alignment**: Models manage data, Views present the UI, Controllers handle logic, DAOs manage persistence.  
- **Polymorphism**: DAO interfaces decouple controllers from concrete storage implementations, ensuring extensibility.  
- **Encapsulation**: Private fields in Models enforce data protection, accessible only through getters/setters.  
- **Reusability**: The architecture supports replacing or extending persistence mechanisms without altering core logic.  
- **JavaFX UI**: Controllers dynamically build interactive UIs, styled with layouts and CSS.

## Setup and Installation
**1. Clone the repository**
```bash
git clone https://github.com/ThelNuZaw/FacultyEase.git
```
**2. Open the project in IntelliJ IDEA**
- Go to File -> Open and select the project folder.  
- IntelliJ will detect the `pom.xml` file and import it as a **Maven project**.

**3. Configure Project SDK**
- Go to File -> Project Structure → Project.  
- Under Project SDK, select **Zulu JDK 23**.  
- Apply and save changes.

**4. Run the Application**
- Run `s25.cs151.application.Main`.


  

