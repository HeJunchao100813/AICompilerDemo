package Model;

public class K210AddPadding {
    public static double[][] simulatorAddPadding(double[][] input,int PaddingNumber) throws Exception {
        return K210Kernels.addPadding(input,PaddingNumber);
    }
}
