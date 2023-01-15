package baekjoon._18_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_1920 {
	public static void main(String[] args) throws Exception {
		// [백준] 1920 수 찾기
		/*
		 * 문제
			N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
			다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
			다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
			모든 정수의 범위는 -2^31 보다 크거나 같고 2^31보다 작다.
			
			출력
			M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
			
			예제 입력 1 
			5
			4 1 5 2 3
			5
			1 3 7 9 5
			예제 출력 1 
			1
			1
			0
			0
			1
		 * */
		
		solve();
	}

	private static void solve() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		String[] strNArr = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] strMArr = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			int mapNum = Integer.parseInt(strNArr[i]);
			map.put(mapNum, mapNum);
		}
		
		for(int i = 0; i < M; i++) {
			if(map.containsKey(Integer.parseInt(strMArr[i]))) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
