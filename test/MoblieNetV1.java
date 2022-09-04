package test;

import Model.K210Conv2d;

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

    //PW卷积;
}
