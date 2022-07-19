package com.tw;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(!isValid(start,end)) return null;

        return generateTable(start,end);
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start)&&isInRange(end)&&isStartNotBiggerThanEnd(start,end);
    }

    public Boolean isInRange(int number) {
        return number>=1&&number<=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        List<String> Lines=new ArrayList<>();
        for(int i=start;i<=end;i++){
            Lines.add(generateLine(start,i));
        }
        return String.join(System.lineSeparator(),Lines);
    }

    public String generateLine(int start, int row) {
        List<String> expressions=new ArrayList<>();
        for(int i=start;i<=row;i++){
            expressions.add(generateSingleExpression(i,row));
        }
        return String.join("  ",expressions);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int result=multiplicand*multiplier;
        return multiplicand+"*"+multiplier+"="+result;
    }
}
