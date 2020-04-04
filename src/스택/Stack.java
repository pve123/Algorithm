package 스택;

import java.util.Vector;

public class Stack {

	private Vector<String> stackArray;

	public Stack() {
		this.stackArray = new Vector<>();
	}

	public void push(String data) {
		stackArray.add(data);
	} // 삽입

	public String peek() {

		if (stackArray.size() == 0) {
			throw new IndexOutOfBoundsException("스택이 비어있습니다.");
		} else {
			return stackArray.get(stackArray.size() - 1);
		}
	} // 최상위

	public void remove() {
		if (stackArray.size() == 0) {
			throw new IndexOutOfBoundsException("스택이 비어있습니다.");
		} else {
			stackArray.remove(stackArray.get(stackArray.size() - 1));
		}
	} // 삭제

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("바나나");
		stack.remove();
		stack.push("사과");
		stack.push("오렌지");
		stack.push("멜론");
		stack.remove();
		System.out.println("스택 : " + stack.stackArray);
		System.out.println(" 최상위 : " + stack.peek());

	}
}
