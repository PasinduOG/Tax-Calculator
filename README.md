# Tax Calculator

A comprehensive Java-based tax calculation application that provides various tax computation functionalities including withholding taxes, payable taxes, income taxes, SSCL taxes, and leasing payment calculations.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Tax Calculation Methods](#tax-calculation-methods)
- [Menu Navigation](#menu-navigation)
- [Tax Calculation Formulas](#tax-calculation-formulas)
- [Examples](#examples)
- [System Requirements](#system-requirements)
- [Contributing](#contributing)
- [License](#license)

## Overview

This Tax Calculator is a console-based Java application designed to help users calculate various types of taxes and leasing payments. The application features a user-friendly menu system with ASCII art branding and provides accurate tax calculations based on current tax laws and regulations.

## Features

### 🏛️ Tax Calculations
- **Withholding Tax**
  - Rent Tax (10% on amounts above Rs. 100,000)
  - Bank Interest Tax (5% on all interest)
  - Dividend Tax (14% on amounts above Rs. 100,000)

- **Payable Tax** (Progressive tax rates on monthly employee payments)
- **Income Tax** (Progressive tax rates on annual income)
- **Social Security Contribution Levy (SSCL) Tax** (includes VAT calculations)

### 💰 Leasing Calculations
- Monthly Installment Calculator
- Leasing Category Comparison (3, 4, and 5-year plans)
- Maximum Leasing Amount Calculator

### 🎯 User Experience
- Interactive console interface with ASCII art
- Input validation and error handling
- Option to perform multiple calculations
- Clear and formatted output

## Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt/PowerShell)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/PasinduOG/Tax-Calculator.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Tax-Calculator
   ```

3. Compile the Java file:
   ```bash
   javac TaxCalculator.java
   ```

4. Run the application:
   ```bash
   java TaxCalculator
   ```

## Usage

When you run the application, you'll see the main menu with the following options:

```
[1] Withholding Tax
[2] Payable Tax
[3] Income Tax
[4] Social Security Contribution Levy (SSCL) Tax
[5] Leasing Payment
[6] Exit
```

Simply enter the corresponding number to navigate to your desired calculation.

## Tax Calculation Methods

### 1. Withholding Tax

#### Rent Tax
- **Threshold**: Rs. 100,000
- **Rate**: 10% on amounts exceeding the threshold
- **Formula**: `(rent - 100,000) × 0.1`

#### Bank Interest Tax
- **Rate**: 5% on all bank interest
- **Formula**: `interest × 0.05`

#### Dividend Tax
- **Threshold**: Rs. 100,000
- **Rate**: 14% on amounts exceeding the threshold
- **Formula**: `(dividend - 100,000) × 0.14`

### 2. Payable Tax (Monthly Employee Payments)

Progressive tax brackets:
- **Rs. 100,001 - 141,667**: 6%
- **Rs. 141,668 - 183,333**: 12%
- **Rs. 183,334 - 225,000**: 18%
- **Rs. 225,001 - 266,667**: 24%
- **Rs. 266,668 - 308,333**: 30%
- **Above Rs. 308,333**: 36%

### 3. Income Tax (Annual Income)

Progressive tax brackets:
- **Rs. 1,200,001 - 1,700,000**: 6%
- **Rs. 1,700,001 - 2,200,000**: 12%
- **Rs. 2,200,001 - 2,700,000**: 18%
- **Rs. 2,700,001 - 3,200,000**: 24%
- **Rs. 3,200,001 - 3,700,000**: 30%
- **Above Rs. 3,700,000**: 36%

### 4. SSCL Tax
Combines sales tax (2.5%) and VAT (15%) calculations:
- Sales Tax: `value × 0.025`
- VAT: Applied to the value including sales tax
- Total SSCL Tax: Sales tax + VAT

### 5. Leasing Calculations

#### Monthly Installment Formula
```
Monthly Payment = A × i / (1 - (1 + i)^(-n))
```
Where:
- A = Lease amount
- i = Monthly interest rate (annual rate ÷ 12 ÷ 100)
- n = Number of months (years × 12)

#### Maximum Lease Amount Formula
```
Lease Amount = PMT × (1 - (1 + i)^(-n)) / i
```
Where PMT is the affordable monthly payment.

## Menu Navigation

### Main Menu Options:
1. **Withholding Tax** → Sub-menu for rent, bank interest, and dividend taxes
2. **Payable Tax** → Monthly employee payment tax calculation
3. **Income Tax** → Annual income tax calculation
4. **SSCL Tax** → Social Security Contribution Levy calculation
5. **Leasing Payment** → Sub-menu for leasing calculations
6. **Exit** → Close the application

### Navigation Tips:
- Enter numbers to select menu options
- Follow on-screen prompts for input
- Use 'Y' to continue or 'N' to return/exit
- Invalid inputs will prompt for re-entry

## Examples

### Example 1: Rent Tax Calculation
```
Input: Monthly rent = Rs. 150,000
Calculation: (150,000 - 100,000) × 0.1 = Rs. 5,000
Output: You have to pay rent tax: 5000.00
```

### Example 2: Monthly Installment Calculation
```
Input: 
- Lease amount = Rs. 2,000,000
- Annual interest rate = 12%
- Number of years = 4

Output: Your monthly installment: 52,637.45
```

### Example 3: Income Tax Calculation
```
Input: Annual income = Rs. 2,500,000
Calculation: Progressive tax calculation across brackets
Output: You have to pay Income Tax per year: 210,000.00
```

## System Requirements

- **Operating System**: Windows, macOS, or Linux
- **Java**: JDK 8 or higher
- **Memory**: Minimum 64 MB RAM
- **Storage**: 1 MB available space

## Input Validation

The application includes comprehensive input validation:
- ✅ Negative number detection
- ✅ Range validation for years (1-5 for leasing)
- ✅ Error messages with retry options
- ✅ Type checking for numeric inputs

## Error Handling

- **Invalid Menu Selection**: Prompts user to try again or exit
- **Negative Values**: Displays error message and requests valid input
- **Out of Range Values**: Specific validation for year inputs (leasing calculations)
- **Type Mismatches**: Scanner handles non-numeric inputs gracefully

## Development Notes

### Code Structure
- **Single Class Design**: All functionality contained in `TaxCalculator` class
- **Static Methods**: All methods are static for easy access
- **Modular Functions**: Separate methods for each tax calculation type
- **Console Utilities**: Cross-platform console clearing functionality

### Best Practices Implemented
- Input validation and error handling
- Clear method naming and organization
- Consistent user interface design
- Proper mathematical precision handling

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-tax-calculation`)
3. Commit your changes (`git commit -am 'Add new tax calculation method'`)
4. Push to the branch (`git push origin feature/new-tax-calculation`)
5. Create a Pull Request

### Guidelines for Contributors
- Follow existing code formatting and naming conventions
- Add appropriate input validation for new features
- Include error handling for edge cases
- Update documentation for new tax calculation methods
- Test thoroughly across different operating systems

## Future Enhancements

- [ ] GUI interface using JavaFX or Swing
- [ ] Database integration for storing calculation history
- [ ] Export results to PDF or Excel
- [ ] Support for multiple currencies
- [ ] Tax law updates and configuration files
- [ ] User profiles and saved calculations
- [ ] Advanced reporting features

## Troubleshooting

### Common Issues

1. **"Command not found" error**
   - Ensure Java is installed and added to PATH
   - Verify JDK installation: `java -version`

2. **Compilation errors**
   - Check Java syntax and ensure JDK version compatibility
   - Verify file name matches class name exactly

3. **Console clearing issues**
   - The application automatically detects OS and uses appropriate clearing method
   - Some IDEs may not support console clearing

4. **Input format errors**
   - Use decimal points (not commas) for decimal numbers
   - Enter numeric values only when prompted

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

**Pasindu OG**
- GitHub: [@PasinduOG](https://github.com/PasinduOG)
- Repository: [Tax-Calculator](https://github.com/PasinduOG/Tax-Calculator)

---

*For questions, suggestions, or issues, please open an issue on the GitHub repository.*

**Version**: 1.0.0  
**Last Updated**: August 2025
