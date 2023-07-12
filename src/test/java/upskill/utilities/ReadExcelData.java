package upskill.utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static Map <String, Map<String, String>> setMapData() throws Exception {
		
		String path = System.getProperty("user.dir")+"/src/test/resource/Datasheets/ReadExcelSheets.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		int lastRow = sheet.getLastRowNum();
		
		
		Map<String, Map<String, String>> excelFile = new HashMap<String, Map<String, String>>();
		
		Map<String, String> dataMap = new HashMap<String, String>();
		
		
		for (int i = 0; i<=lastRow; i++) {
			Row row = sheet.getRow(i);
			Cell keyCell = row.getCell(0);
			Cell valueCell = row.getCell(1);
			DataFormatter datafor = new DataFormatter();
			String key =  datafor.formatCellValue(keyCell);
			String value =  datafor.formatCellValue(valueCell);
			dataMap.put(key, value);	
			excelFile.put("ReadExcelSheets", dataMap);	
		
		}
		return excelFile;	
	}
	public static String getMapData(String key) throws Exception {
		Map<String, String> getValue = setMapData().get("ReadExcelSheets");
		String value = getValue.get(key);
		return value;	
	}
	
	
	
}
