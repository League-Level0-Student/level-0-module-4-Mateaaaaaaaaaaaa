package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscore {
	public static void main(String[] args) {



		String score= JOptionPane.showInputDialog(" what is your test score?");

		double scoreAsDouble= Double.parseDouble(score);

		if (scoreAsDouble>=90) {

			JOptionPane.showMessageDialog(null,"Wow! You must have studied really hard for that test");


		}

		if (scoreAsDouble<=60) {

			JOptionPane.showMessageDialog(null,"Wow! You should have more studied for that test");

		}

if (scoreAsDouble> 60&& scoreAsDouble<90) {
	
	JOptionPane.showMessageDialog(null,"cool");

	}

}}