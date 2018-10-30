package com.example.OCP.advancedClassDesing.nestedClasses.variablesInNestedClass;

/**
 * Created by guille on 10/29/18.
 */

    interface Account {
        public default String getId() {
            return "0000";
        }
        public void getTheAccountId();
    }

    interface PremiumAccount extends Account {
        public String getId();
        public default void thebodyMethod(){
            System.out.print("Something");
        }

        public static void staticMethod(){
            System.out.print("Static methods also have body");
        }
    }
//Tengo que implementar los metodos sin cuerpo
    public class BankAccount implements PremiumAccount {
        public static void main(String[] args) {
            Account acct = new BankAccount();
            System.out.println(acct.getId());

        }


        @Override
        public String getId() {
            return null;
        }

        @Override
        public void getTheAccountId() {

        }
    }


