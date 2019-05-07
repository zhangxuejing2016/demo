package com.xj.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.Region;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/22.
 */
public class ExcelToolClass {
    private HSSFWorkbook wb = null;//得到Excel工作簿对象
    private HSSFSheet sheet = null;//得到Excel工作表对象

    public ExcelToolClass(HSSFWorkbook wb,HSSFSheet sheet){
        this.wb=wb;
        this.sheet = sheet;
    }

    /**
     * 创建通用的Excel头
     *
     * @param  headString  头部显示的字符
     *  @param colSum  该报表的列数
     */
    public void createNormalHead(String headString, int colSum){
        // 设置第一行
        HSSFRow row = sheet.createRow(0);//创建Excel工作表的行
        HSSFCell cell = row.createCell(0);//创建Excel工作表指定行的单元格
        row.setHeight((short) 1000);//设置高度
        // 定义单元格为字符串类型
        cell.setCellType(HSSFCell.ENCODING_UTF_16);// 中文处理
        cell.setCellValue(new HSSFRichTextString(headString));

        // 指定合并区域
        sheet.addMergedRegion(new Region(0, (short) 0, 0, (short) colSum));

        // 定义单元格格式，添加单元格表样式，并添加到工作簿
        HSSFCellStyle cellStyle = wb.createCellStyle();
        // 设置单元格水平对齐类型
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行
        // 设置单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("微软雅黑");//字体
        font.setFontHeightInPoints((short)16);//设置字体
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
    }

    /**
     * 创建报表第二行
     * @param params
     *            统计条件数组
     * @param colSum
     *            需要合并到的列索引
     *
     */
    @SuppressWarnings("deprecation")
    public void createNormalTwoRow(List<String> list, int colSum){
        // 创建第二行
        HSSFRow row1 = sheet.createRow(1);
        row1.setHeight((short) 400);//设置高度
        HSSFCell cell2 = row1.createCell(0);//创建Excel工作表指定行的单元格
        cell2.setCellType(HSSFCell.ENCODING_UTF_16);// 中文处理
        // 指定合并区域
        sheet.addMergedRegion(new Region(1, (short) 0, 1, (short) colSum));
        // 定义单元格格式，添加单元格表样式，并添加到工作簿
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 设置单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");//字体
        font.setFontHeightInPoints((short)10);//设置字体
        cellStyle.setFont(font);
        //HSSFCellStyle.ALIGN_CENTER  设定居中
        for(int i=0;i<list.size();i++){
            cteateCell(wb,row1,i,HSSFCellStyle.ALIGN_CENTER,list.get(i),cellStyle);
        }
    }

    /**
     * 设置报表标题
     *
     * @param columHeader
     *            标题字符串数组
     */
    public void createColumHeader(List<Map<String,Object>> listInfo) {
        // 定义单元格格式，添加单元格表样式，并添加到工作簿
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");//字体
        font.setFontHeightInPoints((short)10);//设置字体
        cellStyle.setFont(font);

        // 设置单元格背景色
        //cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
        //cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        HSSFCell cell3 = null;

        for (int i = 0; i < listInfo.size(); i++) {
            //循环插入数据
            HSSFRow row2 = sheet.createRow(i+2);
            row2.setHeight((short) 400);// 指定行高
            cell3 = row2.createCell(0);
            cell3.setCellStyle(cellStyle);
            cell3.setCellValue(new HSSFRichTextString(listInfo.get(i).get("序列").toString()));

            cell3 = row2.createCell(1);
            cell3.setCellStyle(cellStyle);
            cell3.setCellValue(new HSSFRichTextString((String) listInfo.get(i).get("姓名")));

            cell3 = row2.createCell(2);
            cell3.setCellStyle(cellStyle);
            cell3.setCellValue(new HSSFRichTextString(listInfo.get(i).get("年龄").toString()));

            cell3 = row2.createCell(3);
            cell3.setCellStyle(cellStyle);
            cell3.setCellValue(new HSSFRichTextString((String) listInfo.get(i).get("户籍")));
        }
    }

    /**
     * 创建内容单元格
     *
     * @param wb
     *            HSSFWorkbook
     * @param row
     *            HSSFRow
     * @param col
     *            short型的列索引
     * @param align
     *            对齐方式
     * @param val
     *            列值
     */
    public void cteateCell(HSSFWorkbook wb, HSSFRow row, int col, short align,
                           String val,HSSFCellStyle cellstyle ) {
        HSSFCell cell = row.createCell(col);
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(new HSSFRichTextString(val));
        cell.setCellStyle(cellstyle);
    }
    /**
     * 创建合计行
     *
     * @param colSum
     *            需要合并到的列索引
     * @param cellValue
     */
    public void createLastSumRow(int colSum, List<String> list) {
        // 定义单元格格式，添加单元格表样式，并添加到工作簿
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 250);
        cellStyle.setFont(font);
        // 获取工作表最后一行
        HSSFRow lastRow = sheet.createRow((short) (sheet.getLastRowNum() + 1));
        HSSFCell sumCell = lastRow.createCell(0);//创建Excel工作表指定行的单元格

        sumCell.setCellValue(new HSSFRichTextString("合计"));
        sumCell.setCellStyle(cellStyle);
        // 合并 最后一行的第零列-最后一行的第一列
        sheet.addMergedRegion(new Region(sheet.getLastRowNum(), (short) 0,
                sheet.getLastRowNum(), (short) colSum));// 指定合并区域

        for (int i = 2; i < (list.size() + 2); i++) {
            // 定义最后一行的第三列
            sumCell = lastRow.createCell(i);
            sumCell.setCellStyle(cellStyle);
            // 定义数组 从0开始。
            sumCell.setCellValue(new HSSFRichTextString(list.get(i-2)));
        }
    }
    /**
     * 输入EXCEL文件
     *
     * @param fileName
     *            文件名
     */
    public void outputExcel(String fileName) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(fileName));
            wb.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public HSSFWorkbook getWb() {
        return wb;
    }
    public void setWb(HSSFWorkbook wb) {
        this.wb = wb;
    }
    public HSSFSheet getSheet() {
        return sheet;
    }
    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }
}
