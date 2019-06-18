package com.biz.InOutService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.InOutVO.InOutVO;

public class InOutService {

	String fileName = "src/com/biz/inout/매입매출.txt";
	FileReader fileReader;
	BufferedReader buffer;
	List<InOutVO> ioList = new ArrayList<InOutVO>();

	public void Reader() throws IOException {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);


		System.out.println("==========================================================");
		System.out.println("거래일자\t상품명\t구분\t단가\t수량\t매입금액\t매출금액\n");
		System.out.println("----------------------------------------------------------");

		while(true) {
			String reader = buffer.readLine();
			if(reader == null) break;
			
			String[] readers = reader.split(":");

			InOutVO vo = new InOutVO();
			vo.setDate(readers[0]);
			vo.setName(readers[1]);
			vo.setInout(readers[2]);
			if(vo.getInout().equals("1")) {
				vo.setInout("매입");
				int intp = Integer.valueOf(readers[3]);
				int intv = Integer.valueOf(readers[4]);
				int times = intp * intv;
				vo.setIntTotal(times);
			}
			if(vo.getInout().equals("2")) {
				vo.setInout("매출");
				int outp = Integer.valueOf(readers[3]);
				int outv = Integer.valueOf(readers[4]);
				int times = outp * outv;
				vo.setOutTotal(times);
			}
			vo.setPrice(readers[3]);
			vo.setVolume(readers[4]);
			ioList.add(vo);
			
		}
	}
	public void viewList() {
		for(InOutVO vo : ioList) {
			
			System.out.println(vo.toString());
		}
	}

}
