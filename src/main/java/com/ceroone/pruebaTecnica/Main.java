package com.ceroone.pruebaTecnica;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {

	public static void main(String[] args) {
		try {
			String url = "https://app.holded.com/reporting/salesordersbyproduct";
			final Document document = Jsoup.connect("https://app.holded.com/reporting/salesorders").get();
			
			for(Element row : document.select(
					"table.table cell-border table-hover dataTable no-footer")) {
				final String ticker = 
						row.select("td:nth-of-type(1)").text();
				System.out.println(ticker);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
