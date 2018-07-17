package com.capg.app.ParallelProject_152627;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.capg.bean.AccountDetails;
import com.capg.bean.CustomerDetails;
import com.capg.service.CustomerDetailsValidate;
import com.capg.service.WalletService;

public class App {
	public static void main(String[] args) {

		CustomerDetailsValidate validation = new CustomerDetailsValidate();
		WalletService service = new WalletService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			AccountDetails details = new AccountDetails();
			CustomerDetails cust = new CustomerDetails();

			System.out.println("   PAYMENT WALLET APPLICATION     ");

			System.out.println(" 1. Create an Account ");
			System.out.println(" 2. Show Balance ");
			System.out.println(" 3. Deposit ");
			System.out.println(" 4. Withdraw ");
			System.out.println(" 5. Fund Transfer ");
			System.out.println(" 6. Print Transactions ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your details");
				try {
					while (true) {

						System.out.println("Enter your Name");
						String name = br.readLine();

						cust.setName(name);
						if (!validation.validateName(name)) {
							System.err.println("Invalid Name format");
							continue;
						} else
							break;
					}

					while (true) {
						System.out.println("Enter your age");
						int age = Integer.parseInt(br.readLine());
						cust.setAge(age);
						if (!validation.validateAge(age)) {
							System.err.println("Invalid Age");
							continue;
						} else {
							break;
						}

					}

					while (true) {
						System.out.println("Enter your Gender");
						String gender = br.readLine();
						cust.setGender(gender);
						if (!validation.validateGender(gender)) {
							System.err.println("The given Gender is not valid!");
							continue;
						} else
							break;
					}

					while (true) {
						System.out.println("Enter a Unique Username");
						String userName = br.readLine();
						details.setUserName(userName);
						if (!validation.validateUserName(userName)) {
							System.err.println("Invalid Username");
							continue;
						} else {
							break;
						}
					}
					while (true) {
						String password;
						System.out.println("Enter a Password");
						password = br.readLine();
						details.setPassword(password);
						if (validation.validatePassword(password)) {
							break;
						} else {
							System.err.println("Invalid password");
							continue;
						}
					}

					while (true) {
						System.out.println(" Enter your Email");
						String email = br.readLine();
						cust.setEmailId(email);
						if (validation.validateEmailID(email)) {
							break;
						} else {
							System.err.println("Invalid Email try again");
							continue;
						}
					}
					while (true) {
						System.out.println("Enter your Mobile Number");
						String phoneNo = br.readLine();
						cust.setPhoneNo(phoneNo);
						if (validation.validatePhoneNo(phoneNo)) {
							break;
						} else {
							System.err.println(" enter a valid mobile number.");
							continue;
						}
					}

					System.out.println("Your new account has been created succcesfully \n");
					long bankAccount = (long) (Math.random() * 1000000 + 9999999);
					details.setBankAccount(bankAccount);
					details.setBalance(0);
					details.setDetails(cust);
					service.createAccount(details);
					break;

				} catch (IOException e) {

					e.printStackTrace();
				}

			case 2:

				try {
					System.out.println("Enter your username");
					String username = br.readLine();
					System.out.println("Enter your password");
					String password = br.readLine();
					details = validation.validateLogIn(username, password);

					if (details != null) {
						System.out.println(service.showBalance(details));
					} else if (details == null) {
						System.err.println("Incorrect Username or Password!");
					}

					break;
				} catch (IOException e) {

					e.printStackTrace();
				}
			case 3:

				try {
					System.out.println("Enter your username");
					String username = br.readLine();
					System.out.println("Enter your password");
					String password = br.readLine();
					details = validation.validateLogIn(username, password);

					if (details != null) {
						System.out.println("Enter the amount you want to deposit");
						double depo = sc.nextDouble();
						System.out.println(service.depositBalance(depo, details));
						System.out.println("Successfuly Deposited.");
					} else if (details == null) {
						System.err.println("Incorrect Username or Password!");
					}
					break;

				} catch (IOException e) {
					e.printStackTrace();
				}

			case 4:

				try {
					System.out.println("Enter your username");
					String username = br.readLine();
					System.out.println("Enter your password");
					String password = br.readLine();
					details = validation.validateLogIn(username, password);
					if (details != null) {
						System.out.println("Enter the amount you want to withdraw");
						double withdraw = sc.nextDouble();
						if (service.withdrawBalance(withdraw, details) != null) {
							System.out.println(details);
							System.out.println("Successfuly Withdrawn.");
							break;
						} else if (service.withdrawBalance(withdraw, details) == null) {
							System.err.println("No sufficient balance");
							break;
						}

					} else if (details == null) {
						System.err.println("Incorrect Username or Password");
					}

					break;
				} catch (IOException e) {
					e.printStackTrace();
				}

			case 5:

				try {
					System.out.println("Enter your username ");
					String username = br.readLine();
					System.out.println("Enter your password ");
					String password = br.readLine();
					details = validation.validateLogIn(username, password);
					if (details != null) {

						System.out.println("Enter the bank account you want to  transfer funds");
						long bankAccount2 = Long.parseLong(br.readLine());
						System.out.println("Enter the amount");
						double amount = Double.parseDouble(br.readLine());
						details = service.transferFund(bankAccount2, amount, details);
						if (details != null) {
							details.setAmount(amount);
							System.out.println(" Funds Transferred Successfully");
							break;
						} else if (details == null) {
							break;
						}

					}
				}

				catch (IOException e) {

				}
			case 6:

				try {
					System.out.println("Enter your username");
					String username = br.readLine();
					System.out.println("Enter your password");
					String password = br.readLine();
					details = validation.validateLogIn(username, password);
					details = service.printTransaction();
//					if (details != null) {
////						System.out.println("Enter the transaction ID");
////						long transId = Long.parseLong(br.readLine());
//					
////						if (service.printTransaction() != null) {
////							System.out.println("Transaction details " + details.getTransactionId());
////							System.out.println("Account Number: " + details.getBankAccount());
////							System.out.println("Amount: " + details.getAmount());
////							System.out.println("Balance"+details.getBalance());
////							break;
////						}
//
//					} else
//						System.err.println("Invalid Details!");
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}
}