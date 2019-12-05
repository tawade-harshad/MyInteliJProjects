package com.training.controller;

import com.training.model.ICICI;
import java.util.Scanner;

public class ConsumerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ICICI ic = new ICICI();
        ic.setMinimumBalance(5000);
        ic.setStartBalance(6000);
        ic.setMinFDAmount(10000);
        ic.setMinFDTenure(3);

        Boolean bankOp;

        while (true) {
            bankOp = true;
            System.out.println("**********************************************");
            System.out.println("**     Welcome to Indian Banking System     **");
            System.out.println("**********************************************");
            System.out.println("Select bank of your choice. [Press relevant #]");
            System.out.println("Press 1 for > I.C.I.C.I");
            System.out.println("Press 2 for > S.B.I");
            System.out.println("Press 3 for > Axis");
            System.out.println("Press 4 for > Standard Chartered");
            System.out.println("Press 5 to exit.");
            int optBank = sc.nextInt();

            while (bankOp) {
                System.out.println("\n");
                System.out.println("Choose operation to perform");
                System.out.println("=============================");
                System.out.println("1. Deposit ");
                System.out.println("2. Withdraw ");
                System.out.println("3. Open FD Account ");
                System.out.println("4. Exit Operations ");
                int bankOperation = sc.nextInt();


                switch (optBank) {
                    case 1:

                        if (bankOperation == 1) {
                            System.out.println("Enter amount to deposit");
                            int amount = sc.nextInt();
                            ic.deposit(amount, ic.getStartBalance());

                        } else if (bankOperation == 2) {
                            System.out.println("Enter amount to withdraw");
                            int amount = sc.nextInt();
                            ic.withdraw(amount, ic.getMinimumBalance(), ic.getStartBalance());

                        } else if (bankOperation == 3) {

                            System.out.println("Enter FD amount.");
                            int amount = sc.nextInt();
                            System.out.println("Enter FD tenure.");
                            int tenure = sc.nextInt();
                            ic.openFD(amount, tenure, ic.getMinFDAmount(), ic.getMinFDTenure());
                        } else if (bankOperation == 4) {
                            bankOp=false;
                        } else {
                            System.out.println("Invalid Operation Selected.");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option selected.");
                        break;
                }
            }
        }
    }
}