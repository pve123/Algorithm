package 그래프;

import java.util.*;

/* 인접 리스트를 이용한 방향성 있는 그래프 클래스 */
class DFS_Graph {

	private int V;
	private LinkedList<Integer> link[];

	public DFS_Graph(int v) {
		this.V = v;
		link = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			link[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		link[v].add(w);
	}

	public void DFS(int v) {

		boolean[] visited = new boolean[V];

		DFS_Util(v, visited);
	}

	public void DFS_Util(int v, boolean[] visited) {

		visited[v] = true;
		System.out.printf("%3d", v);
		Iterator<Integer> i = link[v].iterator();
		while (i.hasNext()) {
			int n = i.next();

			if (!visited[n]) {
				DFS_Util(n, visited);
			}
		}
	}

	public static void main(String args[]) {
		DFS_Graph g = new DFS_Graph(4);
		System.out.println("============ 깊이우선 탐색 ============");
		for (int i = 0; i < g.V; i++) {
			System.out.print("정점 " + i + "번 부터 탐색 : ");
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(1, 2);
			g.addEdge(2, 0);
			g.addEdge(2, 3);
			g.addEdge(3, 2);
			g.DFS(i); /* 주어진 노드를 시작 노드로 DFS 탐색 */
			System.out.println();
		}
	}
}
