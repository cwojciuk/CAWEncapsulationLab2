/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ninja
 */
public class Parts {
    private String partDesc;
    private double partPrice;
    private String partNo;
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        //Validation Required
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        //Validation Required
        this.partPrice = partPrice;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        //Validation Required
        this.partNo = partNo;
    }

    public String[] getPartNums() {
        return partNums;
    }

    public void setPartNums(String partNo,int emptyRow) {
        //Validation Required
        partNums[emptyRow] = partNo;
    }

    public String[] getPartDescs() {
        return partDescs;
    }

    public void setPartDescs(String partDesc, int emptyRow) {
        //Validation Required
        partDescs[emptyRow] = partDesc;
    }

    public double[] getPartPrices() {
        return partPrices;
    }

    public void setPartPrices(double partPrice, int emptyRow) {
        //Validation Required
        partPrices[emptyRow] = partPrice;
    }
    
    
}
