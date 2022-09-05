package test;

import Model.K210Conv2d;
import org.junit.Test;

public class MoblieNetV1 {
    double[][] PWweight = {{1}};
    double[][] Weight = {
            {1,2,3},
            {2,3,4},
            {3,4,5}
    };
    double[][] ifmap = {
            {1,2,3,4,5},
            {2,3,4,5,6},
            {3,4,5,6,7},
            {4,5,6,7,8},
            {5,6,7,8,9}
    };
    int PaddingNumber1 = 0;
    int PaddingNumber2 = 1;
    double[][] psum;
    double[][] result;

    @Test
    public void Simulator() throws Exception {
//        DW卷积
        psum = K210Conv2d.SimulatorConv2d(ifmap,Weight);
//        PW卷积
        result = K210Conv2d.SimulatorPWConv2d(psum,PWweight);
    }
}
