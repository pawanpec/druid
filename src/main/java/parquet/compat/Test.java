package parquet.compat;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
	//	String parquetFileName="userdata1.parquet";
		String parquetFileName="part-r-00000.snappy.parquet";
		String outputCSVFileName="click.csv";
		File parquetFile = new File("/Users/aca/Desktop/Pawan/code_base/ParquetToJson/test_data/"+parquetFileName);
		File csvOutputFile = new File("/Users/aca/Desktop/Pawan/code_base/ParquetToJson/test_data/"+outputCSVFileName);
		try {
			//ConvertUtils.convertCsvToParquet(csvOutputFile,parquetFile);
			ConvertUtils.convertParquetToCSV(parquetFile, csvOutputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
