package Model;

public class K210Upload {
    private double[][] ifmap;
    private double[][] PWWeight;
    private double[][] Weight;
    private int PaddingNumber;

    public K210Upload(double[][] ifmap, double[][] PWWeight, double[][] weight, int PaddingNumber) throws Exception {
        this.ifmap = ifmap;
        this.PWWeight = PWWeight;
        this.Weight = weight;
        this.PaddingNumber = PaddingNumber;
        if(PWWeight.length!= PWWeight[0].length||PWWeight.length!=1){
            throw new Exception("PW卷积核输入错误");
        } else if (Weight.length!= Weight[0].length||Weight.length!=3) {
            throw new Exception("3X3卷积的卷积核输入错误");
        } else if (PaddingNumber < 0) {
            throw new Exception("PaddingNumber输入错误");
        }
    }

    public double[][] getIfmap() {
        return ifmap;
    }

    public void setIfmap(double[][] ifmap) {
        this.ifmap = ifmap;
    }

    public int getPaddingNumber() {
        return PaddingNumber;
    }

    public void setPaddingNumber(int paddingNumber) {
        PaddingNumber = paddingNumber;
    }

    public double[][] getPWWeight() {
        return PWWeight;
    }

    public void setPWWeight(double[][] PWWeight) {
        this.PWWeight = PWWeight;
    }

    public double[][] getWeight() {
        return Weight;
    }

    public void setWeight(double[][] weight) {
        Weight = weight;
    }
}
