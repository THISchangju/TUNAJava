package org.TUNA.day11.sort.run;

import org.TUNA.day11.sort.Exam_SortRecap;

public class Run {
	public static void main(String[] args) {
		Exam_SortRecap sort = new Exam_SortRecap();
		sort.bubbleSort();
		System.out.println();
		sort.selectionSort();
		System.out.println();
		sort.insertionSort();
	}
}
