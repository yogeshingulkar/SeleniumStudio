package assignment_16March;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.ss.usermodel.*;

public class Names_DataDriven {

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\M65\\Selenium\\SeleniumFile\\Assignment.xlsx";
        
        List<String> namesList = getExcelData(filePath, "Sheet2");

        for (String name : namesList) {
            
            System.out.println("Reverse      : " + reverseString(name));
            System.out.println("Unique Chars : " + getUniqueCharacters(name));
            System.out.println("Frequency    : " + getCharFrequency(name));
            System.out.println("Total Length : " + name.length());
        }
    }

    public static List<String> getExcelData(String path, String sheetName) throws IOException {
        List<String> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             Workbook wb = WorkbookFactory.create(fis)) {
            
            Sheet sh = wb.getSheet(sheetName);
            for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
                Row row = sh.getRow(i);
                if (row != null && row.getCell(0) != null) {
                    data.add(row.getCell(0).toString());
                }
            }
        }
        return data;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String getUniqueCharacters(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) 
            set.add(c);
        
        
        StringBuilder sb = new StringBuilder();
        for (char c : set) 
            sb.append(c);
        
        return sb.toString();
    }

    public static Map<Character, Integer> getCharFrequency(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        String lowerStr = str.toLowerCase();
        
        for (char c : lowerStr.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}