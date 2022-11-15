package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
        teacherLoanManager.loanCalculate();

        LoanUI loanUI = new LoanUI();
        loanUI.Calculator(new FarmLoanManager());
        //done homework1
    }
}
