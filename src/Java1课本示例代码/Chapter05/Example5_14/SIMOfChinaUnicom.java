package Java1课本示例代码.Chapter05.Example5_14;

public class SIMOfChinaUnicom extends SIM {
    String number;

    @Override
    public void setNumber(String n) {
        number = n;
    }

    @Override
    public String giveNumber() {
        return number;
    }

    @Override
    public String getCorpName() {
        return "中国联通";
    }
}
