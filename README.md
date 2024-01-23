# Technocrom Website Automation Test

This project contains automated tests for the Technocrom website using Cucumber and Selenium.

## Project Structure

The project is structured as follows:

- `src/test/java/com/example/RunCucumberTest.java`: Main test runner class.
- `src/test/java/com/example/TechnocromStepDefinitions.java`: Step definitions for Cucumber scenarios.
- `src/test/resources/features/technocrom.feature`: Cucumber feature file with scenarios.

## Prerequisites

Before running the tests, make sure you have the following installed:

- [Java](https://www.java.com/)
- [Maven](https://maven.apache.org/)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/)

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/sam0340/Technochromtest.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Technochromtest
    ```

3. Update the `chromedriver.exe` path in `src/test/java/com/example/TechnocromStepDefinitions.java` with the correct path on your machine.

## Running the Tests

Execute the following commands to run the tests:

```bash
mvn clean test


## Test Results

After running the tests, you can find the test reports in the target/cucumber-reports directory. Open the HTML reports to view detailed results.

## Troubleshooting

If you encounter issues, make sure the ChromeDriver version is compatible with your Chrome browser version.
Check the Maven dependencies and ensure that they are correctly downloaded.
