package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	private final Price type1 = new Price("A",795.00,145.31,0,20);
	private final Price type2 = new Price("B",1056.00,130.46,21,80);
	private final Price type3 = new Price("C",1232.00,128.26,81,200);
	private final Price type4 = new Price("D",1892.00,124.96,201,500);
	private final Price type5 = new Price("E",6292.00,116.16,501,800);
	private final Price type6 = new Price("F",12452.00,108.46,801,922337290);
	

	@GetMapping("/getPrice")
	public double getPrice(@RequestBody InputUsage inputusage) {
		Price targetPrice = type1;
		switch(inputusage.getType()) {
			case "A":
				targetPrice = type1;
				break;
			case "B":
				targetPrice = type2;
				break;
			case "C":
				targetPrice = type3;
				break;
			case "D":
				targetPrice = type4;
				break;
			case "E":
				targetPrice = type5;
				break;
			case "F":
				targetPrice = type6;
				break;
		}
		double basicFee = targetPrice.getBasicFee();
		double unitRate = targetPrice.getUnitRate();
		double result = basicFee + (unitRate * inputusage.usage);
		return result;
	}
}
