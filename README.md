# Omni Hypnose All Click On Links

This repository contains automated test scenarios for verifying the availability of overhead menu elements and specific user actions on the Omni Hypnose platform. The tests are written in Gherkin language for easy readability and are executed using a BDD (Behavior-Driven Development) framework.

## Features

- **Omni Hypnose Overhead Menu Tests**
  - Verify the availability of various overhead menu elements on the main page.
  - Ensure that clicking on these elements navigates the user to the correct pages.

## Scenarios

### Check the availability of Overhead Menu Elements

This feature includes scenarios to check if the overhead menu elements are available and functioning as expected.

#### Scenario Outline: Check the availability of Overhead Menu Elements

1. **Given** the user is on the main page.
2. **When** the user clicks on `<Overhead Menu>`.
3. **Then** the user should navigate to the `<Overhead Menu>` page.

**Examples:**

| Overhead Menu   |
|-----------------|
| Ausbildung      |
| Weiterbildung   |
| OMNIfinder      |
| Uber OMNI       |
| Sign In         |

### @wip Scenario: Check the availability of Overhead Menu Elements

This work-in-progress (WIP) scenario includes steps to check the availability and functionality of the Omni Hypnose platform's specific elements.

1. **Given** the user is on the main page.
2. **When** the user clicks on `OMNI Hypnotisor_Modul1`.
3. **And** the user clicks on `jetzt Onlineausbildung starten`.
4. **And** the user fills the form.
5. **And** the user clicks on `Debit- oder Kreditkarte`.
6. **Then** the user checks the PayPal option.

## Getting Started

### Prerequisites

- Install [Node.js](https://nodejs.org/)
- Install [Cucumber](https://cucumber.io/)
- Install [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/)

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/huseyintorun/omnihypnosis-automation.git
Navigate to the project directory:
sh
Kodu kopyala
cd omni-hypnose
Install the dependencies:
sh
Kodu kopyala
npm install
Running the Tests
Start the Selenium WebDriver:
sh
Kodu kopyala
webdriver-manager start
Run the Cucumber tests:
sh
Kodu kopyala
npx cucumber-js
Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes.
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a new Pull Request.
License
This project is licensed under the MIT License - see the LICENSE file for details.
