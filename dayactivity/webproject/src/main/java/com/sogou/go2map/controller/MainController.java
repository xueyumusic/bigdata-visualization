package com.sogou.go2map.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MainController {
	
//	public String startEventDayActivity(HttpServletRequest req, HttpServletResponse resp) {
//		
//	}
	
	@RequestMapping("/home")
	public String home(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("###home");
		return "home";
	}
	
	@RequestMapping("/danum")
	public @ResponseBody List<Map<String, Object>> dayactivitynum(HttpServletRequest req, HttpServletResponse resp) {
		List<Map<String, Object>> jsonlist = new ArrayList<Map<String, Object>>();
		Map<String, Object> obj1 = new HashMap<String, Object>();
		obj1.put("date", "2015-09-01");
		obj1.put("num", 200000);
		
		Map<String, Object> obj2 = new HashMap<String, Object>();
		obj2.put("date", "2015-09-02");
		obj2.put("num", 210000);
		
		Map<String, Object> obj3 = new HashMap<String, Object>();
		obj3.put("date", "2015-09-03");
		obj3.put("num", 220000);
		
		Map<String, Object> obj4 = new HashMap<String, Object>();
		obj4.put("date", "2015-09-04");
		obj4.put("num", 230000);
		
		Map<String, Object> obj5 = new HashMap<String, Object>();
		obj5.put("date", "2015-09-05");
		obj5.put("num", 240000);
		
		Map<String, Object> obj6 = new HashMap<String, Object>();
		obj6.put("date", "2015-09-06");
		obj6.put("num", 250000);
		
		Map<String, Object> obj7 = new HashMap<String, Object>();
		obj7.put("date", "2015-09-07");
		obj7.put("num", 260000);
		
		jsonlist.add(obj1);
		jsonlist.add(obj2);
		jsonlist.add(obj3);
		jsonlist.add(obj4);
		jsonlist.add(obj5);
		jsonlist.add(obj6);
		jsonlist.add(obj7);
		
		return jsonlist;
	}
	
	@RequestMapping("/bimetric")
	public @ResponseBody Map<String, Object> bimetricdata() {
		System.out.print("###bimtric request");
		List<String> row1 = new ArrayList<String>();
		row1.add("薛宇");
		row1.add("软件开发工程师");
		row1.add("北京");
		row1.add("3425");
		row1.add("2015-09-16");
		row1.add("$224");
		List<List<String>> rows = new ArrayList<List<String>>();
		rows.add(row1);
		Map<String, Object> datamap = new HashMap<String, Object>();
		datamap.put("data", rows);
		return datamap;
	}
}
