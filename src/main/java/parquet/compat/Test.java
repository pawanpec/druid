package parquet.compat;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File parquetFile = new File("/Users/aca/Desktop/Pawan/code_base/parquet-compatibility-master/parquet-testdata/tpch/customer.parquet");
		File csvOutputFile = new File("/Users/aca/Desktop/Pawan/code_base/parquet-compatibility-master/parquet-testdata/tpch/customer1.csv");
		try {
			//ConvertUtils.convertCsvToParquet(csvOutputFile,parquetFile);
			ConvertUtils.convertParquetToCSV(parquetFile, csvOutputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
