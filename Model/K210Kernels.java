package Model;

public class K210Kernels {
    public static double[][] PWConv2d(double[][] input1,double[][] input2) throws Exception {
        if(input2.length!=1||input2.length!=input2[0].length){
            throw new Exception("输入不合法！");
        }
        double[][] psum = new double[input1.length][input1[0].length];
        double kernel = input2[0][0];
        for (int i = 0; i < psum.length; i++) {
            for (int j = 0; j < psum[0].length; j++) {
                psum[i][j] = input1[i][j]*kernel;
            }
        }
        return psum;
    }

    public static double[][] Conv2d(double[][] input1,double[][] input2) throws Exception{
        if(input2.length!=3||input2.length!=input2[0].length ||input1.length<3
                ||input1[0].length<3){
            throw new Exception("输入不合法！");
        }
        double[][] psum = new double[input1.length-input2.length+1][input1[0].length-input2[0].length+1];
        for (int i = 0; i < psum.length; i++) {
            for (int j = 0; j < psum[0].length; j++) {
                for (int k = 0; k < input2.length; k++) {
                    for (int l = 0; l < input2.length; l++) {
                        psum[k][l]+=input1[k+i][l+j]*input2[k][l];
                    }
                }
            }
        }
        return psum;
    }

    public static double[][] addPadding(double[][] input,int num) throws Exception {
        if(input==null){
            throw new Exception("输入不合法");
        }
        double[][] addPadResult = new double[input.length+num*2][input[0].length+num*2];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                addPadResult[i+num][j+num]=input[i][j];
            }
        }
        return addPadResult;
    }

    public static double[][] RemovePadding(double[][] input,int num) throws Exception {
        if(input.length-num*2<=0){
            throw new Exception("输入不合法");
        }
        double[][] removePadResult = new double[input.length-num*2][input[0].length-num*2];
        for (int i = 0; i < removePadResult.length; i++) {
            for (int j = 0; j < removePadResult[0].length; j++) {
                removePadResult[i][j]=input[i+num][j+num];
            }
        }
        return removePadResult;
    }
}
