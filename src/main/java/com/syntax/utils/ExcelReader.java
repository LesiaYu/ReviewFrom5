package com.syntax.utils;

import com.syntax.utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static void main(String[] args) {

        var excelData=read(Constants.EXCEL_FILE_PATH, "sheet1");
        System.out.println(excelData);

    }
    public static List<Map<String,String>> read(String filePath, String sheetName){

        List<Map<String,String>> mapList=new ArrayList<>();

        try{
            FileInputStream fileInputStream=new FileInputStream(filePath);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet(sheetName);

            Row hederRow=sheet.getRow(0);
            int nOfRows=sheet.getPhysicalNumberOfRows();

            for (int i = 1; i <nOfRows; i++) {
                Map<String,String> rowMap= new LinkedHashMap<>();
                Row row= sheet.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    String key=hederRow.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    rowMap.put(key,value);
                }
                mapList.add(rowMap);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return mapList;
    }
}
