{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyPiL6VKOY4qhr5wwUGZrLBc",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/Ashwitha286/Codsoft_3/blob/main/BankAccount.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": 2,
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/",
          "height": 106
        },
        "id": "3M027ZhugjBR",
        "outputId": "16a2c29d-a130-4b2f-edfe-6e61f6c65a8d"
      },
      "outputs": [
        {
          "output_type": "error",
          "ename": "SyntaxError",
          "evalue": "invalid syntax (<ipython-input-2-4f8ccd6f818a>, line 4)",
          "traceback": [
            "\u001b[0;36m  File \u001b[0;32m\"<ipython-input-2-4f8ccd6f818a>\"\u001b[0;36m, line \u001b[0;32m4\u001b[0m\n\u001b[0;31m    class BankAccount {\u001b[0m\n\u001b[0m                      ^\u001b[0m\n\u001b[0;31mSyntaxError\u001b[0m\u001b[0;31m:\u001b[0m invalid syntax\n"
          ]
        }
      ],
      "source": [
        "import java.util.Scanner;\n",
        "\n",
        "\n",
        "class BankAccount {\n",
        "    double balance;\n",
        "\n",
        "\n",
        "    public BankAccount(double initialBalance) {\n",
        "         this.balance = initialBalance;\n",
        "    }\n",
        "\n",
        "\n",
        "    public void deposit(double amount) {\n",
        "         balance += amount;\n",
        "         System.out.println(\"Deposit successful! New balance: $\" + balance);\n",
        "    }\n",
        "\n",
        "\n",
        "    public void withdraw(double amount) {\n",
        "        if (amount <= balance) {\n",
        "           balance -= amount;\n",
        "           System.out.println(\"Withdrawal successful! New balance: $\" + balance);\n",
        "        } else {\n",
        "           System.out.println(\"Insufficient balance! Current balance: $\" + balance);\n",
        "        }\n",
        "}\n",
        "\n",
        "\n",
        "     public void checkBalance() {\n",
        "         System.out.println(\"Current balance: $\" + balance);\n",
        "     }\n",
        " }\n",
        "\n",
        "\n",
        "   public class ATM {\n",
        "     public static void main(String[] args) {\n",
        "          BankAccount account = new BankAccount(500);  // Start with $500\n",
        "          Scanner scanner = new Scanner(System.in);\n",
        "\n",
        "          while (true) {\n",
        "              System.out.println(\"\\nATM Menu:\");\n",
        "              System.out.println(\"1. Withdraw\");\n",
        "              System.out.println(\"2. Deposit\")\n",
        "              System.out.println(\"3. Check Balance\");\n",
        "              System.out.println(\"4. Exit\");\n",
        "              System.out.print(\"Choose an option: \");\n",
        "\n",
        "              int option = scanner.nextInt();\n",
        "\n",
        "              if (option == 1) {\n",
        "                 System.out.print(\"Enter amount to withdraw: $\");\n",
        "                 double amount = scanner.nextDouble();\n",
        "                 account.withdraw(amount);\n",
        "              } else if (option == 2) {\n",
        "                 System.out.print(\"Enter amount to deposit: $\");\n",
        "                 double amount = scanner.nextDouble();\n",
        "                 account.deposit(amount);\n",
        "              } else if (option == 3) {\n",
        "                 account.checkBalance();\n",
        "              } else if (option == 4) { // Exit\n",
        "                 System.out.println(\"Thank you for using the ATM.\");\n",
        "                 break;\n",
        "              } else {\n",
        "                 System.out.println(\"Invalid option. Try again.\");\n",
        "              }\n",
        "           }\n",
        "\n",
        "             scanner.close();\n",
        "    }\n",
        " }\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        "\n",
        ""
      ]
    }
  ]
}