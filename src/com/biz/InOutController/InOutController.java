package com.biz.InOutController;

import java.io.IOException;

import com.biz.InOutService.InOutService;

public class InOutController {

	public static void main(String[] args) {

		InOutService sService = new InOutService();
		
		try {
			sService.Reader();
			sService.viewList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
