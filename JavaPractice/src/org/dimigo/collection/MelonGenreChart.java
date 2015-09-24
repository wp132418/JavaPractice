/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *  |_ melonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("내 첫사랑", "베리굿"));
		list.add(new Music("또 다시 사랑", "임창정"));
		list.add(new Music("부산에 가면", "박진영"));
		
		map.put("발라드", list);
		
		List<Music> list2 = new ArrayList<Music>();
		list2.add(new Music("커피", "유재환,김예림"));
		list2.add(new Music("다 잘될거야", "쿨"));
		
		map.put("댄스", list2);
		
		System.out.println("----- << 멜론 장르별 챠트 >> -----");
		printMap(map);
		
		System.out.println("----- << 발라드 3위 곡 변경 >> -----");
		list.set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("----- << 발라드 1위 곡 삭제 >> -----");
		list.remove(0);
		printMap(map);
		
		System.out.println("----- << 전체 리스트 삭제 >> -----");
		map.clear();
		printMap(map);
		
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");
			int i = 1;
			for(Music v : map.get(key)) {
				System.out.println(i++ + "." + v.toString());
			}
		}
		System.out.println();
	}

}
