package 큐;

import java.util.Vector;

public class Queue {

	private Vector<String> qArray;

	Queue() {
		this.qArray = new Vector<>();
	}

	public void push(String data) {
		qArray.add(data);
	} // 삽입

	public void remove() {
		if (qArray.size() == 0) {
			throw new IndexOutOfBoundsException("큐가 비어있습니다.");
		} else {
			qArray.remove(qArray.get(0));
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue();
		q.push("배테랑");
		q.push("킹덤");
		q.push("정직한후보");
		q.remove();
		q.remove();
		System.out.println("큐 : " + q.qArray);
	}
}
