package 그래프;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_Graph {
	private int V; // 노드의 개수
	private LinkedList<Integer> link[]; // 인접 리스트

	/** 생성자 */
	BFS_Graph(int v) {
		V = v;
		link = new LinkedList[v];
		for (int i = 0; i < v; ++i) // 인접 리스트 초기화
			link[i] = new LinkedList<Integer>();
	}

	/** 노드를 연결 v->w */
	void addEdge(int v, int w) {
		link[v].add(w);
	}

	/** v를 시작 노드으로 한 BFS로 탐색하면서 탐색한 노드들을 출력 */
	void BFS(int v) {
		// 노드의 방문 여부 판단 (초깃값: false)
		boolean visited[] = new boolean[V];
		// BFS 구현을 위한 큐(Queue) 생성
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// 현재 노드를 방문한 것으로 표시하고 큐에 삽입(enqueue)
		visited[v] = true;
		queue.add(v);

		// 큐(Queue)가 빌 때까지 반복
		while (queue.size() != 0) {
			// 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
			v = queue.poll();
			System.out.printf("%3d", v);

			// 방문한 노드와 인접한 모든 노드를 가져온다.
			Iterator<Integer> i = link[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				// 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	/** 사용 방법 */
	public static void main(String args[]) {
		BFS_Graph g = new BFS_Graph(4);
		System.out.println("============ 너비우선 탐색 ============");
		for (int i = 0; i < g.V; i++) {
			System.out.printf("정점 " + i + "번 부터 탐색 : ");
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(1, 2);
			g.addEdge(2, 0);
			g.addEdge(2, 3);
			g.addEdge(3, 2);
			g.BFS(i); /* 주어진 노드를 시작 노드로 DFS 탐색 */
			System.out.println();
		}
	}

}
