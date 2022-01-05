package com.davidmagalhaes.cursomc.resources.utils;

import java.util.ArrayList;
import java.util.List;

public class URL {

	public static List<Integer> decondeIntList(String s){
		String[] vet = s.split(",");
		List<Integer> list = new ArrayList<>();
		for(int i=0; i <vet.length; i++) {
			list.add(Integer.parseInt(vet[i]));
		}
		return list;
		
//		return Arrays.asList(s.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
	}
}
