package Model;

public class K210RemovePadding {
    public static double[][] simulatorRemovePadding(double[][] input,int PaddingNumber) throws Exception {
        return K210Kernels.RemovePadding(input,PaddingNumber);
    }
}
