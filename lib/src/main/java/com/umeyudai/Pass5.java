package com.umeyudai;
import java.time.LocalDate;
import java.util.Map;
public class Pass5 {
    public static void main(String[] args) {
		Map<String, LocalDate> map = Map.of("建国記念の日",LocalDate.of(2020,2,11),
											 "昭和の日",LocalDate.of(2020,4,29),
											 "憲法記念日",LocalDate.of(2020,5,3),
											 "みどりの日",LocalDate.of(2020,5,4),
											 "こどもの日",LocalDate.of(2020,5,5));
		
		for(Map.Entry<String, LocalDate>e : map.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
									

	}
}
