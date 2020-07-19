package com.javatpoint.controller.covid19;

public class TestedData {

    private double individualstestedperconfirmedcase ;
    private String positivecasesfromsamplesreported ;
    private String samplereportedtoday ;
    private String source ;
    private String source1 ;
    private String testedasof ;
    private String testpositivityrate ;
    private String testsconductedbyprivatelabs ;
    private double testsperconfirmedcase ;
    private int  testspermillion ;
    private int totalindividualstested ;
    private int totalpositivecases ;
    private int totalsamplestested ;
    private String updatetimestamp ;

    public TestedData() {
    }

    public TestedData(double individualstestedperconfirmedcase, String positivecasesfromsamplesreported, String samplereportedtoday, String source, String source1, String testedasof, String testpositivityrate, String testsconductedbyprivatelabs, double testsperconfirmedcase, int testspermillion, int totalindividualstested, int totalpositivecases, int totalsamplestested, String updatetimestamp) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.source1 = source1;
        this.testedasof = testedasof;
        this.testpositivityrate = testpositivityrate;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.testsperconfirmedcase = testsperconfirmedcase;
        this.testspermillion = testspermillion;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    public double getIndividualstestedperconfirmedcase() {
        return individualstestedperconfirmedcase;
    }

    public void setIndividualstestedperconfirmedcase(double individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getTestedasof() {
        return testedasof;
    }

    public void setTestedasof(String testedasof) {
        this.testedasof = testedasof;
    }

    public String getTestpositivityrate() {
        return testpositivityrate;
    }

    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    public double getTestsperconfirmedcase() {
        return testsperconfirmedcase;
    }

    public void setTestsperconfirmedcase(double testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    public int getTestspermillion() {
        return testspermillion;
    }

    public void setTestspermillion(int testspermillion) {
        this.testspermillion = testspermillion;
    }

    public int getTotalindividualstested() {
        return totalindividualstested;
    }

    public void setTotalindividualstested(int totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    public int getTotalpositivecases() {
        return totalpositivecases;
    }

    public void setTotalpositivecases(int totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    public int getTotalsamplestested() {
        return totalsamplestested;
    }

    public void setTotalsamplestested(int totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    @Override
    public String toString() {
        return "TestedData{" +
                "individualstestedperconfirmedcase=" + individualstestedperconfirmedcase +
                ", positivecasesfromsamplesreported='" + positivecasesfromsamplesreported + '\'' +
                ", samplereportedtoday='" + samplereportedtoday + '\'' +
                ", source='" + source + '\'' +
                ", source1='" + source1 + '\'' +
                ", testedasof='" + testedasof + '\'' +
                ", testpositivityrate='" + testpositivityrate + '\'' +
                ", testsconductedbyprivatelabs='" + testsconductedbyprivatelabs + '\'' +
                ", testsperconfirmedcase=" + testsperconfirmedcase +
                ", testspermillion=" + testspermillion +
                ", totalindividualstested=" + totalindividualstested +
                ", totalpositivecases=" + totalpositivecases +
                ", totalsamplestested=" + totalsamplestested +
                ", updatetimestamp='" + updatetimestamp + '\'' +
                '}';
    }
}
