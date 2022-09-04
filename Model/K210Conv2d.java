package Model;

public class K210Conv2d {
    public static double[][] SimulatorPWConv2d(double[][] input,double[][] input1) throws Exception {
        return K210Kernels.PWConv2d(input,input1);
    }

    public static double[][] SimulatorConv2d(double[][] input,double[][] input1) throws Exception {
        return K210Kernels.Conv2d(input,input1);
    }

}
