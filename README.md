# git-class
School project that demonstrates the git principles 

## Getting Started

Follow these steps to clone and run the project on your local machine:

### Prerequisites

Before you begin, ensure that you have the following tools installed:

- Java Development Kit (JDK)
- Maven
- Git

### Clone the Repository

Use Git to clone this repository to your local machine:

```bash
git clone https://github.com/melek-homrani/git-class.git
```
### Build and Run the Project

#### change directory to the project
```bash
cd git-class
```
#### Install the project dependencies
```bash
mvn dependency:resolve
```
#### Build the project
```bash
mvn clean install
```
#### Run the project
```bash
mvn spring-boot:run
```
The Spring Boot application will start, and you can access it in your web browser at http://localhost:8080
(unless you changed the server port in the `application.properties` or `application.yml` file)

(i changed the port to 8081 and the file extension to .yaml)

## Contribution
If you'd like to contribute to this project, please fork the repository, make your changes, and create a pull request
Your contributions are welcome!

## License
This project is licensed under the MIT License - see the `LICENSE` file for details
## Authors
- Melek Homrani
- Mohamed Aziz Rahali

## Contact
- Melek Homrani: melek.homrani@esprit.tn
- Mohamed Aziz Rahali: mohamedaziz.rahali@esprit.tn