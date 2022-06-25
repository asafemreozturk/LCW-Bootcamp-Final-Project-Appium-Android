@LoginPage
Feature: Login Page

  @OpenLoginPage
  Scenario: Open Login Page
    Given Emre is on Home Page
    When Click Profile Button
    Then Emre is on Login Page


  @WrongEmail
  Scenario: Wrong Email
    Given Emre is on Home Page
    When Click Profile Button
    Then Emre is on Login Page
    When Click email radio button
    Then Enter wrong "email@com" to mail
    Then Click Login Button

  @WrongPassword
  Scenario: Wrong Password
    Given Emre is on Home Page
    When Click Profile Button
    Then Emre is on Login Page
    When Click email radio button
    Then Enter wrong "asds12" to password
    Then Click Login Button

  @WrongPhone
  Scenario: Wrong Phone
    Given Emre is on Home Page
    When Click Profile Button
    Then Emre is on Login Page
    When Click telefon radio button
    Then Enter wrong "2323233322" phone number
    Then Click Login Button

  @ForgotPassword
  Scenario: Forgot Password
    Given Emre is on Home Page
    When Click Profile Button
    Then Click Forgot Password
    When Enter "email@gmail.com" to e-mail placeholder
    Then Click send button

  @CreateAccount
  Scenario: Create Account
    Given Emre is on Home Page
    When Click Profile Button
    Then Emre is on Login Page
    When Click register button on login page
    Then Enter "email@gmail.com" to email
    Then Enter "password" to password
    Then Enter "5356281846" to number
    Then Click Sozlesme radio button
    Then Click register button

