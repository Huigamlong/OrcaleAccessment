package com.example.demo.model;

import java.util.List;

public class Result {

	private List<Integer> fibonacci;
	private List<Integer> sorted;

	public Result(List<Integer> fibonacci, List<Integer> sorted) {
		super();
		this.fibonacci = fibonacci;
		this.sorted = sorted;
	}

	public Result() {
		super();
	}

	public List<Integer> getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(List<Integer> fibonacci) {
		this.fibonacci = fibonacci;
	}

	public List<Integer> getSorted() {
		return sorted;
	}

	public void setSorted(List<Integer> sorted) {
		this.sorted = sorted;
	}

	@Override
	public String toString() {
		return "Result [fibonacci=" + fibonacci + ", sorted=" + sorted + "]";
	}

}
