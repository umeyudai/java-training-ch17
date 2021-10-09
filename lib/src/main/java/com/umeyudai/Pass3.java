package com.umeyudai;
import java.util.HashMap;
import java.util.Map;
public class Pass3 {
    public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("cherry", "チェリー");
		map.put("apple", "リンゴ");
		map.put("pear", "ナシ");
		map.put("banana", "バナナ");
		map.put("grape", "ブドウ");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"\t- " + entry.getValue());
		}
		System.out.println("banana : " + map.get("banana"));
		System.out.println("pineapple : " + map.getOrDefault("pineapple", "未登録"));
	}
}
