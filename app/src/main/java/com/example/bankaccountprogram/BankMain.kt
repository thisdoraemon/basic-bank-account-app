package com.example.bankaccountprogram

fun main() {
    print("Enter the account holder's name: ")
    val accountHolderName = readln()

    print("Enter your initial balance: ")
    val initialBalance = readln().toDouble()

    val bankAccount = BankAccount(accountHolderName, initialBalance)

    var continueTransaction = true

    while (continueTransaction) {
        print("Do you want a deposit or a withdraw? ")
        val choice = readln()

        if (choice == "deposit") {
            print("How many that you want to deposit: ")
            val deposit = readln().toDouble()
            bankAccount.deposit(deposit)
        } else if (choice == "withdraw") {
            print("How many that you want to withdraw: ")
            val withdraw = readln().toDouble()
            bankAccount.withdraw(withdraw)
        } else {
            println("That is not a valid operation!")
        }

        print("Do you want to make transaction again? (Y/N): ")
        val loopChoice = readln().lowercase()

        if (loopChoice != "y") {
            continueTransaction = false
        }
    }

    bankAccount.run {
        displayTransactionHistory()
        acctBalance()
    }
}