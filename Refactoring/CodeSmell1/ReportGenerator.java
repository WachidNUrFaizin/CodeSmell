package com.mycompany.codesmell1;

import java.util.List;

public class ReportGenerator {
    
    private static final String HEADER = "Report Header";
    private static final String FOOTER = "Footer Information";
    private static final String GENERATED_BY = "Generated by XYZ System";
    
    private ReportPrinter printer;
    
    public ReportGenerator(ReportPrinter printer) {
        this.printer = printer;
    }
    
    public void generateReport(List<String> data) {
        printHeader();
        printData(data);
        printFooter();
    }
    
    private void printHeader() {
        printer.print(HEADER);
    }
    
    private void printData(List<String> data) {
        for (String item : data) {
            printer.print("Item: " + item);
        }
    }
    
    private void printFooter() {
        printer.print(FOOTER);
        printer.print(GENERATED_BY);
    }
}

