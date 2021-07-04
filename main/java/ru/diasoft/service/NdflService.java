package ru.diasoft.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import ru.diasoft.exception.EntityNotFoundException;
import ru.diasoft.model.Ndfl;
import ru.diasoft.repository.NdflRepository;
import ru.diasoft.util.Range;

import javax.transaction.Transactional;
import java.io.*;
import java.util.*;

@Service
public class NdflService {
    private NdflRepository ndflRepository;
    Map<Integer, String> map = new HashMap<>();
    {
        map.put(0, "O2:AA2");
        map.put(1, "O4:X4");
        map.put(2, "AA4:AC4");
        map.put(3, "I7:O7");
        map.put(4, "AE7:AF7");
        map.put(5, "M9:Y9");
        map.put(6, "H11:AQ11");
        map.put(7, "H13:AQ13");
        map.put(8, "H15:AQ15");
        map.put(9, "L17:L17");
        map.put(10,"T17:U17");
//        map.put(11, "W17:Y17");
//        map.put(12, "AA17:AD17");
        map.put(11, "AO17:AQ17");
        map.put(12, "L19:M19");
        map.put(13, "W19:AQ19");
        map.put(14, "AG21:AH21");
        map.put(15, "G23:U23");
        map.put(16, "G25:U25");
        map.put(17, "AG25:AQ25");
        map.put(18, "G27:Q27");
        map.put(19, "G29:Q29");
        map.put(20, "U57:AJ57");
        map.put(21, "U59:AJ59");
    }

    public NdflService(NdflRepository ndflRepository) {
        this.ndflRepository = ndflRepository;
    }


    public void execById(UUID id) throws IOException {
        List<String> listCellValue = getList(id);
        File file = new File("C:\\progect\\NDFL\\main\\resources\\pattern.xlsx");
        InputStream is = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(is);
        workbook.getCellStyleAt(1);
        Sheet sheet =  workbook.getSheetAt(0);
        List<CellRangeAddress> cellRangeAddress = sheet.getMergedRegions();
//        for (int i =0; i< map.size(); i++) {
//            for (int k = 0 ; k < cellRangeAddress.size(); i++) {
//                if (cellRangeAddress.get(k).formatAsString().equals(map.get(i))) {
//                    sheet.removeMergedRegion(k);
//                }
//            }
//        }
        System.out.println(map.size());
        System.out.println(listCellValue.size());
        for (int i = 0; i< map.size(); i++) {
            CellRangeAddress adress = CellRangeAddress.valueOf(map.get(i));
            int rowNum = adress.getFirstRow();
            int column = adress.getFirstColumn();
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(column);
            if (cell == null) {
                cell = row.createCell(column);
            }
            cell.setCellValue(listCellValue.get(i));
//            sheet.addMergedRegion(adress);
         }
        try {
            FileOutputStream fos = new FileOutputStream("C:\\progect\\NDFL\\main\\resources\\Ndfl.xlsx");
            workbook.write(fos);
            fos.close();
            workbook.close();
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Transactional
    public Ndfl getById(UUID id) {
         return ndflRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("ndfl not found", id));

    }

    public List<String> getList(UUID id) {
        Ndfl ndfl = getById(id);
        List<String> list = new ArrayList<>();
        list.add(0, ndfl.getInn());
        list.add(1, ndfl.getKpp());
        list.add(2, ndfl.getList());
        list.add(3, ndfl.getDocumentCode());
        list.add(4, ndfl.getInfAdjNum());
        list.add(5, ndfl.getInnInRF());
        list.add(6, ndfl.getSurname());
        list.add(7, ndfl.getFirstName());
        list.add(8, ndfl.getPatronymic());
        list.add(9, ndfl.getTheTaxpayerStatus());
        list.add(10, ndfl.getDateBirthday());
        list.add(11, ndfl.getCountryCodeId());
        list.add(12, ndfl.getDocumentCode());
        list.add(13, ndfl.getSerialOfDocument() + " " + ndfl.getNumberOfDocument());
        list.add(14, ndfl.getTaxBase());
        list.add(15, ndfl.getSumSalary());
        list.add(16, ndfl.getTaxAmount());
        list.add(17, ndfl.getTaxTrans());
        list.add(18, ndfl.getTaxAmountCalculated());
        list.add(19, ndfl.getTaxAmountWithheld());
        list.add(20, ndfl.getSumSalaryNotWithHeld());
        list.add(21, ndfl.getSumSalaryNonDex());
        return list;
    }
}
